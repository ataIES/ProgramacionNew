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
//Método que dibuja una escalera de números

    public static void triangulo(int numeroFilas) {
        int numero = 1;
        int columna = 1;
        String dibujo = "";
        for (int i = 1; i <= numeroFilas; i++) {
            for (columna = 1; columna <= i; columna++) {
                dibujo = dibujo + numero + " ";
                numero++;
            }

            dibujo = dibujo + "\n";
        }
        System.out.print(dibujo);
    }
}
