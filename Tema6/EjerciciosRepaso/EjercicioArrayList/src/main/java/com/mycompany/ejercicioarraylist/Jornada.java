/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author atres
 */
public class Jornada {

    private ArrayList<Partido> listaJornada;
    
    public Jornada() {
        this.listaJornada = new ArrayList<>();
    }

    public void insertarPartido(Partido p) {
        try {
            if (!listaJornada.contains(p)) {
                if (listaJornada.add(p)) {
                    System.out.println("Partido " + p.getEquipoLocal() + " - " + p.getEquipoVisitante() + " añadido correctamente");
                } else {
                    throw new Exception("Error, no se pudo añadir el partido");
                }
            } else {
                throw new Exception("Error, ya existe ese partido en la jornada");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Partido buscarPartido(int id) {
        Partido partidoBuscar = null;
        Iterator<Partido> it = listaJornada.iterator();
        while (it.hasNext()) {
            Partido aux = it.next();
            if (aux.getId() == id) {
                partidoBuscar = aux;
                
            }
        }
        return partidoBuscar;
    }

    public void borrarPartido(int id) {
        Partido partidoBorrado = buscarPartido(id);
        try {
            if (partidoBorrado != null) {
                if (listaJornada.remove(partidoBorrado)) {
                    System.out.println("Partido " + id + " borrado correctamente");
                } else {
                    throw new Exception("Error, el partido no se pudo borrar");
                }
            } else {
                throw new NullPointerException("Error, no existe el partido " + id);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String listarJornada() {
        String cadena = "\n\t---Lista Jornada---\n";
        for (Partido p : listaJornada) {
            cadena += p.toString() + "\n";
        }
        return cadena;
    }

    public void ordenarPorEquipoLocal() {
        Collections.sort(listaJornada);
    }
    public void ordenarPorId(){
        Comparator<Partido>compId=new PartidoPorId();
        Collections.sort(listaJornada,compId);
    }
}
