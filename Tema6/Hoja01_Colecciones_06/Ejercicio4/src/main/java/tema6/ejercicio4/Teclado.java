/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Teclado {

    //Metodo que valida las cadenas de texto
    public static String validarCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = teclado.nextLine();
                if (!cadena.equals("")) {
                    valido = true;
                } else {
                    throw new MiExcepcion("Error, no puede estar vacío");
                }
            } catch (MiExcepcion m) {
                System.out.println(m.getMessage());
            } 
        }
        return cadena;
    }

    //Metodo que valida los enteros sin que se pueda introducir negativos
    public static int validarEntero(String mensaje) {
        int entero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                entero =new Scanner(System.in).nextInt();
                if (entero >= 0) {
                    valido = true;
                } else {
                    throw new MiExcepcion("Error, has introducido números negativos");
                    
                }
            } catch (MiExcepcion m) {
                System.out.println(m.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return entero;
    }
}
