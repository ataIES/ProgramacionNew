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
public class Alumno {

    private String nombre;
    private String apellidos;
    private double nota;
    private LocalDate fechaNacimiento;

    public Alumno(String nombre, String apellidos, double nota, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getNota() {
        return nota;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    

    public String imprime() {
        return "\nNombre Alumno: " + getNombre() + "\nApellidos: " + getApellidos() + "\nNotas: "
                + String.format("%.2f", getNota()) + getFechaNacimiento();
    }
}
