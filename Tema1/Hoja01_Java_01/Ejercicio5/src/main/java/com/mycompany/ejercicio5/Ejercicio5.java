/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1, num2;
        float suma, resta, multiplicacion, division;

        //Pido los valores por teclado
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextFloat();

        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextFloat();
        //Cálculo suma,resta,multiplicación y división
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        //Muestro resultados
        System.out.println("x= " + num1 + " y= " + num2 + "\nx + y= " + suma + "\nx - y= " + resta
                + "\nx * y= " + multiplicacion + "\nx / y= " + division + "\nx^2= " + Math.pow(num1, 2) + "\nRaíz cuadrada de x=" + Math.sqrt(num1));

        //Con printf mostrando un decimal
        System.out.printf("x= %.1f y= %.1f \nx + y= %.1f \nx - y= %.1f \nx * y= %.1f \nx / y= %.1f"
                + "\nx^2= %.1f \nRaíz cuadrada de x= %.1f", num1, num2, suma, resta, multiplicacion, division, Math.pow(num1, 2), Math.sqrt(num1));
    }
}
