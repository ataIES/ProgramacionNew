/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        Recursividad recu = new Recursividad();
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println("---Obtener factorial de " + numero + " ----");
        System.out.println(recu.factorial(numero));
        System.out.println("");
        System.out.println("---Obtener suma todos los números de " + numero + " ---");
        System.out.println(recu.sumaSusNumeros(numero));
        System.out.println("");
        System.out.println("---Imprimir números de 1 hasta " + numero + " ---");
        System.out.println(recu.imprimeNumeros(numero));
        System.out.println("");
        System.out.println("---Número de dígitos de " + numero + " ---");
        System.out.println(recu.numeroDigitos(numero));

    }
}
