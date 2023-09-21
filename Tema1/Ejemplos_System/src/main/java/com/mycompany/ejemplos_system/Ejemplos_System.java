/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplos_system;

/**
 *
 * @author daw1
 */
public class Ejemplos_System {

    public static void main(String[] args) {
        float magnitud = 9.806653f;
        //con System.out.println mete automáticamente después de ejecutarse un salto de línea
        System.out.println("el valor de la magnitud es: " + magnitud);
        //con System.out.printf establece un formato
        System.out.printf("La magnitud vale: %f %n", magnitud);

        System.out.printf("La magnitud vale: %e %n", magnitud);

        System.out.printf("La magnitud vale: %.2f %n", magnitud);

        System.out.printf("La magnitud vale: %+.2f %n", magnitud);

        System.out.printf("La magnitud vale: %6.2f %n", magnitud);

        System.out.printf("La magnitud vale: %,.2f\n", magnitud);

        String nombre = "Adrián", apellido = "Tresgallo";
        float estatura = 1.70f;

        System.out.printf("Mi nombre es %s y mi apellido es %s y mi estatura es %.2f\n", nombre, apellido, estatura);

    }
}
