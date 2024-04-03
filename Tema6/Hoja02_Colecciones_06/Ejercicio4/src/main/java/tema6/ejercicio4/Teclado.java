/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

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

    public static String introNombre(String mensaje) {
        String nombre = "";
        boolean valido = false;
        String condApellido = "[A-ZÁÉÍÓÚ][a-záéíóú]*[\s]{1}[A-ZÁÉÍÓÚ][a-záéíóú]*";
        Pattern patron = Pattern.compile(condApellido, Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                nombre = new Scanner(System.in).nextLine();
                matcher = patron.matcher(nombre);
                if (!nombre.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(nombre, patron.pattern(), -1);
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, el nombre no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }

    public static String introTlf(String mensaje) {
        String tlf = "";
        boolean valido = false;
        String condicion = "[0-9]{9}";
        while (!valido) {
            try {
                System.out.println(mensaje);
                tlf = new Scanner(System.in).nextLine();
                if (tlf.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(tlf, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, el teléfono debe ser 9 números");
            }
        }
        return tlf;
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

    //Metodo que valida la hora
    private static int hora(String mensaje) throws ExcepcionPersonalizada, InputMismatchException {
        boolean valido = false;
        int hora = 0;
        while (!valido) {

            System.out.println(mensaje);
            hora = new Scanner(System.in).nextInt();
            if (hora <= 23) {
                valido = true;
            } else {
                throw new ExcepcionPersonalizada("Error, la hora debe ser [0-23]");

            }
        }
        return hora;
    }

    //Metodo que valida los minutos
    private static int minutos(String mensaje) throws ExcepcionPersonalizada, InputMismatchException {
        boolean valido = false;
        int minutos = 0;
        while (!valido) {

            System.out.println(mensaje);
            minutos = new Scanner(System.in).nextInt();
            if (minutos <= 59) {
                valido = true;
            } else {
                throw new ExcepcionPersonalizada("Error, los minutos debe ser [0-59]");
            }
        }
        return minutos;
    }

    //Metodo que introdue los valores dia,mes y año y los convierte en fecha
    public static LocalDateTime fecha() {
        int dia = 0, mes = 0, anio = 0, hora = 0, minutos = 0;
        LocalDateTime fecha = null;
        LocalDateTime hoy = LocalDateTime.now();
        boolean valido = false;
        while (!valido) {
            try {
                anio = anio("Introduce el año: ");
                mes = mes("Introduce el mes: ");
                dia = dia("Introduce el dia", mes, anio);
                hora = hora("Introduce la hora: ");
                minutos = minutos("Introduce los minutos: ");
                fecha = LocalDateTime.of(anio, mes, dia, hora, minutos);

                if (fecha.isBefore(hoy) || fecha.isEqual(hoy)) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, la fecha no puede ser posterior a " + formatoFecha(hoy));
                }

            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
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
    public static String formatoFecha(LocalDateTime fecha) {
        String fechaFormateada = "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm").withLocale(new Locale("es", "ES"));
        fechaFormateada = fecha != null ? fecha.format(f) : "Sin Fecha Asignada";

        return fechaFormateada;
    }
}
