/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio5 {

    public enum NivelIngles {
        B1, B2, C1
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean licenciado;
        NivelIngles nivel_ingles;
        int numeroNivel;
        boolean pasa_entrevista;
        //Creo una variable del tipo String para formatear el resultado
        String result;

        System.out.println("Introduce si es licenciado: ");
        licenciado = teclado.nextBoolean();
        System.out.println("Introduce el nivel de inglés: 1 es un B1, 2 es un B2, 3 es C1: ");
        numeroNivel = teclado.nextInt();

        //En este ternario me comprueba que si meto un 1 me asigne B1, si meto un 2, me asigne un B2,si meto un 3, me asigna un C1 y ya si meto un número distinto de (1,2,3) me lo deje vacío
        nivel_ingles = (numeroNivel == 1 ? NivelIngles.B1 : (numeroNivel == 2 ? NivelIngles.B2 : (numeroNivel == 3 ? NivelIngles.C1 : null)));
        
        //Creo al condición donde me dirá si el candidato pasa la entrevista, después formateo el resultado para que me salga como me pide el ejercicio
        pasa_entrevista = (licenciado && (nivel_ingles == NivelIngles.B2 || nivel_ingles == NivelIngles.C1)) || (!licenciado && (nivel_ingles == NivelIngles.C1));
        
        result=pasa_entrevista?"Pasa la entrevista":"No pasa la entrevista";
        //Muestro resultados
        System.out.println("El candidato: "+result);
        
        
    }
}
