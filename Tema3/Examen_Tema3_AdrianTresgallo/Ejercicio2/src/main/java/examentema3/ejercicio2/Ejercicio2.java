/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        double saldo = 0, cantidadApostar = 0;
        int numeroApuesta = 0, numeroAleatorio = 0;
        String opc = "";
        System.out.println("Introduce tu saldo inicial: ");
        saldo = teclado.nextDouble();
        System.out.printf("Bienvenido al Juego de la Ruleta. Tu saldo inicial es de %.2f€ \n", saldo);
        do {
            numeroAleatorio = (int) Math.floor(Math.random() * 36);
            //Lo muestro para probar cuando acierto y cuando fallo
            System.out.println("Numero aleatorio: "+numeroAleatorio);
            cantidadApostar = validarCantidadApuesta(saldo);
            numeroApuesta = validarNumeroApuesta();
            if (numeroAleatorio == numeroApuesta) {
                cantidadApostar *= 35;
                saldo += cantidadApostar;
                System.out.printf("Has ganado. Ganastes %.2f€ \nResultado de la ruleta:%d ", cantidadApostar, numeroAleatorio);
                System.out.printf("Saldo Actual: %.2f€\n", saldo);
            } else {
                saldo -= cantidadApostar;
                System.out.printf("Lo siento, has perdido. Perdistes %.2f€ \nResultado de la ruleta:%d \nSaldo Actual: %.2f€\n", cantidadApostar, numeroAleatorio, saldo);
            }
            System.out.println("¿Quieres continuar? (S/N)");
            opc = new Scanner(System.in).nextLine();
            if (opc.equalsIgnoreCase("no") || opc.equalsIgnoreCase("n")) {
                salir = true;
            }

        } while (!salir);
        System.out.printf("Gracias por jugar. Tu saldo es %.2f€", saldo);
    }

//Método para validar que introducimos un número entre 0 y 36
    public static int validarNumeroApuesta() {
        Scanner teclado = new Scanner(System.in);
        int nApuesta = -1;
        boolean valido = false;
        do {
            System.out.println("Introduce a que número vas a apostar: (0-36)");
            nApuesta = teclado.nextInt();
            if (nApuesta >= 0 && nApuesta <= 36) {
                valido = true;
            } else {
                System.out.println("Error, solo puedes apostar a números entre 0 y 36");
            }
        } while (!valido);
        return nApuesta;
    }
//Metodo para validar que la apuesta no sea mayor que el saldo que tenemos y que tampoco sea negativo

    public static double validarCantidadApuesta(double saldo) {
        Scanner teclado = new Scanner(System.in);
        double cantidadApuesta = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce la cantidad a apostar: ");
            cantidadApuesta = teclado.nextDouble();
            if (cantidadApuesta > 0 && cantidadApuesta <= saldo) {
                valido = true;
            } else {
                System.out.println("Error,cantidad a apostar errónea");
            }
        } while (!valido);
        return cantidadApuesta;
    }
}
