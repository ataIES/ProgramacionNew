/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.comparartodos;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Pintor implements Comparable<Pintor> {

    private String nombre;
    private String ciudad;//lugar de nacimiento
    private int nacimiento; //año de nacimiento

    public Pintor(String nombre, String ciudad, int nacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Pintor{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", nacimiento=" + nacimiento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.ciudad);
        hash = 53 * hash + this.nacimiento;
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
        final Pintor other = (Pintor) obj;
        if (this.nacimiento != other.nacimiento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ciudad, other.ciudad);
    }

    @Override
    public int compareTo(Pintor o) {
        int comparacion = Integer.compare(o.nacimiento, this.nacimiento);
        if (comparacion != 0) {
            return comparacion;
        } else {
            return this.nombre.compareTo(o.nombre);
        }
    }

}
