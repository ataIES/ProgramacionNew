/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero1, numero2 = 0, division;
        numero1 = validarEntero();
        numero2 = validarEntero();
        try {
            division = numero1 / numero2;
            System.out.println("Resultado de dividir " + numero1 + "/" + numero2 + " es: " + division);
        } catch (ArithmeticException a) {
            System.err.println("Error, division entre 0");
        }
    }

    public static int validarEntero() {
        Scanner teclado = new Scanner(System.in);
        boolean noValido = true;
        int entero = 0;
        while (noValido) {
            try {
                System.out.println("Introduce un número entero: ");
                entero = teclado.nextInt();
                noValido = false;
            } catch (InputMismatchException i) {
                System.err.println("Error, no es un número entero");
                teclado.nextLine();
            }
        }
        return entero;
    }
}
