/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) (Math.floor(Math.random() * 100) + 1);
        int cont = 0, numero = 0;
        boolean valido=false;
        do {
            System.out.println("Introduce un número entre 1 y 100: ");
            numero = teclado.nextInt();
            if (numero > numAleatorio) {
                System.out.println("Es menor");
                cont++;
            } else if (numero == numAleatorio) {
                System.out.println("Acertastes!!!");
                valido=true;
            } else {
                System.out.println("Es mayor");
                cont++;
            }
            
        } while (!valido);
        System.out.println("Numero de intentos: "+cont);
       
    }
}
