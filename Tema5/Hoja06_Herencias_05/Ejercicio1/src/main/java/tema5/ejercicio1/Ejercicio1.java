/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        DeDos deDos = new DeDos();
        System.out.println("---Imprimir los primeros 5 números de la serie---");
        for (int i = 0; i < 5; i++) {
            System.out.print(deDos.getSiguiente() + "\t");
        }
        System.out.println("");
        System.out.println("---Reinicio la serie---");
        deDos.reiniciar();
        System.out.println("---Vuelvo a mostrar los 5 siguientes elementos---");
        for (int i = 0; i < 5; i++) {
            System.out.print(deDos.getSiguiente() + "\t");
        }
        System.out.println("");
        System.out.println("---Inicializo la serie en 100---");
        deDos.setComenzar(100);
        System.out.println("---Muestro los 5 siguientes elementos---");
        for (int i = 0; i < 5; i++) {
            System.out.print(deDos.getSiguiente() + "\t");
        }
    }

}
