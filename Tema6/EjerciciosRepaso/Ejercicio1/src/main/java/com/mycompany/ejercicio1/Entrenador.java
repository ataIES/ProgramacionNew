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

    private int añosExperiencia;
    private double salario;

    public Entrenador(int añosExperiencia, double salario, String nombre, String apellidos, String dni, LocalDate fechaNacimiento, String correoElectronico) {
        super(nombre, apellidos, dni, fechaNacimiento, correoElectronico);
        this.añosExperiencia = añosExperiencia;
        this.salario = salario;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
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

        cadena = String.format("\nNombre: %s\nApellidos: %s\nDni: %s\nFechaNacimiento: %s\nCorreo Electrónico: %s\nAños Experiencia: %d\nSalario: %.2f",
                 super.getNombre(), super.getApellidos(), super.getDni(), Teclado.formatoFecha(super.getFechaNacimiento()), super.getCorreoElectronico(), getAñosExperiencia(), getSalario());

        return cadena;
    }
}
