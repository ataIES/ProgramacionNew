/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author atres
 */
public class Teclado {

    //Metodo que valida cadenas
    public static String introCadena(String mensaje) {
        boolean valido = false;
        String apellido = "";
        String cond = "^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\s]?){2}$";
        Pattern patron = Pattern.compile(cond, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                apellido = new Scanner(System.in).nextLine();
                matcher = patron.matcher(apellido);
                if (!apellido.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(apellido, patron.pattern(), -1);
                    }
                } else {
                    throw new Exception("Error, los apellidos no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return apellido;
    }

    //Metodo que valida el año
    private static int anio(String mensaje) throws ExcepcionPersonalizada {
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
                    throw new ExcepcionPersonalizada("Error, el rango de año es [1900-hoy]");
                }
            } else {
                throw new ExcepcionPersonalizada("Error, el año no puede ser 0");
            }

        }
        return anio;
    }

    //Metodo que valida el mes
    private static int mes(String mensaje) throws ExcepcionPersonalizada {
        boolean valido = false;
        int mes = 0;
        while (!valido) {
            System.out.println(mensaje);
            mes = new Scanner(System.in).nextInt();
            if (mes != 0) {
                if (mes > 0 && mes < 13) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, el rango de mes es [1-12]");
                }
            } else {
                throw new ExcepcionPersonalizada("Error, el mes no puede ser 0");
            }
        }

        return mes;
    }

    //Metodo que valida el dia
    private static int dia(String mensaje, int mes, int anio) throws ExcepcionPersonalizada {
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
                        throw new ExcepcionPersonalizada("Error, el dia debe ser [1-30]");
                    }
                } else if (mes == 2) {
                    if (esBisiesto(anio)) {
                        if (dia <= 29) {
                            valido = true;
                        } else {
                            throw new ExcepcionPersonalizada("Error, el dia debe ser [1-29]");
                        }
                    } else {
                        if (dia <= 28) {
                            valido = true;
                        } else {
                            throw new ExcepcionPersonalizada("Error, el dia debe ser [1-28]");
                        }
                    }
                } else {
                    if (dia <= 31) {
                        valido = true;
                    } else {
                        throw new ExcepcionPersonalizada("Error, el dia debe ser [1-31]");
                    }
                }
            } else {
                throw new ExcepcionPersonalizada("Error, el dia no puede ser 0");
            }

        }
        return dia;
    }
    //Metodo que calcula años bisiestos

    private static boolean esBisiesto(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0) || ((anio % 100 == 0) && (anio % 400 != 0))) {
            bisiesto = true;
        }
        return bisiesto;
    }

    //Metodo que calcula la edad
    private static boolean edad(LocalDate fecha) {
        boolean mayorEdad = false;
        int edad = 18;
        LocalDate hoy = LocalDate.now();

        edad = Period.between(fecha, hoy).getYears();

        if (edad >= 18) {
            mayorEdad = true;
        }
        return mayorEdad;
    }

    //Metodo que introdue los valores dia,mes y año y los convierte en fecha
    public static LocalDate fecha() {
        int dia = 0, mes = 0, anio = 0;
        LocalDate fecha = null;
        boolean valido = false;
        while (!valido) {
            try {
                anio = anio("Introduce el año: ");
                mes = mes("Introduce el mes: ");
                dia = dia("Introduce el dia", mes, anio);

                fecha = LocalDate.of(anio, mes, dia);

                if (edad(fecha)) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, debe ser mayor de edad");
                }

            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
            }
        }
        return fecha;
    }
    //Metodo que formatea la fecha
    public static String formatoFecha(LocalDate fecha) {
        String fechaFormateada = "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("es", "ES"));
        fechaFormateada = fecha != null ? fecha.format(f) : "Sin Fecha Asignada";

        return fechaFormateada;
    }
}
