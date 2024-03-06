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
 * @author atres
 */
public class Validacion {

    public static int validarDia() {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el dia: ");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia <= 31) {
                    System.out.println("Dia introducido correctamente");
                    valido = true;
                } else {
                    throw new IOException("Error, el dia debe ser [1-31]");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
        return dia;
    }

    public static int validarMes() {
        int mes = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el mes: ");
                mes = new Scanner(System.in).nextInt();
                if (mes > 0 && mes <= 12) {
                    System.out.println("Mes introducido correctamente");
                    valido = true;
                } else {
                    throw new IOException("Error, el mes debe ser [1-12]");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
        return mes;
    }

    public static int validarAnio() {
        int anio = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el año: ");
                anio = new Scanner(System.in).nextInt();
                if (anio >= 1990 && anio <= 2024) {
                    System.out.println("Año introducido correctamente");
                    valido = true;
                } else {
                    throw new IOException("Error, el año debe ser [1990-2024]");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
        return anio;
    }

    public static int validarNumeroPaginas() {
        boolean valido = false;
        int numPaginas = 0;
        while (!valido) {
            try {
                System.out.println("Introduce el número de páginas: ");
                numPaginas = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return numPaginas;
    }

    public static int validarDuracionMinutos() {
        boolean valido = false;
        int duracionMinutos = 0;
        while (!valido) {
            try {
                System.out.println("Introduce la duracion en minutos: ");
                duracionMinutos = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return duracionMinutos;
    }

}
