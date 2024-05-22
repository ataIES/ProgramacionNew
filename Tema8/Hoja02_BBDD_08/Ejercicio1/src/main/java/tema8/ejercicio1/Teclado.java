/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 * Metodo qeu valida Datos
 *
 * @author DAW125
 */
public class Teclado {

    /**
     * Metodo que pide un número de telefono y lo valida
     *
     * @param mensaje Texto que se va a mostrar para introducir datos
     * @return devuelve teléfono validado
     */
    public static String introTelefono(String mensaje) {
        boolean valido = false;
        String tlf = "";
        String condicion = "^[0-9]{9}$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                tlf = new Scanner(System.in).nextLine();
                if (!tlf.equalsIgnoreCase("")) {
                    if (tlf.matches(condicion)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(tlf, condicion, -1);
                    }
                } else {
                    throw new NullPointerException("Error, el tlf no puede ser nulo");
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, el tlf debe ser 9 números enteros");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return tlf;
    }

    /**
     * Metodo que introduce un nombre y lo valida
     *
     * @param mensaje Texto que muestra que vas a introducir
     * @return devuelve el nombre validado
     */
    public static String introducirNombre(String mensaje) {
        boolean valido = false;
        String nombre = "";
        String condicion = "^[^0-9]*$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                nombre = new Scanner(System.in).nextLine();
                if (!nombre.equalsIgnoreCase("")) {
                    if (nombre.matches(condicion)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(nombre, condicion, -1);
                    }
                } else {
                    throw new NullPointerException("Error, el nombre no puede ser nulo");
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, el nombre solo admite letras");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }

    /**
     * Metodo privado que introduce y valida el año
     *
     * @param mensaje
     * @return devuelve el año validado
     * @throws Exception
     */
    private static int anio(String mensaje) throws Exception {
        boolean valido = false;
        int anio = 0;
        int hoy = LocalDate.now().getYear();
        while (!valido) {
            System.out.println(mensaje);
            anio = new Scanner(System.in).nextInt();
            if (anio != 0) {
                if (anio >= 1900 && anio <= hoy) {
                    valido = true;
                } else {
                    throw new Exception("Error, el rango de año es [1900-hoy]");
                }
            } else {
                throw new Exception("Error, el año no puede ser 0");
            }

        }
        return anio;
    }

    /**
     * Metodo que valida un mes
     *
     * @param mensaje
     * @return devuelve mes validado
     * @throws Exception
     */
    private static int mes(String mensaje) throws Exception {
        boolean valido = false;
        int mes = 0;
        while (!valido) {
            System.out.println(mensaje);
            mes = new Scanner(System.in).nextInt();
            if (mes != 0) {
                if (mes > 0 && mes < 13) {
                    valido = true;
                } else {
                    throw new Exception("Error, el rango de mes es [1-12]");
                }
            } else {
                throw new Exception("Error, el mes no puede ser 0");
            }
        }

        return mes;
    }

    /**
     * Metodo que valida un dia teniendo en cuenta el mes y el año y si es
     * bisiesto
     *
     * @param mensaje
     * @param mes
     * @param anio
     * @return devuelve el dia validado
     * @throws Exception
     */
    private static int dia(String mensaje, int mes, int anio) throws Exception {
        boolean valido = false;
        int dia = 0;
        while (!valido) {
            System.out.println(mensaje);
            dia = new Scanner(System.in).nextInt();
            if (dia != 0) {
                if (mes % 2 == 0 && mes != 2) {
                    if (dia <= 30) {
                        valido = true;
                    } else {
                        throw new Exception("Error, el dia debe ser [1-30]");
                    }
                } else if (mes == 2) {
                    if (esBisiesto(anio)) {
                        if (dia <= 29) {
                            valido = true;
                        } else {
                            throw new Exception("Error, el dia debe ser [1-29]");
                        }
                    } else {
                        if (dia <= 28) {
                            valido = true;
                        } else {
                            throw new Exception("Error, el dia debe ser [1-28]");
                        }
                    }
                } else {
                    if (dia <= 31) {
                        valido = true;
                    } else {
                        throw new Exception("Error, el dia debe ser [1-31]");
                    }
                }
            } else {
                throw new Exception("Error, el dia no puede ser 0");
            }

        }
        return dia;
    }

    /**
     * Metodo que valida un dni
     *
     * @param mensaje
     * @return devuelve el dni validado
     */
    public static String introDNI(String mensaje) {
        boolean valido = false;
        String dni = "";
        String condicion = "[0-9]{7,8}[A-Z a-z]";
        while (!valido) {
            try {
                System.out.println(mensaje);
                dni = new Scanner(System.in).nextLine();
                if (dni.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(dni, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println(p.getMessage());
            }
        }
        return dni;
    }

    /**
     * Metodo que calcula si un año es bisiesto
     *
     * @param anio
     * @return devuelve un boolean
     */
    private static boolean esBisiesto(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0) || ((anio % 100 == 0) && (anio % 400 != 0))) {
            bisiesto = true;
        }
        return bisiesto;
    }

}
