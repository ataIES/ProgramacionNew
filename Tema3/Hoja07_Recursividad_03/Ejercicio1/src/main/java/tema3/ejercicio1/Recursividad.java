/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Recursividad {

    public Recursividad() {

    }

    public static int factorial(int num) {
        int numFactorial = 0;
        if (num <= 1) {
            numFactorial = 1;
        } else {
            numFactorial = num * factorial(num - 1);
        }
        return numFactorial;
    }

    public static int sumaSusNumeros(int num) {
        int suma = 0;
        if (num <= 1) {
            suma = 1;
        } else {
            suma = num + sumaSusNumeros(num - 1);
        }
        return suma;
    }

    public static String imprimeNumeros(int num) {
        String cadena = "";
        if (num <= 0) {
            cadena += 0;
        } else {
            for (int i = 1; i <= num; i++) {
                cadena += imprimeNumeros(i) + " ";
            }
        }
        return cadena;
    }

    public static int numeroDigitos(int num) {
        int digitos = 0;

        return digitos;
    }

}
