/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, a, b, c,y;
        boolean pertenece;
        
        //Introdución de datos
        System.out.println("Introduce el valor de x: ");
        x = teclado.nextDouble();
        System.out.println("Introduce el valor de a: ");
        a=teclado.nextDouble();
        System.out.println("Introduce el valor de b: ");
        b=teclado.nextDouble();
        System.out.println("Introduce el valor de c: ");
        c=teclado.nextDouble();
        y=0;
        
        //Cálculo de y en el polinomio de segundo grado
        pertenece=(y==(a*Math.pow(a, 2))+(b*x)+c)?true:false;
        y=(a*Math.pow(a, 2))+(b*x)+c;
        System.out.printf("---Cálculo del Polinomio de Segundo Grado--- \nValor de a: %.2f "
                + "\nValor de b: %.2f \nValor de c: %.2f \nValor de x: %.2f \nValor de y: %.2f",a,b,c,x,y);
        System.out.printf("\nEl par de valores x= %f, y= %f verifica el polinomio %b",x,y,pertenece);
    }
}
