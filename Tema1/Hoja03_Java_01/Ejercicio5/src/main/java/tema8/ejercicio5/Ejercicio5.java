/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantSegundos=0,horas,minutos,seg;
        
        System.out.println("Introduce una cantidad en segundos: ");
        cantSegundos=teclado.nextInt();
        
        seg=cantSegundos%60;
        minutos=cantSegundos/60;
        horas=cantSegundos/3600;
        
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" segundos: "+seg);
        
    }
}
