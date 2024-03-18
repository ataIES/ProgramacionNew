/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

/**
 *
 * @author atres
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;
    private String dni;

    public Persona() {
        this.nombre = ValidaDatos.validaNombre("Introduce su nombre: ");
        this.apellido = ValidaDatos.validaNombre("Introduce su apellido: ");
        this.dni = ValidaDatos.validarDni("Introduce el dni: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " " + getApellido() + " DNI: " + getDni();
    }

    @Override
    public int compareTo(Persona o) {
        int compNombre = this.getNombre().compareToIgnoreCase(o.getNombre());
        if (compNombre != 0) {
            return compNombre;
        } else {
            return this.getApellido().compareToIgnoreCase(o.getApellido());
        }
    }

}
