/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class MetodosPublicacion {

    private static int contPublicacion = 0;

    public static int getContPublicacion() {
        return contPublicacion;
    }

    public static boolean insertarPublicaciones(Publicacion[] publicaciones) {
        boolean insertado = false;
        String opc = "";
        while (!insertado) {
            try {
                if (contPublicacion < publicaciones.length) {
                    System.out.println("¿Quieres insertar alguna publicación? ");
                    {
                        opc = new Scanner(System.in).nextLine();
                        if (opc.equalsIgnoreCase("Si")) {
                            System.out.println("¿Qué tipo de publicación quieres insertar disco o libro?");
                            opc = new Scanner(System.in).nextLine();
                            if (opc.equalsIgnoreCase("Libro")) {
                                publicaciones[contPublicacion] = crearLibro();
                                contPublicacion++;
                            } else if (opc.equalsIgnoreCase("Disco")) {
                                publicaciones[contPublicacion] = crearDisco();
                                contPublicacion++;
                            } else {
                                throw new Exception("Error, no has introducido una opción valida");
                            }
                        } else if (opc.equalsIgnoreCase("No")) {
                            insertado = true;
                        } else {
                            throw new Exception("Error no has introducido (Si o no)");
                        }
                    }
                } else {
                    insertado = true;
                    throw new Exception("Error, no puedes añadir más publicaciones");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return insertado;
    }

    public static String mostrarPublicaciones(Publicacion[] publicaciones) {
        String cadena = "";
        for (int i = 0; i < contPublicacion; i++) {
            cadena += publicaciones[i].toString() + "\n";
        }
        return cadena;
    }

    public static void discoLargaDuracion(Publicacion[] publicaciones) {
        int duracionMayor = 0;
        Calendar anioMayor = Calendar.getInstance();
        int contDisco = 0;
        Disco aux = null;
        Disco[] lista = new Disco[contPublicacion];
        boolean encontrado = false;
        for (int i = 0; i < contPublicacion; i++) {
            if (publicaciones[i] instanceof Disco discoaux) {
                encontrado = true;
                if (discoaux.getDuracionMinutos() >= duracionMayor && encontrado) {
                    duracionMayor = discoaux.getDuracionMinutos();
                    lista[contDisco] = discoaux;
                    contDisco++;
                }
            }
        }

        anioMayor.set(0, 0, 0);
        for (int i = 0; i < contDisco; i++) {
            if (lista[i].fecha.after(anioMayor)) {
                anioMayor.setTime(lista[i].fecha.getTime());
                aux = lista[i];
            }
        }
        if(encontrado)

        System.out.println("---DISCO MÁS LARGA DURACIÓN---\n\tTítulo: " + aux.titulo.substring(0, 4) + "\n\tAutor: " + aux.autor);
    }

    public static void libro1000Paginas(Publicacion[] publicaciones) {
        int numPaginas = 0;
        int contLibros = 0;
        boolean encontrado = false;
        System.out.println("---Libros con más de 1000 páginas---");
        for (int i = 0; i < contPublicacion; i++) {
            if (publicaciones[i] instanceof Libro libroaux) {
                encontrado = true;
                if (libroaux.getNumPaginas() >= 1000 && libroaux.getFecha().getTime().getMonth() == 3) {
                    System.out.println("\n\tTítulo: " + libroaux.titulo + "\n\tAutor: " + libroaux.getAutor());
                }
            }
        }
        if (encontrado) {
            System.out.println("No existe ningún libro");
        }

    }

    private static Libro crearLibro() {
        System.out.println("Introduce su titulo: ");
        String titulo = new Scanner(System.in).nextLine();
        System.out.println("Introduce su autor: ");
        String autor = new Scanner(System.in).nextLine();
        int dia = Validacion.validarDia();
        int mes = Validacion.validarMes();
        int anio = Validacion.validarAnio();
        int numPagina = Validacion.validarNumeroPaginas();

        return new Libro(numPagina, titulo, autor, dia, mes, anio);
    }

    private static Disco crearDisco() {
        System.out.println("Introduce su titulo: ");
        String titulo = new Scanner(System.in).nextLine();
        System.out.println("Introduce su autor: ");
        String autor = new Scanner(System.in).nextLine();
        int dia = Validacion.validarDia();
        int mes = Validacion.validarMes();
        int anio = Validacion.validarAnio();
        int duracionMinutos = Validacion.validarDuracionMinutos();

        return new Disco(duracionMinutos, titulo, autor, dia, mes, anio);
    }

}
