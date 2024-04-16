/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Equipo e = new Equipo();
        Set<Persona> listaEntrenadores = new TreeSet<>();
        Set<Persona> listaJugadores = new TreeSet<>();
        Entrenador entrenador = e.crearEntrenador();
        System.out.println("---Insertar entrenador---");
        e.insertar(entrenador, listaEntrenadores);
        System.out.println("");
         System.out.println(e.listar(listaEntrenadores));

        Jugador jugador = e.crearJugador();
        Jugador jugador1 = e.crearJugador();
        System.out.println("");
        System.out.println("---Insertar jugadores---");
        e.insertar(jugador, listaJugadores);
        e.insertar(jugador1, listaJugadores);
        System.out.println("");
        System.out.println(e.listar(listaJugadores));

    }
}
