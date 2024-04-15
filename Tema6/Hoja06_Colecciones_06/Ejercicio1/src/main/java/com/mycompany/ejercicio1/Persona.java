/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author atres
 */
public class Persona implements Identificable {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona() {
        this.nombre = Teclado.introNombre("Introduce el nombre: ");
        this.apellidos = Teclado.introApellido("Introduce dos apellidos: ");
        this.fechaNacimiento = Teclado.fecha();
    }

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public Map<String, String> listaObjeto() {
        Map<String, String> matriz = new HashMap<>();

        matriz.put("Nombre: ", getNombre());
        matriz.put("Apellidos: ", getApellidos());
        matriz.put("Fecha de Nacimiento: ", Teclado.formatoFecha(getFechaNacimiento()));

        return matriz;

    }

}
