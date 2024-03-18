/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class ValidaDatos {

    public static String validaNombre(String cadena) {
        boolean valido = false;
        String nombre = "";
        while (!valido) {
            try {
                System.out.println(cadena);
                nombre = new Scanner(System.in).nextLine();
                if (!nombre.equals("")) {
                    if (nombre.length() >= 3) {
                        for (int i = 0; i < nombre.length(); i++) {
                            if (!Character.isDigit(nombre.charAt(i))) {
                                valido = true;
                            } else {
                                throw new ExcepcionPersonalizada("Error, debe ser solo letras");
                            }
                        }

                    } else {
                        throw new ExcepcionPersonalizada("Error, debe contener más de 3 letras");
                    }
                } else {
                    throw new IOException("Error, no debe de estar vacio");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }

    public static String validarDni(String mensaje) {
        boolean valido = false;
        String dni = "";
        while (!valido) {
            try {
                dni = introducirDNI(mensaje);
                if (validarLetra(dni)) {
                    valido = true;
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (ExcepcionPersonalizada i) {
                System.out.println(i.getMessage());
            }
        }

        if (valido) {
            System.out.println("DNI válido");
        }
        return dni;
    }

    private static String introducirDNI(String mensaje) throws ExcepcionPersonalizada, IOException {
        boolean valido = false;
        String dni = "";
        char letra;
        String digitos;
        while (!valido) {
            System.out.println(mensaje);
            dni = new Scanner(System.in).nextLine();
            if (!dni.equals("")) {
                digitos = dni.substring(0, dni.length() - 1);
                letra = dni.charAt(dni.length() - 1);
                if (dni.length() == 9) {
                    for (int i = 0; i < dni.length() - 1; i++) {
                        if (Character.isDigit(digitos.charAt(i)) && Character.isLetter(letra)) {
                            valido = true;
                        } else {
                            throw new ExcepcionPersonalizada("Error, dni debe ser 8 dígitos y un número");
                        }
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error la longitud debe de ser 9 caracteres");
                }
            } else {
                throw new IOException("Error, el dni no puede ser nulo");
            }
        }
        return dni;
    }

    private static boolean validarLetra(String dni) throws IOException {
        String codigoLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDNI = Integer.parseInt(dni.substring(0, dni.length() - 1));
        int resto = numeroDNI % 23;
        char letra = dni.charAt(dni.length() - 1);
        boolean letraValida = false;

        if (codigoLetra.charAt(resto) == letra) {
            letraValida = true;
        } else {
            throw new IOException("Error, letra incorrecta");
        }

        return letraValida;
    }

}
