/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Tabla {

    private int[][] numeros;

    public Tabla() {
        numeros = new int[3][4];
        for (int i = 0; i < numeros.length; i++) {
            for (int a = 0; a < numeros[i].length; a++) {
                numeros[i][a] = (int) (Math.floor(Math.random() * 100) + 1);
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {
            for (int a = 0; a < numeros[i].length; a++) {
                System.out.printf("%d\t", numeros[i][a]);
            }
            System.out.println("");
        }
    }

    public int mayorF(int fila) {
        int mayor = numeros[fila-1][0];
        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[fila-1][i]) {
                mayor = numeros[fila-1][i];
            }
        }
        return mayor;
    }

    public int mayorC(int columna) {
        int mayor = numeros[0][columna-1];
        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i][columna-1]) {
                mayor = numeros[i][columna-1];
            }
        }
        return mayor;
    }

    public int media() {
        int suma = 0, cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int a = 0; a < numeros[i].length; a++) {
                suma += numeros[i][a];
                cont++;
            }
        }
        return suma / cont;
    }

}
