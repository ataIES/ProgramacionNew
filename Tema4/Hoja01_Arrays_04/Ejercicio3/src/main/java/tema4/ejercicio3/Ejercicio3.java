/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        int numeroBuscar=0;
        boolean encontrado=false;
        String cadena="";
        for (int i=0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
            cadena+=numeros[i]+" ";
        }
        System.out.println(cadena);
        numeroBuscar=validarNumero("Introduce un número a buscar entre (0-10):");
        for(int i=0;i<numeros.length && !encontrado;i++){
            if(numeros[i]==numeroBuscar){
                System.out.println("Está en la posición "+i);
                encontrado=true;
            }else{
                System.out.println("Número no encontrado");
            }
        }
    }

    public static int validarNumero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            numero = teclado.nextInt();
            if (numero >= 0 && numero <= 10) {
                valido = true;
            } else {
                System.out.println("Error, número fuera del rango (0-10)");
            }
        } while (!valido);
        return numero;
    }
}
