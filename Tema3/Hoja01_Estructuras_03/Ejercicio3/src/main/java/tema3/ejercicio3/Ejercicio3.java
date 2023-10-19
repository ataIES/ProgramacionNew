/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int minutos=0,segundos=0;
        
        System.out.println("Introduce los minutos de duración de la llamada: ");
        minutos=teclado.nextInt();
        System.out.println("Introduce los segundos de duración de la llamada: ");
        segundos=teclado.nextInt();
        
        Llamada llamada=new Llamada();
        System.out.printf("Duración de la llamada %d:%d \nPrecio a pagar: %.2f",minutos,segundos,llamada.aPagar(minutos, segundos));
        
        
    }
}
