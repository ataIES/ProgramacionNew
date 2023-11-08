/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alimento alimento = new Alimento("Muslo de cerdo", 10, 3, true);
        alimento.mostrar();
        
        String dietetico = (alimento.esDietetico()) ? "Es dietetico" : "No es dietetico";
        
        System.out.println(dietetico);
        System.out.printf("Calorias: %.2f", alimento.calorias(20));
    }

}
