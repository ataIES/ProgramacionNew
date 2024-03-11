/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author atres
 */
public class Asociacion {

    private ArrayList<Persona> listaPersona;

    public Asociacion(int nPersona) {
        this.listaPersona = new ArrayList<>(nPersona);
    }

    public void insertarPersona() {
        Persona persona = new Persona();
        if (listaPersona.add(persona)) {
            System.out.println(persona.getNombre() + " añadida correctamente");
        } else {
            System.out.println("Error, no se pudo añadir a " + persona.getNombre() + " a la lista");
        }
    }

    public void buscarPorDNI(String dni) {
        boolean encontrado = false;
        Iterator<Persona> it = listaPersona.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getDni().equals(dni)) {
                System.out.println(p.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Error, no existe la persona con dni " + dni);
        }
    }

    public double cuotaAPagar(Persona persona) {
        final double CUOTA;
        int edad = persona.edad();
        if (edad >= 5 && edad <= 10) {
            CUOTA = 1;
        } else if (edad >= 11 && edad <= 17) {
            CUOTA = 2.5;
        } else if (edad >= 18) {
            CUOTA = 3.5;
        } else {
            CUOTA = 0;
        }
        return CUOTA;
    }

    public void ordenarPorDNI() {
        Collections.sort(listaPersona);
        System.out.println("Array ordenado por DNI");
    }

    public void ordenarPorNombre() {
        OrdenarPorNombre compPersona=new OrdenarPorNombre();
       /* Comparator<Persona> compPersona = new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        };*/
        Collections.sort(listaPersona, compPersona);
    }

    public String mostrarLista() {
        String cadena = "";
        for (Persona persona : listaPersona) {
            cadena += persona.toString() + "\nCuota: " + cuotaAPagar(persona) + "€\n";
        }
        return cadena;
    }
}
