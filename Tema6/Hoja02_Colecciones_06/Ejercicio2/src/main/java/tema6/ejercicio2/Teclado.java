/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

    //Metodo que valida el año
    private static int anio(String mensaje) {
        boolean valido = false;
        int anio = 0;
        int hoy = LocalDate.now().getYear();
        while (!valido) {
            try {
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
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return anio;
    }

    //Metodo que valida el mes
    private static int mes(String mensaje) {
        boolean valido = false;
        int mes = 0;
        while (!valido) {
            try {
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
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return mes;
    }

    //Metodo que valida el dia
    private static int dia(String mensaje, int mes, int anio) {
        boolean valido = false;
        int dia = 0;
        while (!valido) {
            try {
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
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return dia;
    }

    //Metodo que valida la hora
    private static int hora(String mensaje) {
        boolean valido = false;
        int hora = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                hora = new Scanner(System.in).nextInt();
                if (hora <= 23) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, la hora debe ser [0-23]");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return hora;
    }

    //Metodo que valida los minutos
    private static int minutos(String mensaje) {
        boolean valido = false;
        int minutos = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                minutos = new Scanner(System.in).nextInt();
                if (minutos <= 59) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, los minutos debe ser [0-59]");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            }
        }
        return minutos;
    }

    //Metodo que introdue los valores dia,mes y año y los convierte en fecha
    public static LocalDateTime fecha() {
        int dia = 0, mes = 0, anio = 0, hora = 0, minutos = 0;
        LocalDateTime fecha = null;

        anio = anio("Introduce el año: ");
        mes = mes("Introduce el mes: ");
        dia = dia("Introduce el dia", mes, anio);
        hora = hora("Introduce la hora: ");
        minutos = minutos("Introduce los minutos: ");

        fecha = LocalDateTime.of(anio, mes, dia, hora, minutos);
        return fecha;
    }

    
    //Metodo que valida el modelo
    public static String modelo(String mensaje) {
        boolean valido = false;
        String modelo = "";
        String patron = "[A-Z][a-z]*";
        while (!valido) {
            try {
                System.out.println(mensaje);
                modelo = new Scanner(System.in).nextLine();
                if (!modelo.equalsIgnoreCase("")) {
                    if (modelo.matches(patron)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(modelo, patron, -1);
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, no puede estar vacio");
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return modelo;
    }

    
    //Metodo que valida la matricula
    public static String matricula(String mensaje) {
        boolean valido = false;
        String matricula = "";
        Pattern pattern = Pattern.compile("[0-9]{4}[A-Z]{3}", Pattern.CASE_INSENSITIVE);;
        Matcher match = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                matricula = new Scanner(System.in).nextLine();
                match = pattern.matcher(matricula);
                if (!matricula.equalsIgnoreCase("")) {
                    if (match.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(matricula, pattern.pattern(), -1);
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, la matricula no puede estar vacía");
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato de matrícula erróneo [4 números y 3 letras]");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return matricula;
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
    public static String formatoFecha(LocalDateTime fecha) {
        String fechaFormateada = "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm").withLocale(new Locale("es", "ES"));
        fechaFormateada = fecha != null ? fecha.format(f) : "";

        return fechaFormateada;
    }
}
