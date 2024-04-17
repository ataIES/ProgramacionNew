/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author atres
 */
public class Equipo {

    private Set<Persona> listaEntrenadores;
    private Set<Persona> listaJugadores;


    public Equipo() {
        this.listaEntrenadores = new TreeSet<>();
        this.listaJugadores = new TreeSet<>();
    }

    public Entrenador crearEntrenador() {
        String nombre = Teclado.introNombre("Introduce el nombre del entrenador: ");
        String apellido = Teclado.introApellido("Introduce sus apellidos: ");
        String dni = Teclado.introDni("Introduce su dni: ");
        int anio = Teclado.introAnio("Introduce el año de nacimiento: ");
        int mes = Teclado.introMes("Introduce el mes de nacimiento: ");
        int dia = Teclado.introDia(mes, anio);
        LocalDate fecha = Teclado.fecha(dia, mes, anio);
        String correo = Teclado.introCorreoElectronico("Introduce su correo de contacto: ");
        int experencia = Teclado.introEntero("Introduce años de experencia: ");
        double salario = Teclado.introDouble("Introduce su salario: ");

        Entrenador entreaux = new Entrenador(experencia, salario, nombre, apellido, dni, fecha, correo);

        return entreaux;
    }

    public Jugador crearJugador() {
        String nombre = Teclado.introNombre("Introduce el nombre del jugador: ");
        String apellido = Teclado.introApellido("Introduce sus apellidos: ");
        String dni = Teclado.introDni("Introduce su dni: ");
        int anio = Teclado.introAnio("Introduce el año de nacimiento: ");
        int mes = Teclado.introMes("Introduce el mes de nacimiento: ");
        int dia = Teclado.introDia(mes, anio);
        LocalDate fecha = Teclado.fecha(dia, mes, anio);
        String correo = Teclado.introCorreoElectronico("Introduce su correo de contacto: ");
        int dorsal = Teclado.introEntero("Introduce su dorsal: ");
        double estatura = Teclado.introDouble("Introduce su estatura: ");

        Jugador jugadoraux = new Jugador(dorsal, estatura, nombre, apellido, dni, fecha, correo);

        return jugadoraux;
    }


}
