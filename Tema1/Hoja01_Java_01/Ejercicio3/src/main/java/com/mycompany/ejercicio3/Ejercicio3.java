/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        short x = 7;
        int y = 5;
        //Falta poner f al final cuando el tipo de dato es float
        float f1 = 13.5f;
        float f2 = 8f;
        //Cuando es un println tenemos que concatenar con un + , no con una ,
        System.out.println("El valor de x es " + x + " y el valor de y es " + y);
        //Para terminar una línea de código tenemos que cerrar con un ;
        System.out.println("El resultado de x + y es " + (x + y));
        System.out.println("El resultado de x - y es " + (x - y));
        System.out.printf(" División entera:", "x / y = %s", (x / y));
        System.out.println("Resto de la división entera: x % y = " + (x % y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n", f1, f2);
        //Para terminar una línea de código tenemos que cerrar con un ;
        System.out.println("El resultado de f1 / f2 es " + (f1 / f2));
    }
}
