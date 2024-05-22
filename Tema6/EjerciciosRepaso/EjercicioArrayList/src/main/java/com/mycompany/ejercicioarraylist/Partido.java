/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarraylist;

/**
 *
 * @author atres
 */
public class Partido implements Comparable<Partido> {

    private int id;
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(int id, String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Partido() {
        this.equipoLocal = Teclado.introEquipo("Introduce el equipo local: ");
        this.equipoVisitante = Teclado.introEquipo("Introduce el equipo visitante: ");
        this.golesLocal = Teclado.introGoles("Introduce los goles del equipo local: ");
        this.golesVisitante = Teclado.introGoles("Introduce los goles del equipo visitante: ");
        this.id++;
    }

    public int getId() {
        return id;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + '}';
    }

   

    @Override
    public int compareTo(Partido o) {
        return this.equipoLocal.compareTo(o.equipoLocal);
    }

}
