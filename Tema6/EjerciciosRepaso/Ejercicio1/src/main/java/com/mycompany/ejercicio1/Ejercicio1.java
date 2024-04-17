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
        Set<Entrenador> listaEntrenadores = new TreeSet<>();
        Set<Jugador> listaJugadores = new TreeSet<>();
        Entrenador entrenador = e.crearEntrenador();
        System.out.println("---Insertar entrenador---");
        Metodos.insertar(entrenador, listaEntrenadores);
        System.out.println("");
        System.out.println(Metodos.listar(listaEntrenadores));

        

    }
}
