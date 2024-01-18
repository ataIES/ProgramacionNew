/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Sopa {

    private char[][] sopa;

    public Sopa() {
        this.sopa = new char[10][20];
        for (int i = 0; i < sopa.length; i++) {
            for (int a = 0; a < sopa[i].length; a++) {
                //letraAleatorio=(char) (Math.floor(Math.random()*(90-65)+65);
                char letraAleatorio = (char) ('A' + Math.floor(Math.random() * 26));
                sopa[i][a] = letraAleatorio;
            }
        }
    }

    public Sopa(int fila, int columna) {
        this.sopa = new char[fila][columna];
        for (int i = 0; i < sopa.length; i++) {
            for (int a = 0; a < sopa[i].length; a++) {
                //letraAleatorio=(char) (Math.floor(Math.random()*(90-65)+65);
                char letraAleatorio = (char) ('A' + Math.floor(Math.random() * 26));
                sopa[i][a] = letraAleatorio;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < sopa.length; i++) {
            for (int a = 0; a < sopa[i].length; a++) {
                System.out.print(sopa[i][a] + " ");
            }
            System.out.println("");
        }
    }

    public void setPalabra(String palabra, int x, int y, int d) {
        int fila = x;
        int columna = y;
        boolean terminar = false;
       

        for (int s = 0; s < palabra.length() && !terminar; s++) {
            switch (d) {
                case 1 -> {
                    if (palabra.length() <= sopa.length - 1) {
                        sopa[fila][columna] = palabra.charAt(s);
                        columna++;
                    } else {
                        System.out.println("Longitud de la palabra se excede a la longitud de la fila");
                        terminar = true;
                    }
                }

                case -1 -> {
                    if (palabra.length() <= sopa.length - 1) {
                        sopa[fila][columna] = palabra.charAt(s);
                        fila++;
                    } else {
                        System.out.println("Longitud de la palabra se excede a la longitud de la columna");
                        terminar = true;

                    }
                }

                default -> {
                    System.out.println("Número no valido");
                    terminar = true;
                }

            }
        }
    }
}
