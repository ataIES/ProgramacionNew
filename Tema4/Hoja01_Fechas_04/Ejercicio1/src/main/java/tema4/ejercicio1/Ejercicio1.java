/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Letra[] lista_letra = new Letra[2];
        crearLetras(lista_letra);
        System.out.println("\n---Mostrar información de la letras---");
        mostrarLetras(lista_letra);
        System.out.println(" ");
        System.out.println("Demorar todas las letras 15 días");
        demorarLetras(lista_letra);
        System.out.println(" ");
        mostrarLetras(lista_letra);
        System.out.println("\nMostrar titular y los número días que faltan");
        mostrarDiasFaltan(lista_letra);
    }

    public static void crearLetras(Letra[] letra) {
        for (int i = 0; i < letra.length; i++) {
            letra[i] = new Letra();
        }
    }

    public static void mostrarLetras(Letra[] letra) {
        for (int i = 0; i < letra.length; i++) {
            letra[i].mostrar();
        }
    }

    public static void demorarLetras(Letra[] letra) {
        for (int i = 0; i < letra.length; i++) {
            letra[i].demora(15);
        }
    }

    public static void mostrarDiasFaltan(Letra[] letra) {
        for (int i = 0; i < letra.length; i++) {
            System.out.println("\nTitular: " + letra[i].getTitular() + "\nDías que faltan hasta vencer: " + letra[i].diasFaltan());
        }
    }

}
