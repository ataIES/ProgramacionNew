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
        System.out.println("Hello World!");
    }
    //Método que valida e introduce un número entero mayor de 0
    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número entero: ");
            numero = teclado.nextInt();
            if (numero >0) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número menor que 1");
            }
        } while (!valido);
        return numero;
    }
    
    public static int cuadrado(int num){
        return (int) Math.pow(num, 2);
    }
    public static int doble(int num){
        
    }
}
