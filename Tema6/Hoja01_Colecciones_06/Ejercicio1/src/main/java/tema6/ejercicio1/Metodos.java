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
        boolean insertado = false;
        int num = 0;
        while (!insertado) {
            num = Validacion.validarNumeros();
            if (num != -99) {
                if (lista.add(num)) {
                    System.out.println("Añadido el número " + num + " correctamente");
                } else {
                    System.out.println("No se pudo añadir el número " + num);
                }
            } else {
                System.out.println("Fin de la insercción");
                insertado = true;
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
    public static double calcularMedia(ArrayList<Integer> lista) {
        int totalNumeros = lista.size();
        double media = (double) calcularSuma(lista) / totalNumeros;

        return media;
    }

    public static int numerosSuperioresMedia(ArrayList<Integer> lista, double media) {
        int superioresMedia = 0;
        for (int num : lista) {
            if (num > media) {
                superioresMedia++;
            }
        }
        return superioresMedia;
    }

    //Metodo que muestra lo que contiene la lista con su suma y media;
    public static void mostrarResultados(ArrayList<Integer> lista) {
        int suma = calcularSuma(lista);
        double media = calcularMedia(lista);
        System.out.println("\n---Lista de números entero---");
        for (int num : lista) {
            System.out.printf("%d\t", num);
        }
        System.out.printf("\nLa suma es: %d", suma);
        System.out.printf("\nLa media es: %.2f", media);
        System.out.printf("\nNúmeros superiores a la media: %d", numerosSuperioresMedia(lista, media));
    }

}
