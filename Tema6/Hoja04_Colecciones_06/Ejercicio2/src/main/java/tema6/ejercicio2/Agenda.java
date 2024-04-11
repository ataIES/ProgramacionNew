/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW125
 */
public class Agenda {

    private SortedSet<Persona> agenda;

    public Agenda() {
        this.agenda = new TreeSet<>();
    }

    public void aniadirPersona() {
        try {
            Persona p = new Persona();
            if (agenda.add(p)) {
                System.out.println("Persona " + p.getNombre() + " " + p.getApellidos() + " añadido correctamente");
            } else {
                throw new Exception("Error, no se pudo añadir a la persona " + p.getNombre() + " " + p.getApellidos());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void borrarPersona(String dni) {
        try {
            Persona personaBorrada = buscarPersona(dni);
            if (personaBorrada != null) {
                if (agenda.remove(personaBorrada)) {
                    System.out.println("Persona " + dni + " borrada correctamente");
                } else {
                    throw new Exception("Error, no se pudo borrar a la persona " + dni);
                }
            } else {
                throw new NullPointerException("Error, no existe la persona con dni " + dni);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String mostrarAgenda() {
        String cadena = "\n\t---Agenda---";
        for (Persona p : agenda) {
            cadena += p.mostrarPersona();
        }

        return cadena;
    }

    public Persona buscarPersona(String dni) {
        Persona personaEncontrada = null;
        Iterator<Persona> it = agenda.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getDni().equalsIgnoreCase(dni)) {
                personaEncontrada = p;
            }
        }
        return personaEncontrada;
    }

    public void modificarDni(String dni) {
        try {
            Persona personaEncontrada = buscarPersona(dni);
            String dniNuevo = "";

            if (personaEncontrada != null) {
                dniNuevo = Teclado.introDni("Introduce el nuevo dni: ");
                personaEncontrada.setDni(dniNuevo);
                if (personaEncontrada.getDni().equalsIgnoreCase(dniNuevo)) {
                    System.out.println("Dni modificado correctamente");
                } else {
                    throw new Exception("Error, no se pudo modificar su dni");
                }
            } else {
                throw new NullPointerException("Error, la persona con dni " + dni + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
