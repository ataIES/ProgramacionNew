/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio6;

/**
 *
 * @author daw1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        String telefono = "55345678900";
        String telefono_nuevo = "(" + telefono.substring(0, 2) + ")-" + telefono.charAt(2) + "-" + telefono.charAt(3) + telefono.substring(4, telefono.length());
        System.out.println("---Formato Viejo--\n" + telefono + "\n\n---Formato Nuevo---\n" + telefono_nuevo);

    }
}
