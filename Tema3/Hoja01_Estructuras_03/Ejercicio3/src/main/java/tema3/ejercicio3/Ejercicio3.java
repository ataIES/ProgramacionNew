/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int minutos = 0, segundos = 0;
        minutos = validarMinutos();
        segundos = validarSegundos();
        Llamada llamada = new Llamada();
        System.out.printf("Duración de la llamada %d:%d \nPrecio a pagar: %.2f", minutos, segundos, llamada.aPagar(minutos, segundos));

    }

    //Metodos estáticos para introducir datos y validar los datos que sean mayores que 0
    public static int validarMinutos() {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int minutos = 0;
        System.out.println("Introduce los minutos: ");
        minutos = teclado.nextInt();
        do {
            if (minutos > 0) {
                valido = true;
            } else {
                System.out.println("Error, debes introducir un número mayor que 0");

                System.out.println("Introduce los minutos: ");
                minutos = teclado.nextInt();
            }
        } while (valido);
        return minutos;
    }

    public static int validarSegundos() {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int segundos = 0;
        System.out.println("Introduce los minutos: ");
        segundos = teclado.nextInt();
        do {
            if (segundos > 0) {
                valido = true;
            } else {
                System.out.println("Error, debes introducir un número mayor que 0");

                System.out.println("Introduce los minutos: ");
                segundos = teclado.nextInt();
            }
            
        } while (valido);
        return segundos;
    }
}
