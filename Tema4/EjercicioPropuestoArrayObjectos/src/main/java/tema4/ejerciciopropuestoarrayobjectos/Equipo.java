/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejerciciopropuestoarrayobjectos;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Equipo {

    private String nombre_equipo;
    private String ciudad;
    private int plantilla;
    private String categoria;
    private Jugador[] jugadores;

    public Equipo(String nombre_equipo, String ciudad, int plantilla, String categoria) {
        this.nombre_equipo = nombre_equipo;
        this.ciudad = ciudad;
        this.plantilla = plantilla;
        this.categoria = categoria;

    }
    
//Metodo para crear jugadores
    public Jugador crearJugador() {
        Scanner teclado = new Scanner(System.in);
        Jugador jugador;
        //Pedir por teclado los datos de los jugadores
        System.out.println("Introduce el nombre del jugador: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce su dorsal: ");
        int dorsal = teclado.nextInt();
        System.out.println("Introduce su posición: ");
        String posicion = new Scanner(System.in).nextLine();

        jugador = new Jugador(nombre, dorsal, posicion);
        return jugador;
    }
    
//Metodo para insertar jugadores
    public void insertarJugadores() {
        Scanner teclado = new Scanner(System.in);
        jugadores = new Jugador[plantilla];
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = crearJugador();
        }
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPlantilla() {
        return plantilla;
    }

    public String getCategoria() {
        return categoria;
    }
    
//Metodo para mostrar equipo
    public void imprime() {
        System.out.println("Nombre del Equipo: " + getNombre_equipo());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("Plantilla: " + getPlantilla());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("");
        System.out.println("---Jugadores---");
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].imprime();
        }

    }

}
