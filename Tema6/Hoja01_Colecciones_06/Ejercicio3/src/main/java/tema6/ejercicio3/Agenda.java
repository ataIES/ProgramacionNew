/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Agenda {

    private ArrayList<Persona> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void insertarPersona(Persona p) {
        if (agenda.add(p)) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " añadido correctamente");
        } else {
            System.out.println("Error, no se pudo añadir a la agenda");
        }

    }

    public void eliminarPersona(String dni) {
        boolean borrado = false;
        for (Persona persona : agenda) {
            if (persona.getDni().equals(dni) && !borrado) {
                if (agenda.remove(persona)) {
                    borrado = true;
                }
            }
        }
        if (!borrado) {
            System.out.println("Persona con dni " + dni + " borrado correctamente");
        } else {
            System.out.println("No se pudo borrar a la persona con dni " + dni);
        }
    }

    public String mostrarAgenda() {
        String cadena = "";
        Collections.sort(agenda);
        System.out.println("---Agenda---");
        for (Persona persona : agenda) {
            cadena += persona.toString() + "\n";
        }
        return cadena;
    }

    private Persona buscarPersona(String dni) {
        Persona personaux = null;
        boolean encontrado = false;
        Iterator<Persona> it = agenda.iterator();
        while (it.hasNext()) {
            personaux = it.next();
            if (personaux.getDni().equals(dni)) {
                encontrado = true;

            }
        }
        return personaux;
    }

    public void mostrarPersonaPorDni(String dni) {
        try {
            Persona p1 = buscarPersona(dni);
            if (p1 != null) {
                System.out.println(p1.toString());
            } else {
                throw new NullPointerException("No existe ninguna persona con el dni " + dni);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }

    public void modificarPersona(String dni) {
        Persona personaux = null;
        boolean encontrado = false;
        Iterator<Persona> it = agenda.iterator();
        while (it.hasNext()) {
            personaux = it.next();
            if (personaux.getDni().equals(dni) && !encontrado) {
                encontrado = true;
                personaux.setNombre(ValidaDatos.validaNombre("Introduce su nuevo nombre: "));
                personaux.setApellido(ValidaDatos.validaNombre("Introduce su nuevo apellido: "));
                personaux.setDni(ValidaDatos.validarDni("Introduce su nuevo dni: "));
            }
        }
        if (!encontrado) {
            System.out.println("Error, no existe la persona con dni " + dni + " en la agenda");
        }
    }
}
