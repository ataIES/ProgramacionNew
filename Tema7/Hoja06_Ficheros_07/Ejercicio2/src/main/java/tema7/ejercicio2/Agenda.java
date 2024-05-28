/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author DAW125
 */
public class Agenda implements Serializable {
    
    private String nombre;
    private int tlf;
    private String direccion;
    private int codigoPostal;

    public Agenda(String nombre, int tlf, String direccion, int codigoPostal) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", tlf=" + tlf + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + '}';
    }
    
    
}
