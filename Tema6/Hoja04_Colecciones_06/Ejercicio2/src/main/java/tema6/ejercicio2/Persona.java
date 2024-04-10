/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellidos;
    private String dni;
    
    public Persona(){
        this.nombre=Teclado.introNombre("Introduce el nombre: ");
        this.apellidos=Teclado.introApellidos("Introduce sus dos apellidos: ");
        this.dni=Teclado.introDni("Introduce su dni: ");
    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String mostrarPersona(){
        String cadena="";
        
        cadena+="\nNombre: "+getNombre()+"\nApellidos: "+getApellidos()+"\nDni: "+getDni();
        
        return dni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dni);
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
    public int compareTo(Persona o) {
       return this.dni.compareTo(o.dni);
    }
    
}
