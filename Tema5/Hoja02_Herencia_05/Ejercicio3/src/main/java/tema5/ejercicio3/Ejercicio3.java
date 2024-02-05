/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Circulo c=new Circulo(1);
        Triangulo t= new Triangulo(2);
        Cuadrado cuadrado=new Cuadrado(3);
        Rombo r=new Rombo(4);
        
        System.out.println(c.toString());
        System.out.println(t.toString());
        System.out.println(cuadrado.toString());
        System.out.println(r.toString());
    }
}
