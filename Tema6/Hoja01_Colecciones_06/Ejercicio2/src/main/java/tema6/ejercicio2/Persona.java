/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author atres
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona() {
        this.nombre = ValidaDatos.validarNombre();
        this.fechaNacimiento = ValidaDatos.validarFecha();
        this.dni = ValidaDatos.validarDni();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Metodo que calcula la edad
    public int edad() {
        int edad = 0;
        LocalDate hoy = LocalDate.now();

        edad = Period.between(fechaNacimiento, hoy).getYears();
        return edad;
    }

    //Metodo que muestra los datos de la asociacion
    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        return "\nNombre de la persona: " + getNombre() + "\nFecha de Nacimiento: " + getFechaNacimiento().format(f)
                + "\nDNI: " + getDni() + "\nEdad: " + edad();
    }
    
    //Metodo que compara los dni
    @Override
    public int compareTo(Persona o) {
        return this.getDni().compareTo(o.getDni());
    }
}
