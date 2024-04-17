/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author atres
 */
public class Entrenador extends Persona {

    private int a�osExperiencia;
    private double salario;

    public Entrenador(int a�osExperiencia, double salario, String nombre, String apellidos, String dni, LocalDate fechaNacimiento, String correoElectronico) {
        super(nombre, apellidos, dni, fechaNacimiento, correoElectronico);
        this.a�osExperiencia = a�osExperiencia;
        this.salario = salario;
    }

    public int getA�osExperiencia() {
        return a�osExperiencia;
    }

    public void setA�osExperiencia(int a�osExperiencia) {
        this.a�osExperiencia = a�osExperiencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena = String.format("\nNombre: %s\nApellidos: %s\nDni: %s\nFechaNacimiento: %s\nCorreo Electr�nico: %s\nA�os Experiencia: %d\nSalario: %.2f",
                 super.getNombre(), super.getApellidos(), super.getDni(), Teclado.formatoFecha(super.getFechaNacimiento()), super.getCorreoElectronico(), getA�osExperiencia(), getSalario());

        return cadena;
    }
}
