/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double radio,longitud,area;
        
        System.out.println("Introduce el radio de un círculo: ");
        radio=teclado.nextDouble();
        
        longitud=2*Math.PI*radio;
        area=Math.PI*radio;
        
        System.out.printf("El área del círculo es: %.2f \nLa longitud del círculo es: %.2f \n",area,longitud);
        
    }
}
