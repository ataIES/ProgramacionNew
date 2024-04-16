/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Collection;
import java.util.Set;

/**
 *
 * @author atres
 * @param <T>
 */
public interface Metodos<T> {

    public String listar(Set<T>lista);
    
    public void insertar(T t, Set<T> lista);

    public void borrar(String dni, Set<T> lista);

    public T buscarPorDni(String dni, Set<T> lista);

}
