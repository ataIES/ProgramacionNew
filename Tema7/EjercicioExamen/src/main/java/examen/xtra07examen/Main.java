/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen.xtra07examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
         if (args.length != 1) {
            System.out.println("Uso: java PoemaProcessor <nombreFicheroPoema>");
            return;
        }

        String nombreFicheroPoema = args[0];
        String nombreFicheroDatos = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFicheroPoema));
             BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFicheroDatos))) {
             
            int c;
            boolean nuevaLinea = true;
            
            while ((c = br.read()) != -1) {
                if (nuevaLinea && c == '*') {
                    // Ignorar el asterisco al comienzo de una nueva línea
                    //continue;
                }
                
                if (c == '*') {
                    // Iniciar una nueva línea
                    bw.newLine();
                    nuevaLinea = true;
                } else {
                    // Escribir el carácter en el nuevo fichero
                    bw.write(c);
                    nuevaLinea = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Eliminar el fichero original y renombrar el nuevo fichero
        File ficheroPoema = new File(nombreFicheroPoema);
        File ficheroDatos = new File(nombreFicheroDatos);

        if (ficheroPoema.delete()) {
            if (!ficheroDatos.renameTo(ficheroPoema)) {
                System.err.println("Error al renombrar " + nombreFicheroDatos + " a " + nombreFicheroPoema);
            }
        } else {
            System.err.println("Error al eliminar " + nombreFicheroPoema);
        }
    }
}
