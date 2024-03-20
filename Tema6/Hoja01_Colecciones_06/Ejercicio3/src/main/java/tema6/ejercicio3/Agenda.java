/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author atres
 */
public class Agenda {

    private ArrayList<Persona> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    //Metodo que inserta una persona
    public void insertarPersona(Persona p) {
        if (agenda.add(p)) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " añadido correctamente");
        } else {
            System.out.println("Error, no se pudo añadir a la agenda");
        }

    }

    //Metodo que buscará por dni
    public Persona buscarPorDni(String dni) {
        Persona result = null;
        boolean encontrado = false;

        for (Persona p : agenda) {
            if (p.getDni().equalsIgnoreCase(dni) && !encontrado) {
                encontrado = true;
                result = p;
            }
        }
        return result;
    }

    //Metodo que eliminará una persona por dni
    public void eliminarPersona(String dni) {
        Persona personaux = buscarPorDni(dni);
        boolean borrado = false;
        try {
            if (personaux != null) {
                if (agenda.remove(personaux)) {
                    borrado = true;
                }
            } else {
                throw new NullPointerException("Error, la persona con dni " + dni + " no existe");
            }

            if (borrado) {
                System.out.println("Persona con dni " + dni + " borrada correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo borrar a la persona con dni " + dni);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo que muestra los datos de la agenda ordenada por nombre y apellidos
    public String mostrarAgenda() {
        String cadena = "";
        Collections.sort(agenda);
        System.out.println("---Agenda---");
        for (Persona persona : agenda) {
            cadena += persona.toString() + "\n";
        }
        return cadena;
    }

    //Metodo que mostrará los datos de una persona por dni
    public void mostrarPersonaPorDni(String dni) {
        Persona personaux = buscarPorDni(dni);
        try {
            if (personaux != null) {
                System.out.println(personaux.toString());
            } else {
                throw new NullPointerException("Error, la persona con dni " + dni + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }

    }

    //Metodo que modificará los datos de una persona por dni
    public void modificarPersona(String dni) {
        Persona personaux = buscarPorDni(dni);
        try {
            if (personaux != null) {
                personaux.setNombre(ValidaDatos.validaNombre("Introduce el nuevo nombre: "));
                personaux.setApellido(ValidaDatos.validaNombre("Introduce los nuevos apellidos: "));
                personaux.setDni(ValidaDatos.validarDni("Introduce el nuevo dni: "));
            } else {
                throw new NullPointerException("Error, la persona con dni " + dni + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }
}
