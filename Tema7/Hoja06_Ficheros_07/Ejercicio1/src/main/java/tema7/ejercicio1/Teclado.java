/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

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

    public static double introDouble(String mensaje) {
        double importe = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                importe = new Scanner(System.in).nextDouble();
                if (importe > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, el importe debe ser mayor que 0");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return importe;
    }

    public static boolean introBoolean(String mensaje) {
        String opcion = "";
        boolean result = false;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                opcion = new Scanner(System.in).nextLine();
                if (opcion.equalsIgnoreCase("Si")) {
                    result = true;
                    valido = true;
                } else if (opcion.equalsIgnoreCase("No")) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, opción incorrecta");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
