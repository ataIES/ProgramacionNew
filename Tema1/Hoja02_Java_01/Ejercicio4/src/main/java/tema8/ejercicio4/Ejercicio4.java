/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Cálculo área del triangulo
        Scanner teclado=new Scanner(System.in);
        double altura,base,area;
        
        //Pido los datos por pantalla
        System.out.println("Introduce la altura del triángulo: ");
        altura=teclado.nextDouble();
        System.out.println("Introduce la base del triángulo: ");
        base=teclado.nextDouble();
        
        //Calculo el área del triángulo
        area=(base*altura)/2;
        //Muestro los datos por pantalla
        System.out.printf("El área del triángulo es: %.2f",area);
        
    }
}
