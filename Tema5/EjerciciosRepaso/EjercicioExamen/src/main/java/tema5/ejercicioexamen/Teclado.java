/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Teclado {
     //Metodo static que valida los String
    public static String validarString(String mensaje) {
        boolean valido = false;
        String cadena = "";
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = new Scanner(System.in).nextLine();
                if (!cadena.equals("")) {
                    valido = true;
                } else {
                    throw new MiExcepcionAdrian("Error, no debe de estar vacío");
                }
            } catch (MiExcepcionAdrian m) {
                System.err.println(m.getMessage());
            }
        }
        return cadena;
    }

    //Metodo que valida los enteros
    public static int validarEnteros(String mensaje) {
        boolean valido = false;
        int entero = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                entero = new Scanner(System.in).nextInt();
                if (entero > 0) {
                    valido = true;
                } else if (entero == 0) {
                    throw new MiExcepcionAdrian("Error, has introducido un 0");
                } else {
                    throw new MiExcepcionAdrian("Error, es un número negativo");
                }
            } catch (MiExcepcionAdrian io) {
                System.err.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return entero;
    }

    public static double validarDouble(String mensaje) {
        boolean valido = false;
        double numero = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                numero = new Scanner(System.in).nextDouble();
                if (numero > 0) {
                    valido = true;
                } else if (numero == 0) {
                    throw new MiExcepcionAdrian("Error, has introducido un 0");
                } else {
                    throw new MiExcepcionAdrian("Error, es un número negativo");
                }
            } catch (MiExcepcionAdrian io) {
                System.out.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return numero;
    }

//Metodo que formatea la fecha a Locale España y  controla que si ponemos la fecha null, nos salga formateada
    public static String formatearFechas(LocalDate fecha) {
        String fechaFormateada = "";
        try {
            if (fecha != null) {
                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy").withLocale(new Locale("es", "ES"));
                fechaFormateada = fecha.format(f);
            } else {
                fechaFormateada = "Sin fecha de devolución";
            }
        } catch (DateTimeException d) {
            System.out.println("Error en el formato");
        } catch (NullPointerException n) {
            System.out.println("Error, la fecha es nula");
        }
        return fechaFormateada;
    }

}
