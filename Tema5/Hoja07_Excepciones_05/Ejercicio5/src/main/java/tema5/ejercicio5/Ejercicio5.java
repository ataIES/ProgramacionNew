/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        boolean valido = false;
        int dividendo = 0, divisor = 0;
        while (!valido) {
            try {
                dividendo = validarNumero("Introduce el dividendo: ");
                divisor = validarNumero("Introduce el divisor: ");
                System.out.printf("%d/%d = %d", dividendo, divisor, dividir(dividendo, divisor));
                valido=true;
            } catch (InputMismatchException i) {
                System.err.println("Error, no has introducido un número");
            } catch (ArithmeticException a) {
                System.err.println("Error, división entre 0");
            }
        }
    }
//Metodo que calcula la division
    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }
//Metodo que valida un número
    public static int validarNumero(String cadena) throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        System.out.println(cadena);
        return teclado.nextInt();
    }
}
