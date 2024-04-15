/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.Map;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Persona p = new Persona();
        for (Map.Entry<String, String> listar : p.listaObjeto().entrySet()) {
            System.out.println(listar.getKey() + listar.getValue());
        }
    }
}
