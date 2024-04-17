/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD06HOSTREAM1EJ03;

/**
 *
 * @author pe
 */
public class Jugador implements Comparable<Jugador> {

    private String nombre;
    private float altura;

    public Jugador(String nombre, float altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Jugador jugador) {
       if (jugador.altura == this.altura) {
            return 0;
        } else if (this.altura > jugador.altura) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", altura=" + altura + "\n";
    }

}
