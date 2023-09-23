/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double radio,altura,area,volumen;
        
        System.out.println("Introduce su radio: ");
        radio=teclado.nextDouble();
        System.out.println("Introduce su altura: ");
        altura=teclado.nextDouble();
        
        area=2*Math.PI*radio*altura;
        volumen=Math.PI*Math.pow(radio, 2)*altura;
        
        System.out.printf("El área del cilindro es: %.2f \nEl volumen del cilindro es: %.2f \n",area,volumen);
        
    }
}
