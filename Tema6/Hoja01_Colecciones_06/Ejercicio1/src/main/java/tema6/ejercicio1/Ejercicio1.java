/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Integer>lista=new ArrayList<>();
        int suma=0;
        int media=0;
        System.out.println("---Introducción de números---");
        lista=Metodos.leeValores();
        suma=Metodos.calcularSuma(lista);
        media=Metodos.calcularMedia(lista);
        
        Metodos.mostrarResultados(lista, suma, media);
    }
}
