/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5examen.ejercicio1;

/**
 *
 * @author Adrián Tresgallo Arozamena DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("BibliotecaDAW125", 5);
        LibroElectronico libro1 = new LibroElectronico();
        Usuarios usuario1 = new Usuarios();
        LibroElectronico libro2 = new LibroElectronico(0.5, "El dia de mañana", "Ignacio Martinez de Pison");
        LibroPapel libro3 = new LibroPapel(120, "El vagon de mujeres", "Anita Nair");
        Usuarios usuario2 = new Usuarios("Maria", "Gonzalez");
        Usuarios usuario3 = new Usuarios("Ignacio", "Alvarez");
        Usuarios usuario5=new Usuarios("Alfredo","Gomez");
        LibroElectronico libro5 = new LibroElectronico(0.5, "Donde Fuimos Felices", "Ignacio Martinez de Pison");
        agregarLibro(biblioteca, libro1);
        biblioteca.insertarUsuario(usuario1);
        agregarLibro(biblioteca, libro2);
        agregarLibro(biblioteca, libro3);
        biblioteca.insertarUsuario(usuario2);
        biblioteca.insertarUsuario(usuario3);
        System.out.println(biblioteca.mostrarBiblioteca());
        System.out.println("---Prestar libro---");
        biblioteca.prestarLibro(libro1, usuario1);
        System.out.println("");
        System.out.println("---PrestarLibro---");
        biblioteca.prestarLibro(libro2,usuario5 );
        System.out.println("---Prestar Libro--");
        biblioteca.prestarLibro(libro1, usuario2);
        System.out.println("---Eliminar libro---");
        biblioteca.eliminarLibro(libro3);
        System.out.println("---Eliminar libro---");
        biblioteca.eliminarLibro(libro5);
    }

    public static void agregarLibro(Biblioteca biblioteca, Libro libro) {
        try {
            if (biblioteca.agregarLibros(libro)) {
                System.out.println("Libro " + libro.titulo + " agregado");
            }
        } catch (MiExcepcionAdrian m) {
            System.err.println(m.getMessage());
        }
    }

    public static void buscarUsuario(Biblioteca biblioteca, Usuarios usuario) {
        if (biblioteca.buscarUsuario(usuario)) {
            System.out.println(usuario.toString());
        } else {
            System.out.println("El usuario no existe");
        }
    }

    public static void buscarLibro(Biblioteca biblioteca, Libro libro) {
        if (biblioteca.buscarLibro(libro)) {
            System.out.println(libro.imprime());
        } else {
            System.out.println("El usuario no existe");
        }
    }

}
