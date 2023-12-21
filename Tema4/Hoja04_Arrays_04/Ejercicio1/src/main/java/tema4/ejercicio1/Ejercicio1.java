/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int matriz1[][] = {{101, 102, 103, 104, 105}, {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305}, {401, 402, 403, 404, 405}, {501, 502, 503, 504, 505}};
        System.out.println("---Mostrar diagonal---");
        diagonalInversa(matriz1);
    }

    //Validar filas
    public static int validarFila(int matriz[][]) {
        Scanner teclado = new Scanner(System.in);
        int fila = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce la fila a mostrar: ");
            fila = teclado.nextInt();
            if (fila >= 0 && fila <= matriz.length) {
                valido = true;
            } else if (fila > matriz.length) {
                System.out.println("Error, sobrepasa el límite de la matriz");
            }
        } while (!valido);
        return fila;
    }

    //Validar columnas
    public static int validarColumna(int matriz[][]) {
        Scanner teclado = new Scanner(System.in);
        int columna = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce la columna a mostrar: ");
            columna = teclado.nextInt();
            if (columna >= 0 && columna <= matriz[matriz.length - 1].length) {
                valido = true;
            } else if (columna > matriz[matriz.length - 1].length) {
                System.out.println("Error, sobrepasa el límite de la matriz");
            }
        } while (!valido);
        return columna;
    }
//Mostrar fila pedida por teclado

    public static void fila(int matriz[][]) {
        int fila = validarFila(matriz);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[fila - 1][i] + " ");
        }
    }

    //Mostrar columna 
    public static void columna(int matriz[][]) {
        int columna = validarColumna(matriz);
        for (int j = 0; j < matriz.length; j++) {
            System.out.println(matriz[j][columna - 1]);
        }
    }

    //Mostrar Diagonal
    public static void diagonal(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    //Mostrar diagonal inversa
    public static void diagonalInversa(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i+j==matriz.length-1){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    //Mostrar elementos diagonal hacia arriba
  
    
}
