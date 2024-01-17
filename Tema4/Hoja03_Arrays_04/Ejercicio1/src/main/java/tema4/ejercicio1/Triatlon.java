/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Triatlon {

    private int dorsal;
    private String nombre;
    private int[] puntuaciones;

    //Constructor por parámetros que pide por teclado las puntuaciones
    public Triatlon(int dorsal, String nombre, int nPuntuaciones) {
        Scanner teclado = new Scanner(System.in);
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.puntuaciones = new int[nPuntuaciones];
        boolean valido = false;
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = validarPuntuacion("Introduce la " + (i + 1) + "º puntuación:");
        }
    }
//Constructor sin parámetros
    public Triatlon() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce su dorsal: ");
        this.dorsal = teclado.nextInt();
        System.out.println("Introduce su nombre: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce el número de puntuaciones: ");
        int nPuntuaciones = teclado.nextInt();
        this.puntuaciones = new int[nPuntuaciones];
        boolean valido = false;
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = validarPuntuacion("Introduce la " + (i + 1) + "º puntuación:");
        }
    }
//Metodo que valida las puntuaciones que no sean negativas
    public int validarPuntuacion(String cadena) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int puntuacion = 0;
        do {
            System.out.println(cadena);
            puntuacion = teclado.nextInt();
            if (puntuacion > 0) {
                valido = true;
            } else {
                System.out.println("Error, no puede ser una puntuación menor que 0");
            }
        } while (!valido);
        return puntuacion;
    }
//Metodo que calcula la media de todas las puntuaciones
    public int pMedia() {
        int suma = 0, totalPuntuaciones = puntuaciones.length;
        for (int i = 0; i < puntuaciones.length; i++) {
            suma += puntuaciones[i];
        }
        return suma / totalPuntuaciones;
    }
//Metodo que devuelve boolean si hay alguna puntuacion que supere el 10
    public boolean esSeleccionado() {
        boolean seleccionado = false;
        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > 10) {
                seleccionado = true;
            }
        }
        return seleccionado;
    }
//Metodo que formatea las puntuaciones
    public String puntuacion() {
        String cadena = "";
        for (int i = 0; i < puntuaciones.length; i++) {
            if (i == puntuaciones.length - 1) {
                cadena += puntuaciones[i];
            } else {
                cadena += puntuaciones[i] + ", ";
            }
        }
        return cadena;
    }
//Metodo que muestra los datos
    public String mostrar() {
        return "---DATOS DEL PARTICIPANTE--- \n\tDorsal= " + this.dorsal + "\n\tNombre del participante: " + this.nombre
                + "\n\tPuntos: " + puntuacion() + "\n\tMedia: " + pMedia();
    }

}
