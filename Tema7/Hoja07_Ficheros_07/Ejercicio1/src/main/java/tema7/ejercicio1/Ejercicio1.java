/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema7.ejercicio1;

import java.io.File;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        if (args.length != 2) {
            String entrada = args[0];
            String salida = args[1];
            File ficheroEntrada = new File(entrada);
            File ficheroSalida = new File(salida);
            validarFicheros(ficheroEntrada, ficheroSalida);
        }
    }

    public static void validarFicheros(File entrada, File salida) {
        if (entrada.exists()) {
            System.out.println("Existe el fichero " + entrada.getName());
            if (!salida.exists()) {
                System.out.println("El fichero " + salida.getName() + " no existe");
            } else {
                System.out.println("Error, existe el fichero " + salida.getName());
            }
        } else {
            System.out.println("Error, No existe el fichero " + entrada.getName());
        }
    }
}
