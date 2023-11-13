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
        Billete billete=new Billete(810,8);
        System.out.printf("Distancia recorrida: %d \nNúmero de días: %d \nImporte total: %.2f euros",billete.getDistancia(),billete.getN_dias(),billete.importe());
    }
}
