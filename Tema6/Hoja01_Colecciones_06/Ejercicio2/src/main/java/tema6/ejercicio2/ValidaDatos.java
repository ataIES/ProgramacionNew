/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class ValidaDatos {

    public static String validarNombre() {
        String nombre = "";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el nombre: ");
                nombre = new Scanner(System.in).nextLine();
                if (!nombre.equals("")) {
                    valido = true;
                } else {
                    throw new IOException("Error, no puedes dejar el nombre vacío");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
        return nombre;
    }

    private static int validarDia() {
        boolean valido = false;
        int dia = 0;
        while (!valido) {
            try {
                System.out.println("Introduce el día: ");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia < 32) {
                    valido = true;
                } else {
                    throw new IOException("Error, el dia debe ser 1-31");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return dia;
    }

    private static int validarMes() {
        boolean valido = false;
        int mes = 0;
        while (!valido) {
            try {
                System.out.println("Introduce el mes: ");
                mes = new Scanner(System.in).nextInt();
                if (mes > 0 && mes < 13) {
                    valido = true;
                } else {
                    throw new IOException("Error, el mes debe ser 1-12");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return mes;
    }

    private static int validarAnio() {
        boolean valido = false;
        int anio = 0;
        int anioActual = LocalDate.now().getYear();
        while (!valido) {
            try {
                System.out.println("Introduce el año: ");
                anio = new Scanner(System.in).nextInt();
                if (anio >= 1950 && anio <= anioActual) {
                    valido = true;
                } else {
                    throw new IOException("Error, el mes debe ser 1950 hasta " + anioActual);
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return anio;
    }

    public static LocalDate validarFecha() {
        int dia = validarDia();
        int mes = validarMes();
        int anio = validarAnio();
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        return fecha;
    }

    public static String validarDni() {
        boolean valido = false;
        String dni = "";
        while (!valido) {
            try {
                dni = introducirDNI();
                if (validarLetra(dni)) {
                    valido = true;
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (Exception i) {
                System.out.println(i.getMessage());
            }
        }

        if (valido) {
            System.out.println("DNI válido");
        }
        return dni;
    }

    private static String introducirDNI() throws Exception, IOException {
        boolean valido = false;
        String dni = "";
        char letra;
        String digitos;
        while (!valido) {
            System.out.println("Introduce su dni: ");
            dni = new Scanner(System.in).nextLine();
            if (!dni.equals("")) {
                digitos = dni.substring(0, dni.length() - 1);
                letra = dni.charAt(dni.length() - 1);
                if (dni.length() == 9) {
                    for (int i = 0; i < dni.length() - 1; i++) {
                        if (Character.isDigit(digitos.charAt(i)) && Character.isLetter(letra)) {
                            valido = true;
                        } else {
                            throw new Exception("Error, dni debe ser 8 dígitos y un número");
                        }
                    }
                } else {
                    throw new Exception("Error la longitud debe de ser 9 caracteres");
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
