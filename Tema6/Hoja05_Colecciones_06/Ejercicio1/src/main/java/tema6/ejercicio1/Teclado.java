/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

    //Metodo que valida enteros
    public static int introEntero(String mensaje) {
        boolean valido = false;
        int entero = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                entero = new Scanner(System.in).nextInt();
                if (entero > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, has introducido un valor negativo");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce número enteros");
            }
        }
        return entero;
    }

    //Metodo que valida cadenas
    public static String introCadena(String mensaje) {
        boolean valido = false;
        String cadena = "";
        String condicion = "^[A-Za-zÁÉÍÓÚñáéíóú\s?]{4,25}$";
        Pattern patron = Pattern.compile(condicion, Pattern.UNICODE_CASE);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = new Scanner(System.in).nextLine();
                if (!cadena.equalsIgnoreCase("")) {
                    matcher = patron.matcher(cadena);
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(cadena, patron.pattern(), -1);
                    }
                } else {
                    throw new NullPointerException("Error, no puede estar vacío");
                }
            } catch (NullPointerException n) {
                System.out.println(n.getMessage());
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            }
        }
        return cadena;
    }

    //Metodo que valida booleans
    public static boolean introFinalizada(String mensaje) {
        boolean valido = false;
        boolean finalizada = false;
        String opcion = "";
        while (!valido) {
            try {
                System.out.println(mensaje);
                opcion = new Scanner(System.in).nextLine();
                if (opcion.equalsIgnoreCase("si")) {
                    finalizada = true;
                    valido = true;
                } else if (opcion.equalsIgnoreCase("no")) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, introduce si o no");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return finalizada;
    }

    //Metodo que valida la temporada
    public static int introTemporada(String mensaje) {
        boolean valido = false;
        int temporada = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                temporada = new Scanner(System.in).nextInt();
                if (temporada > 0 && temporada < 16) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, introduce un valor entre 1 y 15");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce número enteros");
            }
        }
        return temporada;
    }

    //Metodo que valida el capitulo
    public static int introCapitulo(String mensaje) {
        boolean valido = false;
        int capitulo = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                capitulo = new Scanner(System.in).nextInt();
                if (capitulo > 0 && capitulo < 30) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, introduce un valor entre 1 y 15");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce número enteros");
            }
        }
        return capitulo;
    }

    //Metodo que valida la tematica
    public static Tematica pedirTematica() {
        Tematica tematica = null;
        boolean valido = false;
        int n = 0;
        int opcion = 0;

        while (!valido) {
            try {
                System.out.println("Elige la tematica.\n1. Aventura\n2. Comedia\n3. Infantil\n4. Policial");
                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1 -> {
                        tematica = Tematica.AVENTURA;
                        valido = true;
                    }
                    case 2 -> {
                        tematica = Tematica.COMEDIA;
                        valido = true;
                    }
                    case 3 -> {
                        tematica = Tematica.INFANTIL;
                        valido = true;
                    }
                    case 4 -> {
                        tematica = Tematica.POLICIAL;
                        valido = true;
                    }
                    default -> {
                        System.out.println("Error: elige una opcion");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return tematica;
    }

    public static int validarTemporada(Serie s) {
        int temporada = 0;
        boolean valido = false;
        try {
            while (!valido) {
                temporada = Teclado.introTemporada("Introduce la temporada: ");
                if (temporada <= s.getnTemporadas()) {
                    valido=true;
                }else{
                    throw new ExcepcionPersonalizada("Error, la temporada del capítulo debe ser una temporada válida");
                }
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
        return temporada;
    }

}
