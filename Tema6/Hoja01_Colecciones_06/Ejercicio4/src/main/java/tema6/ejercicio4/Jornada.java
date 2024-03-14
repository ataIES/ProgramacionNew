/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW125
 */
public class Jornada {

    private ArrayList<PartidoFutbol> listaJornada;
    private int idJornada;

    public Jornada() {
        this.listaJornada = new ArrayList<>();
        this.idJornada = 0;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    //Metodo que inserta partidos
    public void insertarPartidos() {
        PartidoFutbol p = new PartidoFutbol();
        if (listaJornada.add(p)) {
            System.out.println("Partido " + p.getEquipoLocal() + " vs " + p.getEquipoVisitante() + " añadido correctamente");
        } else {
            System.out.println("No se pudo añadir el partido");
        }
    }

    //Metodo que muestra el número de partidos
    public int numeroPartidos() {
        return listaJornada.size();
    }

    //Metodo que muestra la jornada
    public String mostrarJornada() {
        String cadena = "";
        System.out.print("---Jornada "+idJornada+" ---");
        for (PartidoFutbol p : listaJornada) {
            cadena += p.mostrarPartido();
        }
        return cadena;
    }

    //Metodo que elimina los partidos que no sean empate
    public void eliminarPartidoEmpate() {
        Iterator<PartidoFutbol> it = listaJornada.iterator();
        while (it.hasNext()) {
            PartidoFutbol partido = it.next();
            if (partido.getGolesLocal() != partido.getGolesVisitante()) {
                it.remove();
            }
        }
    }
}
