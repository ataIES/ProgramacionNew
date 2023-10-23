/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio4;

/**
 *
 * @author daw1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("");
        //Saco todos los números hasta el 100
        for (int i = 0; i < 100; i++) {
            //Cuando i sea multiplo de 10, introduzco el Ciclo 
            if (i % 10 == 0) {
                System.out.println("Ciclo Nº " + (i + 1));
            }
            System.out.println(i + 1);
        }
    }
}
