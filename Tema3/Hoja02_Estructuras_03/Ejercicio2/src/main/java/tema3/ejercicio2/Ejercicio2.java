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
        int num=0;
        num=validarNumero();
        diaSemana(num);
    }

    //Método que valida e introduce un número sea entre 1 y 31
    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número entre 1 y 31: ");
            numero = teclado.nextInt();
            if (numero >= 1 && numero <= 31) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número fuera del intervalo(1-31)");
            }
        } while (!valido);
        return numero;
    }

    //Método que metiendo un número de 1 a 31, siendo 1 Lunes, decir que dia de la semana es
    public static void diaSemana(int num) {
        //Sabiendo que el resto del número introducido entre 7 da un número entre 0 y 6, 0 será Lunes,1 será Martes etc
        switch (num%7) {
            case 0 ->
                System.out.println("Domingo");
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sábado");
        }
    }
}
