/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Validacion {

    public static int validarHora() {
        boolean valido = true;
        int hora = 0;
        while (!valido) {
            try {
                System.out.println("Introduce una hora: ");
                hora = new Scanner(System.in).nextInt();
                if (validarRangoHora(hora)) {
                    System.out.println("Hora válida");
                    valido = true;
                } else {
                    throw new IOException("Error, hora debe estar entre [0-23]");
                }
            } catch (InputMismatchException i) {
                System.err.println("Error, has introducido caracteres");
            } catch (IOException io) {
                System.err.println(io.getMessage());
            }
        }
        return hora;
    }

    public static int validarMinuto() {
        boolean valido = true;
        int minuto = 0;
        while (!valido) {
            try {
                System.out.println("Introduce unos minutos: ");
                minuto = new Scanner(System.in).nextInt();
                if (validarRangoMinutos(minuto)) {
                    System.out.println("Minutos válidos");
                    valido = true;
                } else {
                    throw new IOException("Error, minutos debe estar entre [0-59]");
                }
            } catch (InputMismatchException i) {
                System.err.println("Error, has introducido caracteres");
            } catch (IOException io) {
                System.err.println(io.getMessage());
            }
        }
        return minuto;
    }

    public static boolean validarRangoHora(int hora) {
        return hora >= 0 && hora <= 23;
    }

    public static boolean validarRangoMinutos(int minutos) {
        return minutos >= 0 && minutos <= 59;
    }
}
