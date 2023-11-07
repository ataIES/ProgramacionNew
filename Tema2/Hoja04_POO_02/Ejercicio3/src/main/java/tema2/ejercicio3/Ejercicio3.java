/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio3;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Monedero monedero=new Monedero(20);
        monedero.aniadirDinero(10.4);
        System.out.printf("Tienes: %.2f euros \n",monedero.getDinero_disponible());
        monedero.sacarDinero(50);
        System.out.printf("Tienes: %.2f euros\n",monedero.getDinero_disponible());
        monedero.sacarDinero(20);
        System.out.printf("Tienes: %.2f euros\n",monedero.getDinero_disponible());
    }
}
