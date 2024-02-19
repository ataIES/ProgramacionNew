/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int numero = 0, contIntentos = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = validarNumero();
                rango(numero);
                System.out.println("Número de intentos: " + contIntentos);
                valido = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                contIntentos++;
            }
        }
    }

    public static int validarNumero() {
        boolean valido = false;
        int numero = 0;
        while (!valido) {
            try {
                System.out.println("Introduce un número entero: ");
                numero = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException i) {
                System.out.println("Error, no es un número entero");
            }
        }
        return numero;
    }

    public static void rango(int numero) throws Exception {
        if (numero >= 0 && numero <= 100) {
            System.out.println("El número " + numero + " está dentro del rango 0-100");
        } else {
            throw new Exception("Error, el número " + numero + " no se encuentra en el rango 0-100");
        }
    }
}
