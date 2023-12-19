/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 0;
        System.out.println("Introduce el número de filas: ");
        filas = teclado.nextInt();
        System.out.println(escalera(filas));
    }
//Método que dibuja una escalera con * utilizando dos for anidados

    public static String escalera(int filas) {
        String dibujo = "";
        for (int i = 1; i <= filas; i++) {
            for (int columnas = 1; columnas <= i; columnas++) {
                dibujo = dibujo + "*" + " ";
            }
            dibujo = dibujo + "\n";
        }
        return dibujo;
    }
}
