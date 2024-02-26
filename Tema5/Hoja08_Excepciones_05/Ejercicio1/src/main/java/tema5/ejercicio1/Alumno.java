/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Alumno {

    private String nombre;
    private int[] notas;

    public Alumno(int nNotas) {
        System.out.println("Introduce el nombre del alumno: ");
        this.nombre = new Scanner(System.in).nextLine();
        this.notas = new int[nNotas];
        insertarNotas();
    }

    public String getNombre() {
        return nombre;
    }
//Metodo que muestra las notas
    public String mostrarNotas() {
        String cadena = "";
        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length - 1) {
                cadena += notas[i] + " ";
            } else {
                cadena += notas[i] + ", ";
            }
        }
        return cadena;
    }
//Metodo que muestra los datos del alumno
    public void mostrarAlumno() {
        System.out.printf("---Alumno %s---\n\tNotas: %s\n",getNombre(),mostrarNotas());
    }
//Metodo que inserta las notas
    private void insertarNotas() {
        int nota = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Validacion.validarNota("Introduce la " + (i + 1) + " nota");
        }
    }
}
