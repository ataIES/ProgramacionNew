/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5.ejercicio2;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Gato g= new Gato("Pelos","Gato",4,"Carne");
        System.out.println(g.toString());
        System.out.println(g.araniar());
        System.out.println(g.obedecer());
    }
}
