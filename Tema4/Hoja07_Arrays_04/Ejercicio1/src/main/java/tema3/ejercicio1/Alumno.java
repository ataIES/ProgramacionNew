/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Alumno {

    private String nombreAlumno;
    private int[] notas;

    public Alumno(String nombre1) {
        this.nombreAlumno = nombre1;
        this.notas = new int[5];
        introducirNotas();
    }

    public void introducirNotas() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextInt();
        }
    }

    public int mayor() {
        Arrays.sort(notas);
        return notas[notas.length - 1];
    }

    public int menor() {
        Arrays.sort(notas);
        return notas[0];
    }

    public void ponerACero() {
        Arrays.fill(notas, 0);
    }

    public int buscar(int nota) {
        Arrays.sort(notas);
        return Arrays.binarySearch(notas, nota);
    }

    public int[] tresMejores() {
        int[] tresMejores = new int[5];
        Arrays.sort(notas);
        tresMejores = Arrays.copyOfRange(notas, 2, notas.length);
        return tresMejores;
    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length - 1) {
                cadena += notas[i];
            } else {
                cadena += notas[i] + ", ";
            }
        }
        return cadena;
    }

}
