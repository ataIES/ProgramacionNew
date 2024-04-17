/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Set;

/**
 *
 * @author atres
 */
public class Metodos<T extends Persona> {

    private final T tipo;

    public Metodos(T tipo) {
        this.tipo = tipo;
    }

    public static <T extends Persona> String listar(Set<T> lista) {
        String cadena = "";
        for (T tipo : lista) {
            cadena += tipo.toString();
        }
        return cadena;
    }

    public static <T extends Persona> void insertar(T tipo, Set<T> lista) {
        try {
            if (!lista.contains(tipo)) {
                if (lista.add( tipo)) {
                    System.out.println("Añadido correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo añadir");
                }
            } else {
                throw new ExcepcionPersonalizada("Error, ya existe en la lista");
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }
}
