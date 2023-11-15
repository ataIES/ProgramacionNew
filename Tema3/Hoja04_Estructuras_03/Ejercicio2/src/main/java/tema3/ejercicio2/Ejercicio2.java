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
        int cantidad_donativos = 0, donado = 0, contador_donativos = 0;
        do {
            cantidad_donativos = validarNumero("Introduce un donativo de una cantidad menor que 600:");
            if (cantidad_donativos <= 600) {
                donado += cantidad_donativos;
                contador_donativos++;
            } else {
                System.out.println("Error, valor del donativo mayor de 600");
            }
            System.out.println("LLevas una cantidad de " + donado + " euros");
        } while (donado < 600);
        System.out.println("Número de donaciones: " + contador_donativos);
    }

    public static int validarNumero(String texto) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println(texto);
            numero = teclado.nextInt();
            if (numero > 0) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (!valido);
        return numero;
    }

}
