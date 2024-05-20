/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarraylist;

import java.util.Comparator;

/**
 *
 * @author atres
 */
public class PartidoPorId implements Comparator<Partido> {

    @Override
    public int compare(Partido o1, Partido o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }

}
