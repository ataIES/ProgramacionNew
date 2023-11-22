/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Carta carta1 = new Carta();
        Carta carta2 = new Carta();
        System.out.println(carta1.mostrar());
        System.out.println(carta2.mostrar());
        
        mayorCarta(carta1,carta2);
    }

    public static void mayorCarta(Carta carta1, Carta carta2) {
        if (carta1.getNumeroCarta() > carta2.getNumeroCarta()) {
            System.out.println(carta1.mostrar() + " es mayor que " + carta2.mostrar());
        } else {
            System.out.println(carta2.mostrar() + " es mayor que " + carta1.mostrar());
        }
    }
}
