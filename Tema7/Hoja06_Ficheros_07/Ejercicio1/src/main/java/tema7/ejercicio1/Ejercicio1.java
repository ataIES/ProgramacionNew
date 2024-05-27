/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema7.ejercicio1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File fichero = new File("Facturas.dat");
        int opc = 0;
        do {
            menu();
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 -> MetodosFichero.escribirFactura(fichero);
                
                case 2->MetodosFichero.leerFacturas(fichero);
                
                case 3->MetodosFichero.eliminarFichero(fichero);
                
                case 4->System.out.println("Saliendo...");
                
                default->System.out.println("Error, opción incorrecta");
            }
            
        } while (opc != 4);

    }

    public static void menu() {
        System.out.printf("\n\t---Menú de Opciones Facturas---"
                + "\n1.Escribir al factura en un fichero"
                + "\n2.Listar Morosos"
                + "\n3.Borrar fichero"
                + "\n4.Salir"
                + "\nEscribe una opción: ");
    }
}
