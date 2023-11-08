/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro libro1=new Libro("9788499640884","harry Potter","jK ROWLING");
        libro1.mostrarLibro();
        System.out.println("¿Es español? "+libro1.esEspaniol());
    }
}
