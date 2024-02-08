/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Metodos {

    private static int contPublicaciones = 0;

    public static int getContPublicaciones() {
        return contPublicaciones;
    }

//Método que añade publicaciones preguntando al usuario que publicación quiere insertar
    public static void aniadirPublicaciones(Publicacion[] publicaciones) {
        boolean valido = false;
        String opc = "";
        if (contPublicaciones < publicaciones.length) {
            for (int i = 0; i < publicaciones.length; i++) {
                do {
                    System.out.println("¿Qué tipo de publicación quieres introducir, Libro o Disco?");
                    opc = new Scanner(System.in).nextLine();
                    if (opc.equalsIgnoreCase("Libro")) {
                        publicaciones[i] = crearLibro();
                        publicaciones[i].setId(i + 1);
                        System.out.println("Libro " + publicaciones[i].getTitulo() + " creado correctamente");
                        contPublicaciones++;
                        valido = true;
                    } else if (opc.equalsIgnoreCase("Disco")) {
                        publicaciones[i] = crearDisco();
                        publicaciones[i].setId(i + 1);
                        System.out.println("Disco " + publicaciones[i].getTitulo() + " creado correctamente");
                        contPublicaciones++;
                        valido = true;
                    } else {
                        System.out.println("Error, opción errónea");
                    }
                } while (!valido);
            }
        } else {
            System.out.println("Error, número máximo de publicaciones alcanzado");
        }

    }

//Método que crea un Libro
    private static Libro crearLibro() {
        Scanner teclado = new Scanner(System.in);
        Libro aux = null;

        System.out.println("Introduce su título: ");
        String titulo = new Scanner(System.in).nextLine();
        System.out.println("Introduce su autor: ");
        String autor = new Scanner(System.in).nextLine();
        System.out.println("Introduce el día de publicacin: ");
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes de publicación: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce el año de publicación: ");
        int anio = teclado.nextInt();
        System.out.println("Introduce el número de páginas: ");
        int numeroPaginas = teclado.nextInt();

        aux = new Libro(numeroPaginas, titulo, autor, dia, mes, anio);
        return aux;
    }

    //Método que crea un disco
    private static Disco crearDisco() {
        Scanner teclado = new Scanner(System.in);
        Disco aux = null;

        System.out.println("Introduce su título: ");
        String titulo = new Scanner(System.in).nextLine();
        System.out.println("Introduce su autor: ");
        String autor = new Scanner(System.in).nextLine();
        System.out.println("Introduce el día de publicacin: ");
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes de publicación: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce el año de publicación: ");
        int anio = teclado.nextInt();
        System.out.println("Introduce la duración en minutos: ");
        int duracionMinutos = teclado.nextInt();

        aux = new Disco(duracionMinutos, titulo, autor, dia, mes, anio);
        return aux;
    }

    public static String discoLargaDuracion(Publicacion[] publicaciones) {
        int duracionMayor = 0;
        String cadena = "";
        for (int i = 0; i < contPublicaciones; i++) {
            if (publicaciones[i] instanceof Disco discoaux) {
                if (discoaux.getDuracionMinutos() >= duracionMayor) {
                    duracionMayor = discoaux.getDuracionMinutos();
                    cadena += "Título: " + discoaux.getTitulo().substring(0, 3) + "\nAutor: " + discoaux.getAutor()
                            + "\nDuracion en minutos: " + discoaux.getDuracionMinutos() + "\n";
                }
            } else {
                cadena = "No hay ningún disco publicado";
            }
        }
        return cadena;
    }

    public static String libro1000paginas(Publicacion[] publicaciones) {
        LocalDate hoy = LocalDate.now();
        String cadena = "";
        for (int i = 0; i < contPublicaciones; i++) {
            if (publicaciones[i] instanceof Libro libroaux) {
                if (libroaux.getFecha().getMonthValue() == hoy.getMonthValue() && libroaux.getNumPaginas() > 1000) {
                    cadena += libroaux.toString();
                }else{
                    cadena="No hay ningún libro publicado en este mes y con más de 1000 páginas";
                }
            }else{
                cadena="No existe ningún libro publicado";
            }
        }
       
        return cadena;
    }

    public static String discos2anios(Publicacion[] publicaciones) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String cadena = "";
        LocalDate hoy = LocalDate.now();
        for (int i = 0; i < contPublicaciones; i++) {
            if (publicaciones[i] instanceof Disco discoaux) {
                if (discoaux.getFecha().isAfter(hoy.minusYears(2))) {
                    cadena += "Título: " + discoaux.getTitulo() + "\nAutor: " + discoaux.getAutor() + " Fecha: " + discoaux.getFecha().format(f) + "\n";
                } else {
                    cadena = "No hay ningún disco en los últimos dos años";
                }
            } else {
                cadena = "No hay ningún disco publicado";
            }
        }
        return cadena;
    }

    public static void mostrar(Publicacion[] publicaciones) {
        for (int i = 0; i < contPublicaciones; i++) {
            System.out.print(publicaciones[i].toString());
        }
    }
}
