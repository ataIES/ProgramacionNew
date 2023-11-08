/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10, 40);
        System.out.println("Largo: " + r1.getLargo() + "\nAncho: " + r1.getAncho() + "\nÁrea: " + r1.area()
                + "\nDiagonal: " + r1.diagonal());
    }
}
