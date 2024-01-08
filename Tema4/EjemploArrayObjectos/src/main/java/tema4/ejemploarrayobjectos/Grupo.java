/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejemploarrayobjectos;

import java.time.LocalDate;

/**
 *
 * @author DAW125
 */
public class Grupo {

    private int numeroAlumnos;
    private String nombre;
    private Alumno[] estudiantes;

    public Grupo(int numeroAlumnos, String nombre) {
        this.numeroAlumnos = numeroAlumnos;
        this.nombre = nombre;
        estudiantes = new Alumno[numeroAlumnos];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Alumno("Nombre " + (i + 1), "Apellidos "
                    + (i + 1), 0, LocalDate.now());
        }
    }

    /**
     * Nos muestra por pantalla la información del Grupo
     */
    public void print() {
        System.out.println("Grupo : " + nombre);
        System.out.println("Numero de alumnos: " + numeroAlumnos);
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].imprime();
        }
    }
}
