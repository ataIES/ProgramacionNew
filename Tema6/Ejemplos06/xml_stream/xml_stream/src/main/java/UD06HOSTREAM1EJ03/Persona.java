/*
 */
package UD06HOSTREAM1EJ03;

import java.util.Objects;

/**
 *
 * @author pe
 */
public class Persona implements Comparable<Persona> {
     private String nombre, apellidos;
    private String dni;
    

    public Persona(String nombre, String apellidos,String dni) {
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "\n";
    }
    @Override
     public int compareTo(Persona persona) {
        // Indica en base a qué atributos se compara el objeto 
        // Devuelve +1 si this es > que objeto 
        // Devuelve -1 si this es < que objeto 
        // Devuelve 0 si son iguales 
        return this.dni.compareTo(persona.dni);
     }

}
