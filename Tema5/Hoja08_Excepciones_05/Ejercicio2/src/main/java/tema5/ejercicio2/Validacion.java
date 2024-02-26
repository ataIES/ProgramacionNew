/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Validacion {

    public static int validarEdad(String mensaje) {
        int edad = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                edad = new Scanner(System.in).nextInt();
                valido = true;
            } catch (PersonaException p) {
                p.getMessage();
            }
        }
        return edad;
    }

    public static EstadoCivil validarEstadoCivil(String mensaje) {
        boolean valido = false;
        EstadoCivil estado = null;
        String opc = "";
        while (!valido) {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextLine();
                switch (opc) {
                    case "casado" -> {
                        estado = EstadoCivil.CASADO;
                        valido = true;
                    }
                    case "soltero" -> {
                        estado = EstadoCivil.SOLTERO;
                        valido = true;
                    }
                    default -> {
                        throw new Exception("Error, Estado Civil incorrecto");
                    }
                }
            } catch (IOException i) {
                System.err.println("Error, has introducido números");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return estado;
    }
}
