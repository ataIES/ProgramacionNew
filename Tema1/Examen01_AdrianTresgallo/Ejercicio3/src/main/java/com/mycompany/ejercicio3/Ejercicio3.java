/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio3 {

    public enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Tu edad
        byte edad;
        //Nota de un examen
        float nota_examen;
        //El precio en euros de una casa
        double precio_casa;
        //Mayor de edad o no
        boolean mayor_edad;
        //Dia Semana
        DiaSemana dia_semana;
        //Valor del IVA, como es un valor que no va a variar nunca, la pondremos como constante
        final int IVA;

        //Creo una variable de tipo double para realizar el cálculo del precio de la casa con IVA
        double precio_final;

        //Introducción de datos por teclado
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextByte();

        System.out.println("Introduce la nota del examen: ");
        nota_examen = teclado.nextFloat();

        System.out.println("Introduce el precio de la casa: ");
        precio_casa = teclado.nextDouble();

        System.out.println("¿Eres mayor de edad?: ");
        mayor_edad = teclado.nextBoolean();

        //Asigno el valor de la constante
        IVA = 21;

        //Asigno el valor de dia_semana
        dia_semana = DiaSemana.MARTES;

        //Realizo el cálculo
        precio_final = precio_casa + (precio_casa * (IVA / 100));

        //Muestro datos
        System.out.printf("La variable edad vale %d \nLa variable nota_examen vale %.2f \nLa variable precio_casa vale %.2f euros "
                + "\n¿Es mayor de edad? %b \n¿Qué día es hoy? %s \nEl IVA es: %d"
                + " \nEl precio de la casa con IVA vale %.2f euros", edad, nota_examen, precio_casa, mayor_edad, dia_semana, IVA, precio_final);

    }
}
