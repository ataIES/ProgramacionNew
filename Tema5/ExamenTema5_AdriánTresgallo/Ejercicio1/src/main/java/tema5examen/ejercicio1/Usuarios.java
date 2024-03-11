/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5examen.ejercicio1;

import java.util.Objects;

/**
 *
 * @author Adrian Tresgallo Arozamena DAW125
 */
public class Usuarios {

    private String nombre;
    private String apellidos;

    //Constructor por defecto que pide los datos por teclado
    public Usuarios() {
        this.nombre = Teclado.validarString("Introduce el nombre de Usuario: ");
        this.apellidos = Teclado.validarString("Introduce los apellidos: ");
    }

    //Constructor por parámetros 
    public Usuarios(String nombre1, String apellidos1) {
        this.nombre = nombre1;
        this.apellidos = apellidos1;
    }

    //Get y set
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        return this.apellidos.equals(other.apellidos);
    }

    //Metodo toString para mostrar el usuario
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nApellidos: " + getApellidos();
    }

}
