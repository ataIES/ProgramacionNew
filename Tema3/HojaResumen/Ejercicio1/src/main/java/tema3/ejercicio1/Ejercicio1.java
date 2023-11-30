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
        int numeroFilas = 0;
        numeroFilas = validarNumero();
        System.out.println("--Dibujo del Triángulo---");
        triangulo(numeroFilas);
    }

    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número entero positivo: ");
            numero = teclado.nextInt();
            if (numero > 0) {
                valido = true;
            } else if (numero < 0) {
                System.out.println("Error, has introducido un número negativo");
            } else {
                System.out.println("Error, has introducido un 0");
            }
        } while (!valido);
        return numero;
    }

    public static void triangulo(int numeroFilas) {
        int nEspacios = numeroFilas - 1, numero=1;
        String filas = "";
        for (int i = 0; i < numeroFilas; i++) {
            filas=filas.concat(numero+" ");
            System.out.println(filas);
            numero++;
            while (nEspacios <= 0) {
                System.out.print(" ");
                nEspacios--;
            }
            
                
        }
    }
}
