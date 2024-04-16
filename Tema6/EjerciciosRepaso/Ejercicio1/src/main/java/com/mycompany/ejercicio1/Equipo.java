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
public class Equipo implements Metodos<Persona> {

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

    

    @Override
    public String listar(Set<Persona> lista) {
        String cadena="";
        if (!lista.isEmpty()) {
            for (Persona p : lista) {
                cadena += p.mostrarInformacion();
            }
        } else {
            cadena += "\nEstá vacio";
        }
        return cadena;
    }

    @Override
    public void insertar(Persona p, Set<Persona> lista) {
        try {
            if (lista.add(p)) {
                if (p instanceof Entrenador entreaux) {
                    System.out.println("Entrenador " + entreaux.nombre + " " + entreaux.apellidos + " añadido correctamente");
                } else {
                    System.out.println("Jugador " + p.nombre + " " + p.apellidos + " añadido correctamente");
                }
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo añadir al equipo " + p.nombre);
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void borrar(String dni, Set<Persona> lista) {
        try {
            Persona personaEncontrada = buscarPorDni(dni, lista);
            if (personaEncontrada != null) {
                if (lista.remove(personaEncontrada)) {
                    System.out.println("Entrenador" + dni + "borrado correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo borrar correctamente");
                }
            } else {
                throw new NullPointerException("Error, no existe la persona con dni "+dni);
            }
        }catch(NullPointerException n){
            System.out.println(n.getMessage());
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Persona buscarPorDni(String dni, Set<Persona> lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
