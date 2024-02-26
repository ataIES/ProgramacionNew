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
   

//Metodo que valida la nota

    public static int validarNota(String mensaje) {
        int nota = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                nota = new Scanner(System.in).nextInt();
                if (nota >= 0 && nota <= 10) {
                    valido = true;
                } else {
                    throw new IOException("Error, la nota no está en el intervalo [0-10]");
                }
            } catch (InputMismatchException i) {
                System.err.println("Error, has introducido caracteres");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return nota;
    }
   
}
