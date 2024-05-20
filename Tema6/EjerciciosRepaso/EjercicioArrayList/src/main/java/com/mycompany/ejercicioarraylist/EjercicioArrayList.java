/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioarraylist;

/**
 *
 * @author atres
 */
public class EjercicioArrayList {

    public static void main(String[] args) {
        Jornada j=new Jornada();
        Partido p1=new Partido(10,"Madrid","Barcelona",1,0);
        Partido p2= new Partido(2,"Cadiz","Mallorca",2,2);
        Partido p3= new Partido(4,"Valladolid","Sevilla",3,0);
        
        System.out.println("----Inserccion---");
        j.insertarPartido(p1);
        j.insertarPartido(p2);
        j.insertarPartido(p3);
        System.out.println("");
        System.out.println("----Mostrar----");
        System.out.println(j.listarJornada());
        System.out.println("");
        System.out.println("----Ordenar por Equipo Local---");
        j.ordenarPorEquipoLocal();
        System.out.println(j.listarJornada());
        System.out.println("");
        System.out.println("---Ordenar por id---");
        j.ordenarPorId();
        System.out.println(j.listarJornada());
    }
}
