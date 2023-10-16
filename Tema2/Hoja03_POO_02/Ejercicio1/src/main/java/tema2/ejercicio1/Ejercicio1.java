/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double dolares=0, euros=0;
        Finanzas finanza=new Finanzas();
        //Pido por teclado los dolares que tenemos
        System.out.println("Introduce los dólares que tienes: ");
        dolares=teclado.nextDouble();
        //Muestro el cambio a euros
        System.out.printf("%.2f son en euros: %.2f\n",dolares,finanza.dolaresToEuros(dolares));
        
        //Pido los euros que tenemos
        System.out.println("Introduce los euros que tienes: ");
        euros=teclado.nextDouble();
        //Muestro la conversión a dolares
        System.out.printf("%.2f son en dolares: %.2f\n",euros,finanza.eurosToDolares(dolares));
        
        //Creamos otro objeto finanza dos con el cambio 1.10 y cin los dolares introducidos anteriormente
        Finanzas finanza2=new Finanzas(1.10);
        System.out.println("----FINANZA2 CON EL CAMBIO 1.10----");
        System.out.printf("%.2f son en euros: %.2f",dolares,finanza2.dolaresToEuros(dolares));
    }
}
