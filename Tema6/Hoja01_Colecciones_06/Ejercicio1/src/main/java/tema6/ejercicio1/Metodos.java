/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW125
 */
public class Metodos {

    //Metodo que pide números y los añade a la lista -99 para dejar de añadir
    public static ArrayList<Integer> leeValores() {
        ArrayList<Integer> lista = new ArrayList<>();
        boolean negativo = false;
        int num = 0;
        while (!negativo) {
            num = Validacion.validarNumeros();
            if (num != -99) {
                if (lista.add(num)) {
                    System.out.println("Añadido el número " + num + " correctamente");
                } else {
                    System.out.println("No se pudo añadir el número " + num);
                }
            }else{
                System.out.println("Fin de la insercción");
                negativo=true;
            }
        }

        return lista;
    }

    //Metodo que calcula la suma de todos los elementos del arraylist
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    //Metodo que calcula la media de los elementos de la lista
    public static int calcularMedia(ArrayList<Integer> lista) {
        int totalNumeros = lista.size();
        return calcularSuma(lista) / totalNumeros;
    }
    
    //Metodo que muestra lo que contiene la lista con su suma y media;
    public static void mostrarResultados(ArrayList<Integer> lista, int suma, int media) {
        System.out.println("Lista de números");
        for (int num : lista) {
            System.out.printf("%d\t",num);
        }
        System.out.println("");
        System.out.printf("\nLa suma es: %d", suma);
        System.out.printf("\nLa media es: %d", media);
    }

}
