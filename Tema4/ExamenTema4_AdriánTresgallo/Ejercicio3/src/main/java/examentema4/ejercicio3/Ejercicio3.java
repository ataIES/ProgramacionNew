/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema4.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][25];
        rellenarEdad(matriz);
        rellenarTrabajo(matriz);
        rellenarSueldo(matriz);
        imprimirMatriz(matriz);
        System.out.println("Introduce la edad para calcular su porcentaje: ");
        int edad = teclado.nextInt();
        System.out.println("Hay un " + porcentajeEdad(matriz, edad) + "%" + " de personas con " + edad + " años");
        System.out.println("");
        System.out.println("Introduce si trabaja 1.Si 2.No: ");
        int trabajo = teclado.nextInt();
        if (trabajo == 1) {
            System.out.println("Hay un " + porcentajeEdadTrabajo(matriz, edad, trabajo) + "% de personas con " + edad + " años y trabajan");
        } else if (trabajo == 2) {
            System.out.println("Hay un " + porcentajeEdadTrabajo(matriz, edad, trabajo) + "% de personas con " + edad + " años y no trabajan");
        }
        System.out.println("introduce una edad: ");
        edad=teclado.nextInt();
        System.out.println("Introduce un trabajo: ");
        trabajo=teclado.nextInt();
        System.out.println("Introduce un sueldo: ");
        int sueldo=teclado.nextInt();
         if (trabajo == 1) {
             System.out.println("El sueldo medio de una persona de "+edad+" años y que trabaja, con un sueldo de "+sueldo+" es de "+promedioSueldo(matriz,edad,trabajo,sueldo));
        } else if (trabajo == 2) {
            System.out.println("El sueldo medio de una persona de "+edad+" años y que no trabaja, con un sueldo de "+sueldo+" es de "+promedioSueldo(matriz,edad,trabajo,sueldo));
        }

    }

    public static void rellenarEdad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                matriz[0][a] = (int) (Math.floor(Math.random() * (17 - 25)) + 25);
            }
        }
    }

    public static void rellenarTrabajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                matriz[1][a] = (int) (Math.floor(Math.random() * 2) + 1);
            }
        }
    }

    public static void rellenarSueldo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                if (matriz[1][a] == 1) {
                    matriz[2][a] = (int) (Math.floor(Math.random() * (600 - 2000)) + 2000);
                } else if (matriz[1][a] == 2) {
                    matriz[2][a] = 0;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                System.out.print(matriz[i][a] + "\t");

            }
            System.out.println("");
        }
    }

    public static int porcentajeEdad(int[][] matriz, int edad) {
        int porcentaje = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                if (matriz[0][a] == edad);
                porcentaje++;
            }
        }
        return (porcentaje * 25) / 100;
    }

    public static int porcentajeEdadTrabajo(int[][] matriz, int edad, int trabajo) {
        int porcentaje = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                if (matriz[0][a] == edad && matriz[1][a] == trabajo) {
                    porcentaje++;
                }
            }
        }
        return (porcentaje * 25) / 100;
    }

    public static int promedioSueldo(int[][] matriz, int edad, int trabajo, int sueldo) {
        double sueldoTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                if (matriz[0][a] == edad && matriz[1][a] == trabajo && matriz[2][a] == sueldo) {
                    sueldoTotal += matriz[2][a];
                }

            }
        }
        return (int) (sueldoTotal/25);
    }
}
