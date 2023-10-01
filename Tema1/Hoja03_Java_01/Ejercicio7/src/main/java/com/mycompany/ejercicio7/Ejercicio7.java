/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nHormigas,nAranas,nCochinillas;
        final int PATASHORMIGA=6,PATASARANAS=8,PATASCOCHINILLA=14;
        
        //Introduccion de datos
        System.out.println("Introduce el número de hormigas capturadas: ");
        nHormigas=teclado.nextInt();
        System.out.println("Introduce el número de arañas capturadas: ");
        nAranas=teclado.nextInt();
        System.out.println("Introduce el número de cochinillas capturadas: ");
        nCochinillas=teclado.nextInt();
        
        System.out.println("El de hormigas capturadas: "+nHormigas+"\nNúmero de patas: "+(nHormigas*PATASHORMIGA)+""
                + "\nEl de arañas capturadas: "+nAranas+" \nNúmero de patas: "+(nAranas*PATASARANAS)+""
                        + "\nNúmero de Cochinillas capturadas: "+nCochinillas+"\nNúmero de patas: "+(nCochinillas*PATASCOCHINILLA));
        
       
        
        
    }
}
