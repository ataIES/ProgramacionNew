/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5examen.ejercicio1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Adrian Tresgallo Arozamena DAW125
 */
public class Biblioteca {

    private String nombreBiblioteca;
    private Libro[] libros;
    private Usuarios[] usuarios;
    private Prestamo[] prestamos;
    private static int contLibros;
    private static int contUsuarios;
    private static int contPrestamos;

    public Biblioteca(String nombreBiblioteca1, int nMaximo) {
        this.nombreBiblioteca = nombreBiblioteca1;
        this.libros = new Libro[nMaximo];
        this.usuarios = new Usuarios[nMaximo];
        this.prestamos = new Prestamo[nMaximo];
        contLibros = 0;
        contUsuarios = 0;
        contPrestamos = 0;
    }

    public boolean agregarLibros(Libro libro) throws MiExcepcionAdrian {
        boolean agregado = false;
        if (contLibros < libros.length) {
            libros[contLibros] = libro;
            contLibros++;
            agregado = true;
        } else {
            throw new MiExcepcionAdrian("Error, se ha alcanzado el límite máximo de libros");
        }
        return agregado;
    }

    public void insertarUsuario(Usuarios usuario) {
        if (contUsuarios < usuarios.length) {
            usuarios[contUsuarios] = usuario;
            contUsuarios++;
            System.out.println("Usuario " + usuario.getNombre() + " agregado correctamente");
        } else {
            System.out.println("Error, se alcanzó el límite máximo de usuarios");
        }
    }

    public void insertarPrestamos(Prestamo prestamo) {
        if (contPrestamos < prestamos.length) {
            prestamos[contPrestamos] = prestamo;
            contPrestamos++;
            System.out.println("Prestamo añadido correctamente");
        } else {
            System.out.println("Error, se alcanzó el límite máximo de prestamos");
        }
    }

    public boolean buscarUsuario(Usuarios usuario) {
        boolean encontrado = false;
        for (Usuarios usus : usuarios) {
            if (usus != null) {
                if (usus.equals(usuario)) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    public boolean buscarLibro(Libro libro) {
        boolean encontrado = false;
        for (Libro libroaux : libros) {
            if (libroaux != null) {
                if (libroaux.equals(libroaux)) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    public boolean buscarLibroEnPrestamo(Libro libro) {
        boolean encontrado = false;
        for (int i = 0; i < contPrestamos; i++) {
            if (prestamos[i].getLibro().equals(libro)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void prestarLibro(Libro libro, Usuarios usuario) {
        LocalDate fechaActual = LocalDate.now();
        if (buscarLibro(libro) && buscarLibroEnPrestamo(libro)) {
            System.out.println("Se puede realizar el prestamo");
           
            Prestamo prestamo = new Prestamo(libro, usuario, fechaActual, null);
        }
    }
   

    public void eliminarLibro(Libro libro) {
        int pos = 0;
        boolean encontrado = false;
        for (int i = 0; i < contLibros; i++) {
            if (libros[i].equals(libro)) {
                encontrado = true;
                pos = i;
            }
        }

        for (int i = pos; i < contLibros - 1; i++) {
            libros[i] = libros[i + 1];
        }
        contLibros--;
        if (!encontrado) {
            System.out.println("El libro no existe");
        } else {
            System.out.println("Libro eliminado");
        }
    }

    public void ordenarLibros() {
        Arrays.sort(libros);
    }

    private String mostrarLibros() {
        String cadena = "";
        for (int i = 0; i < contLibros; i++) {
            cadena += libros[i].imprime() + "\n";
        }
        return cadena;
    }

    private String mostrarUsuarios() {
        String cadena = "";
        for (int i = 0; i < contUsuarios; i++) {
            cadena += usuarios[i].toString() + "\n";
        }
        return cadena;
    }

    private String mostrarPrestamos() {
        String cadena = "";
        for (int i = 0; i < contPrestamos; i++) {
            cadena += prestamos[i].toString() + "\n";
        }
        return cadena;
    }

    public String mostrarBiblioteca() {
        return "Nombre: " + nombreBiblioteca + mostrarLibros() + mostrarUsuarios() + mostrarPrestamos();
    }

}
