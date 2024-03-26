/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.time.LocalDate;
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

    public static String introducirCodigo(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        String codigo = "";
        String condicion = "[A-Za-z0-9]{4}";

        while (!valido) {
            try {
                System.out.println(mensaje);
                codigo = teclado.nextLine();
                if (codigo.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(codigo, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, el codigo debe ser de 4 dígitos");
            }
        }
        
        return codigo;
    }

    public static String introducirOrigen(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        String origen = "";
        Pattern patron = Pattern.compile("[A-Z]{1}[a-z]{1,15}");
        Matcher matcher = null;

        while (!valido) {
            try {
                System.out.println(mensaje);
                origen = teclado.nextLine();
                matcher = patron.matcher(origen);
                if (matcher.find()) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(origen, patron.pattern(), -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, 1 letra mayuscula y máximo 15 minúsculas");
            }
        }
        
        return origen;
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

    //Metodo que introdue los valores dia,mes y año y los convierte en fecha
    public static LocalDate fecha() {
        int dia = 0, mes = 0, anio = 0;
        LocalDate fecha = null;
        LocalDate hoy = LocalDate.now();
        boolean valido = false;
        while (!valido) {
            try {
                anio = anio("Introduce el año: ");
                mes = mes("Introduce el mes: ");
                dia = dia("Introduce el dia", mes, anio);
                fecha = LocalDate.of(anio, mes, dia);
                if (fecha.isBefore(hoy) || fecha.isEqual(hoy)) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, la fecha introducida es después de la actual");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return fecha;
    }
    //Metodo que calcula años bisiestos

    private static boolean esBisiesto(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0) || ((anio % 100 == 0) && (anio % 400 != 0))) {
            bisiesto = true;
        }
        return bisiesto;
    }
    //Metodo que formatea la fecha

    public static String formatoFecha(LocalDate fecha) {
        String fechaFormateada = "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(new Locale("es", "ES"));
        fechaFormateada = fecha != null ? fecha.format(f) : "";

        return fechaFormateada;
    }
}
