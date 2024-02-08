/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        validarEnteroDouble();
    }

    public static void validarEnteroDouble() {
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        double decimal = 0;
        boolean valido = false;
        while(valido){
            try{
                System.out.println("Introduce un número entero: ");
                entero=teclado.nextInt();
                System.out.println("Introduce un número decimal: ");
                decimal=teclado.nextDouble();
                valido=true;
               
            }catch(InputMismatchException i){
                System.out.println("Error, debes introducir un entero y un decimal");
            }
        }
        System.out.println("Número entero: "+entero);
        System.out.printf("Número decimal: %.2f",decimal);

    }
}
