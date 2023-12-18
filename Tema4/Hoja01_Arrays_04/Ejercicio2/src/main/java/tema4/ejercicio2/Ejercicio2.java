/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperaturas[] = new double[10];
        double suma = 0;
        String cadena = "";
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce la temperatura " + (i + 1) + ":");
            temperaturas[i] = teclado.nextDouble();
            suma += temperaturas[i];
            //Añado a la cadena las temperaturas para mostrarlas luego
            cadena += String.format("%.1f", temperaturas[i]) + "ºC ";
        }
        System.out.println("Temperaturas: " + cadena);
        System.out.printf("Media de las temperaturas: %.1fºC", suma / temperaturas.length);

    }
}
