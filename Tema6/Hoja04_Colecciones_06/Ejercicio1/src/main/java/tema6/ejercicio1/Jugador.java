/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Jugador implements Comparable<Jugador>{

    private String nombre;
    private float estatura;

    public Jugador() {
        this.nombre = Teclado.introNombre("Introduce nombre y dos apellidos");
        this.estatura = Teclado.introEstatura("Introduce la estatura en metros: ");
    }

    public Jugador(String nombre, float estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public String mostrarJugador() {
        String cadena = "";

        cadena = String.format("\nNombre del Jugador: %s\nEstatura: %.2f", getNombre(), getEstatura());

        return cadena;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Jugador o) {
        return Float.compare(o.estatura, this.estatura);
    }
      
}
