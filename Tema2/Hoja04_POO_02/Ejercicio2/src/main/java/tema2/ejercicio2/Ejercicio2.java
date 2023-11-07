/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio2;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Coche coche1=new Coche("123RET",20);
        coche1.acelera(100);
        System.out.println(coche1.mostrarCoche());
        coche1.frena(50);
        System.out.println(coche1.mostrarCoche());
        System.out.println(coche1.mostrarLetras());
        
    }
}
