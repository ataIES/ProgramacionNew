/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nFilas = 0;
        System.out.println("Introduce el número de filas: ");
        nFilas = teclado.nextInt();

        for (int i = 1; i <= nFilas; i++) {
            if (i % 2 == 0) {
                for (int a = 1; a < 10; a++) {
                    System.out.print(" " + a + " ");
                }
            } else {
                for (int b = 9; b > 0; b--) {
                    System.out.print(" " + b + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
