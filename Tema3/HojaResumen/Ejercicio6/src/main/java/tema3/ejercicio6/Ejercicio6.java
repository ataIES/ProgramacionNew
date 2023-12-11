/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        String cadena = "";
        System.out.println("Introduce un número para saber si es primo: ");
        num = teclado.nextInt();
        cadena = esPrimo(num) == true ? "Es primo" : "No es primo";
        System.out.println(cadena);
    }

    public static boolean esPrimo(int num) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != num)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
