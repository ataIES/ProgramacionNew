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
        apartado3();
    }

    //Inicializar todas las posiciones a -2
    public static void apartado1() {
        int array[] = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Inicializar todas las posiciones a -1 mediante un for
    public static void apartado2() {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
            System.out.print(array[i] + " ");
        }
    }

    //Inicializar todas las posiciones a un valor aleatorio mediante un for
    public static void apartado3() {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 15);
            System.out.print(array[i] + " ");
        }
    }
}
