/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Curso {

    private String nombreCurso;
    private String[] alumnos;
    
//Constructos con parametros
    public Curso(int nAlumnos) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del Curso: ");
        this.nombreCurso = teclado.nextLine();
        this.alumnos = new String[nAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del " + (i + 1) + "º alumno: ");
            alumnos[i] = teclado.nextLine();
        }
    }
//Metodo que muestra las iniciales, seguida de puntos
    public void iniciales() {
        String iniciales = "";
        for (int i = 0; i < alumnos.length; i++) {
            for (int a = 0; a < alumnos[i].length(); a++) {
                if (a == 0) {
                    iniciales += alumnos[i].toUpperCase().charAt(0);
                } else {
                    iniciales += ".";
                }
            }
            if (i == alumnos.length - 1) {
                iniciales += " ";
            } else {
                iniciales += ", ";
            }
        }
        System.out.println(iniciales);
    }
//Metodo que desplaza a la derecha todos los alumnos
    public void desplaza() {
        String aux = alumnos[alumnos.length - 1];
        for (int i = alumnos.length - 1; i > 0; i--) {
            alumnos[i] = alumnos[i - 1];
        }
        alumnos[0] = aux;

    }
//Metodo que devuelve el nombre de una posicion pasada por parámetros
    public String verNombre(int pos) {
        return alumnos[pos - 1];
    }
//Metodo que devuelve un boolean si el nombre es daw
    public boolean esDAW() {
        return nombreCurso.equalsIgnoreCase("DAW");
    }
//Metodo que muestra los datos
    public void mostrar() {
        String alumno = "";
        System.out.println("---DATOS DEL CURSO---");
        System.out.printf("\tNombre del curso: %s\n", nombreCurso);
        for (int i = 0; i < alumnos.length; i++) {
            if (i == alumnos.length - 1) {
                alumno += alumnos[i] + " ";
            } else {
                alumno += alumnos[i] + ", ";
            }
        }
        System.out.println("\tLista de alumnos: " + alumno);
    }
}
