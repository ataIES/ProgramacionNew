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

    public static int introNota(String mensaje) {
        int nota = 0;
        boolean valido = false;
        try {
            System.out.println(mensaje);
            nota = new Scanner(System.in).nextInt();
            if (nota > 0 && nota < 11) {
                valido = true;
            } else {
                throw new Exception("Error, la nota debe ser entre 0 y 10");
            }
        } catch (InputMismatchException i) {
            System.out.println("Error, introduce números enteros");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nota;
    }
}
