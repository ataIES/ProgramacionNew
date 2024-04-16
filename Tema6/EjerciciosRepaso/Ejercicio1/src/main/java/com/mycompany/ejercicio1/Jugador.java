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
public class Jugador extends Persona {

    private int dorsal;
    private double estatura;

    public Jugador(int dorsal, double estatura, String nombre, String apellidos, String dni, LocalDate fechaNacimiento, String correoElectronico) {
        super(nombre, apellidos, dni, fechaNacimiento, correoElectronico);
        this.dorsal = dorsal;
        this.estatura = estatura;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String mostrarInformacion() {
        String cadena = "";

       cadena = String.format("\nNombre: %s\nApellidos: %s\nDni: %s\nFechaNacimiento: %s\nCorreo Electrónico: %s\nDorsal: %d\nEstatura: %.2f",
                 super.getNombre(), super.getApellidos(), super.getDni(), Teclado.formatoFecha(super.getFechaNacimiento()), super.getCorreoElectronico(), getDorsal(), getEstatura());

        return cadena;
    }

}
