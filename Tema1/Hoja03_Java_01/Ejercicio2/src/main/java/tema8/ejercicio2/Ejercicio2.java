/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema8.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0, valor = 0;
        //Introduzco el valor del número
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        valor = (num % 7 == 0) ? 0: 7- num%7;
        System.out.println("Para " + num + " hay que sumarle " + valor + " para que el resultado sea múltiplo de 7");

    }
}
