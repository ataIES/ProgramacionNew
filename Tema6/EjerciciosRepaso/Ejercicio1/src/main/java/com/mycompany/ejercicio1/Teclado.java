/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.DateTimeException;
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

    //Metodo que valida nombre
    public static String introNombre(String mensaje) {
        boolean valido = false;
        String cadena = "";
        String cond = "^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\s]?){1,2}$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = new Scanner(System.in).nextLine();
                if (!cadena.equalsIgnoreCase("")) {
                    if (cadena.matches(cond)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(cadena, cond, -1);
                    }
                } else {
                    throw new Exception("Error, el nombre no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return cadena;
    }

    public static String introApellido(String mensaje) {
        boolean valido = false;
        String apellido = "";
        String condicion = "^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\s]?){2}$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                apellido = new Scanner(System.in).nextLine();
                if (apellido.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(apellido, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            }
        }
        return apellido;
    }

    public static double introEstatura(String mensaje) {
        boolean valido = false;
        double estatura = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                estatura = new Scanner(System.in).nextDouble();

                if (estatura <= 2.30 && estatura >= 1.50) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, la estatura debe ser entre 1,50 y 2,30");
                }

            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracters");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return estatura;
    }

    public static String introDni(String mensaje) {
        boolean valido = false;
        String dni = "";
        String condicion = "^[0-9]{8}[A-Z]{1}$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                dni = new Scanner(System.in).nextLine();
                if (!dni.equalsIgnoreCase("")) {
                    if (dni.length() == 9) {
                        if (dni.matches(condicion)) {
                            if (validarDNI(dni)) {
                                valido = true;
                            }
                        } else {
                            throw new PatternSyntaxException(dni, condicion, -1);
                        }
                    } else {
                        throw new ExcepcionPersonalizada("Error, el dni debe tener 9 digitos");
                    }
                } else {
                    throw new NullPointerException("Error, no puede estar el dni vacío");
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato del dni 8 número enteros y 1 letra mayúscula");
            } catch (NullPointerException n) {
                System.out.println(n.getMessage());
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return dni;
    }

    public static int introAnio(String mensaje) {
        boolean valido = false;
        int anio = 0;
        int anioActual = LocalDate.now().getYear();
        while (!valido) {
            try {
                System.out.println(mensaje);
                anio = new Scanner(System.in).nextInt();
                if (anio >= 1900 && anio <= anioActual) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, año debe ser entre 1900 y " + anioActual);
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, sólo números enteros");
            }
        }
        return anio;
    }

    public static int introMes(String mensaje) {
        boolean valido = false;
        int mes = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                mes = new Scanner(System.in).nextInt();
                if (mes > 0 && mes <= 12) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, mes entre 1 y 12");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return mes;
    }

    public static int introDia(int mes, int anio) {
        int dia = 0;
        switch (mes % 2) {
            case 0 -> {
                if (mes != 2) {
                    dia = introDia30();
                } else {
                    if (esBisiesto(anio)) {
                        dia = introDia29();
                    } else {
                        dia = introDia28();
                    }
                }
            }
            default ->
                dia = introDia31();
        }

        return dia;
    }

    public static LocalDate fecha(int dia, int mes, int anio) {
        LocalDate fecha = null;
        LocalDate hoy = LocalDate.now();
        boolean valido = false;
        while (!valido) {
            try {
                fecha = LocalDate.of(anio, mes, dia);
                if (hoy.isAfter(fecha)) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, la fecha no puede ser después de la actual");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return fecha;
    }

    public static String formatoFecha(LocalDate fecha) {
        String formatoFecha = "";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es", "ES"));

        formatoFecha = fecha.format(formato);
        return formatoFecha;
    }

    private static boolean validarDNI(String dni) throws ExcepcionPersonalizada {
        int numeroDni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        char letraDni = dni.charAt(dni.length()-1);
        String codigoLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroDni % 23;
        boolean validar = false;

        if (codigoLetra.charAt(resto) == letraDni) {
            validar = true;
        } else {
            throw new ExcepcionPersonalizada("Error, letra incorrecta");
        }
        return validar;
    }

    private static int introDia31() {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el dia entre 1 y 31");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia <= 31) {
                    valido = true;
                } else {
                    throw new DateTimeException("Error, el dia debe ser entre 1 y 31");
                }
            } catch (DateTimeException d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return dia;
    }

    private static int introDia29() {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el dia entre 1 y 29");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia <= 29) {
                    valido = true;
                } else {
                    throw new DateTimeException("Error, el dia debe ser entre 1 y 29");
                }
            } catch (DateTimeException d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce número enteros");
            }
        }
        return dia;
    }

    private static int introDia28() {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el dia entre 1 y 28");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia <= 28) {
                    valido = true;
                } else {
                    throw new DateTimeException("Error, el dia debe ser entre 1 y 28");
                }
            } catch (DateTimeException d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return dia;
    }

    private static int introDia30() {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el dia entre 1 y 30");
                dia = new Scanner(System.in).nextInt();
                if (dia > 0 && dia <= 30) {
                    valido = true;
                } else {
                    throw new DateTimeException("Error, el dia debe ser entre 1 y 30");
                }
            } catch (DateTimeException d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
            }
        }
        return dia;
    }

    private static boolean esBisiesto(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0) || ((anio % 100 == 0) && (anio % 400 != 0))) {
            bisiesto = true;
        }
        return bisiesto;
    }

    public static String introCodigoPostal(String mensaje) {
        String codigoPostal = "";
        String condicion = "^[0-5]{2}[0-9]{3}$";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                codigoPostal = new Scanner(System.in).nextLine();
                if (codigoPostal.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(codigoPostal, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, código postal erróneo");
            }
        }
        return codigoPostal;
    }

    public static String introCorreoElectronico(String mensaje) {
        String correoElectronico = "";
        String condicion = "^[A-Za-z0-9Ññ_.-]+@[a-zA-Z0-9-_]+.[a-z]{2,4}$";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                correoElectronico = new Scanner(System.in, "ISO-8859-1").nextLine();
                if (correoElectronico.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(correoElectronico, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println(p.getMessage());
            }
        }
        return correoElectronico;
    }

    public static int introEntero(String mensaje) {
        int entero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                entero = new Scanner(System.in).nextInt();
                if (entero > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, introduce números positivos");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return entero;
    }
    
    public static double introDouble(String mensaje) {
        double decimal = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                decimal = new Scanner(System.in).nextDouble();
                if (decimal > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, introduce números positivos");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return decimal;
    }

}
