/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejerciciopropuestobiblioteca;

/**
 *
 * @author DAW125
 */
public class EjercicioPropuestoBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca(500);
        Libro libro1=new Libro("Ulises","James Joyce","Mieditorial","1900-07-15");
        Libro libro2=new Libro("Iliada","Homero","Midietorial","1493-01-01");
        Libro libro3=new Libro("Beltenebros","Antonio Muñoz Molina","Edhasa","1984-07-15");
        Libro libro4= new Libro("Otro más","Javier Marías","Alianza Editorial","1984-09-25");
        //Agrego los libros
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        biblioteca.agregarLibros(libro4);
        System.out.println("---BIBLIOTECA---");
        biblioteca.mostrarBiblioteca();
        
        //Pruebo el método consultarLibro
        System.out.println("---Mostrar libro Ulises---");
        System.out.println(biblioteca.consultarLibro("Ulises"));
        System.out.println("---Mostrar libro el gato con botas");
        System.out.println(biblioteca.consultarLibro("El gato con botas"));
        //Pruebo el metodo consultarAutor
        
        //Pruebo el metodo consultarPublicacion
        System.out.println("---Mostrar libros en 1984---");
        System.out.println(biblioteca.consultarPublicacion(1984));
        System.out.println("---Mostrar libros en 2003---");
        System.out.println(biblioteca.consultarPublicacion(2003));
        //Pruebo consultar editorial
        System.out.println("---Mostrar libros de la editorial Alianza Editorial---");
        System.out.println(biblioteca.consultarEditorial("Alianza Editorial"));
        //Eliminamos un libro
        System.out.println("---Eliminar libro---");
        biblioteca.eliminarLibro(libro1);
        System.out.println("");
        //Mostrar libros
        System.out.println("---BILIOTECA---");
        biblioteca.mostrarBiblioteca();
    }
}
