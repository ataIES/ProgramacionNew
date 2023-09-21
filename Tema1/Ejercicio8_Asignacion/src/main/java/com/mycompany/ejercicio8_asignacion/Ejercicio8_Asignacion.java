/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio8_asignacion;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio8_Asignacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float kgManzanas1, kgPeras1, ingresos1, kgManzanas2, kgPeras2, ingresos2, beneficioAnual;
        final float PRECIOMANZANAS = 2.35f;
        final float PRECIOPERAS = 1.95f;
        //Introduzco los datos por teclado mediante Scanner
        System.out.println("Introduce los kilos de manzanas del primer semestre: ");
        kgManzanas1 = teclado.nextFloat();

        System.out.println("Introduce los kilos de peras del primer semestre: ");
        kgPeras1 = teclado.nextFloat();

        System.out.println("Introduce los kilos de manzanas del segundo semestre: ");
        kgManzanas2 = teclado.nextFloat();

        System.out.println("Introduce los kilos de peras del segundo semestre: ");
        kgPeras2 = teclado.nextFloat();

        //Cálculo de los ingresos por semestres
        ingresos1 = (kgManzanas1 *= PRECIOMANZANAS) + (kgPeras1 *= PRECIOPERAS);
        ingresos2 = (kgManzanas2 *= PRECIOMANZANAS) + (kgPeras2 *= PRECIOPERAS);

        //Cálculo beneficios anuales
        beneficioAnual = ingresos1 + ingresos2;
        System.out.println(" ");
        //Muestro los resultados de los ingresos de los dos semestres con el ingreso anual
        System.out.printf("Los ingresos del primer semestre son: %.2f euros \nLos ingresos del segundo semestre son: %.2f euros "
                + "\nEl beneficio anual es: %.2f euros", ingresos1, ingresos2, beneficioAnual);
    }
}
