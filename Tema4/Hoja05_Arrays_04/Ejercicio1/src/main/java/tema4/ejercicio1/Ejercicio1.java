/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Figura f= new Figura('a',6);
        System.out.println("---Cuadrado---");
        System.out.println(f.cuadrado());
        System.out.println("---Cuadrado con espacio en medio---");
        System.out.println(f.cuadradoVacio());
        System.out.println("---Aspa---");
        System.out.println(f.aspa());
    }
}
