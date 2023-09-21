/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_propuesto_grados;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio_Propuesto_Grados {

    public static void main(String[] args) {
        //Conversión Centígrados a Fahrenheim;
        Scanner teclado = new Scanner(System.in);
        float tempCentigrados, tempFahrenheim;

        //Introducción de temperaturas
        System.out.println("Introduce la temperatura en grados Centígrados: ");
        tempCentigrados = teclado.nextFloat();

        //Convertimos mediante fórmula a grados Fahrenehim
        tempFahrenheim = 32 + (9 * tempCentigrados / 5);
        //Muestro resultados
        System.out.printf("La temperatura en grados centígrados: %.1fº \n"
                + "La temperatura en grados Fahrenheim: %.1f F ", tempCentigrados, tempFahrenheim);

    }
}
