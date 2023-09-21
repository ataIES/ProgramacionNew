/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //Conversor de euros a pesetas
        double euros,pesetas;
        //Pido por teclado los datos
        System.out.println("Introduce un valor en euros: ");
        euros=teclado.nextDouble();
        
        //Convierto los euros a pesetas
        pesetas=euros*166.386;
        //Muestro por pantalla los valores
        System.out.printf("Valor en euros: ");
    }
}
