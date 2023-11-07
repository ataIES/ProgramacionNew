/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio1;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Restaurante restaurante=new Restaurante(10,1);
        //Muestro datos antes de añadir chorizo y huevos
        System.out.println("Antes de añadir chorizo y huevos");
        restaurante.mostraRestaurante();
        restaurante.addChorizo(0.6);
        restaurante.addHuevos(2);
        //Muestro datos después de añadir
        System.out.println("Después de añadir chorizo y huevos");
        restaurante.mostraRestaurante();
        //Sirvo dos platos
        restaurante.sirvePlato();
        restaurante.sirvePlato();
        //Muestro datos
        restaurante.mostraRestaurante();
        
    }
}
