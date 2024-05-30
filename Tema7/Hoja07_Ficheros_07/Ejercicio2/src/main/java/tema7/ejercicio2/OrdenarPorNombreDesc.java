/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.util.Comparator;

/**
 *
 * @author atres
 */
public class OrdenarPorNombreDesc implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getNombreAlumno().compareToIgnoreCase(o2.getNombreAlumno());
    }
    
}
