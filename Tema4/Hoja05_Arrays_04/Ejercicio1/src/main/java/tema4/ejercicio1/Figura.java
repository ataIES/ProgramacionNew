/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Figura {

    private char[][] matriz;
    private char letra;

    public Figura(char letra, int tamano) {
        this.letra = letra;
        this.matriz = new char[tamano][tamano];
    }
//Método que crea un cuadrado relleno de una misma letra
    public String cuadrado() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                matriz[i][a] = letra;
                cadena += matriz[i][a] + " ";
            }
            cadena += "\n";
        }
        return cadena;
    }
//Metodo que crea un cuadrado solo con sus lados
    public String cuadradoVacio() {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {

            for (int a = 0; a < matriz[i].length; a++) {

                if (i != 0 && i != (matriz.length - 1)) {

                    if (a != 0 && a != (matriz[i].length - 1)) {
                        matriz[i][a] = ' ';
                        result = result.concat(String.valueOf(matriz[i][a]) + " ");
                    } else {
                        matriz[i][a] = letra;
                        result = result.concat(String.valueOf(matriz[i][a]) + " ");
                    }

                } else {
                    matriz[i][a] = letra;
                    result = result.concat(String.valueOf(matriz[i][a]) + " ");
                }

            }
            result = result.concat("\n");
        }
        return result;
    }
//Metodo que crea un aspa
    public String aspa() {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                if (i == a || i + a == matriz.length - 1) {
                    matriz[i][a] = letra;
                    result = result.concat(String.valueOf(matriz[i][a]) + " ");
                } else {
                    matriz[i][a] = ' ';
                    result = result.concat(String.valueOf(matriz[i][a] + " "));
                }
            }
            result = result.concat("\n");
        }
        return result;
    }

}
