/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero = 0;
        numero = validarNumero();
        System.out.println(diaSemana(numero));

    }

    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número entre 1 y 7: ");
            numero = teclado.nextInt();
            if (numero >= 1 && numero <= 7) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número fuera del intervalo(1-7)");
            }
        } while (!valido);
        return numero;
    }

    public static String diaSemana(int num) {
        String diaSemana = " ";
        switch (num) {
            case 1 ->
                diaSemana = "Lunes";
            case 2 ->
                diaSemana = "Martes";
            case 3 ->
                diaSemana = "Miercoles";
            case 4 ->
                diaSemana = "Jueves";
            case 5 ->
                diaSemana = "Viernes";
            case 6 ->
                diaSemana = "Sábado";
            case 7 ->
                diaSemana = "Domingo";
        }
        return diaSemana;
    }
}
