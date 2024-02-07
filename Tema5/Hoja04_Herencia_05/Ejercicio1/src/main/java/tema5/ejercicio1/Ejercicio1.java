/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Publicacion publicaciones[] = new Publicacion[3];
        Metodos.aniadirPublicaciones(publicaciones);
        Metodos.mostrar(publicaciones);

        System.out.println("---Mostrar 3 primeras letras del título y autor del disco de más larga duración-- ");
        System.out.println(Metodos.discoLargaDuracion(publicaciones));

        System.out.println("---Mostrar titulo y autor de libros editados en el mes en curso y que tenga más de 1000 páginas--- ");
        System.out.println(Metodos.libro1000paginas(publicaciones));
    }
}
