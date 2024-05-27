/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

    public static String introNombre(String mensaje) {
        String nombre = "";
        String condicion = "^[A-ZÁÉÍÓÚ]{1}[a-záéíóú]*$";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                nombre = new Scanner(System.in).nextLine();
                if (nombre.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(nombre, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            }

        }
        return nombre;
    }

    public static String introTelefono(String mensaje) {
        boolean valido = false;
        String tlf = "";
        String condicion = "^[0-9]{9}$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                tlf = new Scanner(System.in).nextLine();
                if (tlf.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(tlf, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println(p.getMessage());
            }
        }
        return tlf;
    }

    public static int introEntero(String mensaje) {
        int entero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                entero = new Scanner(System.in).nextInt();
                if (entero > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, no puede ser un número negativo");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce número enteros");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return entero;
    }
}
