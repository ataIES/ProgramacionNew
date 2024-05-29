/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author DAW125
 */
public class Alumno implements Serializable,Comparable<Alumno> {

    private String nombreAlumno;
    private int nota;

    public Alumno() {
        this.nombreAlumno = Teclado.introNombre("Introduce el nombre del alumno: ");
        this.nota = Teclado.introNota("Introduce su nota: ");
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return o.getNombreAlumno().compareToIgnoreCase(this.getNombreAlumno());
    }

}
