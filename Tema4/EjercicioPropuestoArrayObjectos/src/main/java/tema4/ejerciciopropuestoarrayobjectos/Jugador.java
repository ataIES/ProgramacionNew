/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejerciciopropuestoarrayobjectos;

/**
 *
 * @author DAW125
 */
public class Jugador {

    private String nombre;
    private int dorsal;
    private String posicion;

    public Jugador(String nombre, int dorsal, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void imprime() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Posicion: " + getPosicion());
        System.out.println("");
    }
}
