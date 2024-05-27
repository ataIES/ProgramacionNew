/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Agenda {
    
    private String nombre;
    private String tlf;
    private String direccion;
    private String codigoPostal;

    public Agenda(String nombre, String tlf, String direccion, String codigoPostal) {
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

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", tlf=" + tlf + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + '}';
    }
    
    
}
