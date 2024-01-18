/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Sopa sopa=new Sopa(10,10);
        sopa.mostrar();
        sopa.setPalabra("Buenas", 11, 11, 1);
        System.out.println(" ");
        sopa.mostrar();
    }
}
