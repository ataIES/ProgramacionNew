/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

/**
 *
 * @author DAW125
 * Clase Paciente
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String tlf;

    /**
     * Constructor por parámetros
     * @param dni
     * @param nombre
     * @param tlf 
     */
    public Paciente(String dni, String nombre, String tlf) {
        this.dni = dni;
        this.nombre = nombre;
        this.tlf = tlf;
    }

    /**
     * Metodos Get y Set
     * @return 
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    /**
     * Método toString que muestra datos del paciente
     * @return 
     */
    @Override
    public String toString() {
        return "Paciente{" + "dni=" + dni + ", nombre=" + nombre + ", tlf=" + tlf + '}';
    }
    
    
    
}
