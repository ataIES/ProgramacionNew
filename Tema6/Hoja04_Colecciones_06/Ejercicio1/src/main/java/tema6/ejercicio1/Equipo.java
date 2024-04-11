/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW125
 */
public class Equipo {

    private SortedSet<Jugador> listaJugadores;

    public Equipo() {
        this.listaJugadores = new TreeSet<>();
    }

    public void insertarJugador() {
        try {
            Jugador jugador = new Jugador();
            if (listaJugadores.add(jugador)) {
                System.out.println("Jugador " + jugador.getNombre() + " añadido correctamente");
            } else {
                throw new Exception("Error, no se ha añadido el jugador");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void borrarJugador(String nombre) {
        try {
            Jugador jugador = buscarJugadorPorNombre(nombre);
            if (jugador != null) {
                if (listaJugadores.remove(jugador)) {
                    System.out.println("Jugador " + nombre + " borrado correctamente");
                } else {
                    throw new Exception("Error, no se pudo borrar al jugador");
                }
            } else {
                throw new NullPointerException("Error, el jugador " + nombre + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String mostrarTodosJugadores(){
        String cadena="\n\t---Lista de Los Jugadores---";
        for(Jugador j:listaJugadores){
            cadena+=j.mostrarJugador();
        }
        return cadena;
    }
    public Jugador masBajo(){
        Jugador masBajo=null;
        
        masBajo=listaJugadores.last();
        
        return masBajo;
    }
    public Jugador masAlto(){
        Jugador masAlto=null;
        
        masAlto=listaJugadores.first();
        
        return masAlto;
    }
    
    public SortedSet<Jugador> jugadores2Metros(){
        SortedSet<Jugador>jugadores2Metros=new TreeSet<>();
        for(Jugador j:listaJugadores){
            if(j.getEstatura()>=2){
                jugadores2Metros.add(j);
            }
        }
        return jugadores2Metros;
    }

    private Jugador buscarJugadorPorNombre(String nombre) {
        boolean encontrado = false;
        Jugador jugador = null;
        for (Jugador j : listaJugadores) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                jugador = j;
            }
        }
        return jugador;
    }

}
