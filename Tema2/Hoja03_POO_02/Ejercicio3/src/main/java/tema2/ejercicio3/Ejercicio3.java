/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio3;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Satelite satelite=new Satelite(5000,3000,20000);
       //Muestro la posicion del satelite
       satelite.printPosicion();
       
       //Vario la altura y la posicion del satelite
       satelite.variarAltura(15000);
       satelite.variarPosicion(3000, 10000);
       
       //Vuelvo a mostrar la posicion del satelite y diciendo si esta en orbita
       satelite.printPosicion();
       String orbita=satelite.enOrbita()?"En Órbita":"En la Tierra";
        System.out.println(orbita);
    }
}
