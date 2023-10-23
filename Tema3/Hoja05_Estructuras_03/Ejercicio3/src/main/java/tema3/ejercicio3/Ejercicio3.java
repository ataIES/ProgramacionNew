/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas = 0, minutos = 0, segundos = 0;
        /*Introducción de las horas, controlando que cuando introduzcamos una hora fuera del rango
        nos salga un mensaje de error y podamos volver a introducir otro dato
         */

        do {
            System.out.println("Introduce una hora: ");
            horas = teclado.nextInt();
            if (horas > 24 || horas < 0) {
                System.out.println("Hora introducida fuera del rango");
            }

        } while (horas > 24 || horas < 0);

        //Introducción de minutos
        do {
            System.out.println("Introduce unos minutos: ");
            minutos = teclado.nextInt();
            if (minutos > 60 || minutos < 0) {
                System.out.println("Minutos introducidos fuera del rango");
            }
        } while (minutos > 60 || minutos < 0);

        //Introduccion de segundos
        do {
            System.out.println("Introduce los segundos: ");
            segundos = teclado.nextInt();
            if (segundos > 60 || segundos < 0) {
                System.out.println("Segundos introducidos fuera del rango");
            }
        } while (segundos > 60 || segundos < 0);

        //Empezamos a contar cuantas horas, minutos y segundos nos falta para llegar a las 23:59:59
        for (int nhoras = horas; nhoras <= 23; nhoras++) {
            for (int nminutos = minutos; nminutos < 60; nminutos++) {
                for (int nsegundos = segundos; nsegundos < 60; nsegundos++) {
                    System.out.println(nhoras + ":" + nminutos + ":" + nsegundos);
                }
            }
        }

    }
}
