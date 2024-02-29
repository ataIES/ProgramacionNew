/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.comparartodos;

import java.util.Arrays;

/**
 *
 * @author DAW125
 */
public class CompararTodos {

    public static void main(String[] args) {
        Pintor[] museo = new Pintor[4];

        museo[0] = new Pintor("Goya", "FuendeTodos", 1746);
        museo[1] = new Pintor("Picaso", "Málaga", 1881);
        museo[2] = new Pintor("Velázquez", "Sevilla", 1599);
        museo[3] = new Pintor("Dalí", "Figuera", 1904);
        // museo[3]=new Pintor("Goya","FuendeTodos",1746);
        //museo[3]=museo[0];
        System.out.println(museo[0].toString() + "\n");

        //¿Qué pasaría si invoco el hashCode?
        //con for each
        for (Pintor p : museo) {
            if (p != null) {
                System.out.println(p.toString() + " hashCode: " + p.hashCode());
            }
        }
        System.out.println(museo[1].getNombre().compareTo(museo[0].getNombre()));
        /*el metodo compareTo debe seguir la regla de que si a.compareTo(b)devuelve un número negativo
          a debería estar antes de b en la secuencia
          si devuelve cero, a y b son iguales
          si devuelve un número positivo, a debería estar después de b en la ordenacion
         */
        System.out.println("Probamos el equals");
        System.out.println(museo[0].equals(museo[1]));

        for (Pintor p : museo) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
        System.out.println("Museo ordenado");
        Arrays.sort(museo);
         for (Pintor p : museo) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }
}
