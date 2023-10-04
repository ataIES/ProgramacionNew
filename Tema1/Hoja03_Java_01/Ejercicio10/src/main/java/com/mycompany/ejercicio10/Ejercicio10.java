/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lanzamientoMetros;
        double lanzamientoCentimetros;

        System.out.println("Introduce la longitud en metros de un lanzamiento: ");
        lanzamientoMetros = teclado.nextFloat();

        lanzamientoCentimetros = lanzamientoMetros * 100;

        System.out.printf("Lanzamiento en metros: %f \nLanzamiento en centímetros: %.0f", lanzamientoMetros, Math.floor(lanzamientoCentimetros));

    }
}
