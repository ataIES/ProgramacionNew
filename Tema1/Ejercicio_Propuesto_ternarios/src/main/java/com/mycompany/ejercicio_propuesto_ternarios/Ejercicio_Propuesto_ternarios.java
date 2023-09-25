/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_propuesto_ternarios;

/**
 *
 * @author daw1
 */
public class Ejercicio_Propuesto_ternarios {

    public static void main(String[] args) {
        boolean conocimientosInfo, cursoInfo, experencia;
        String result;
        conocimientosInfo = false;
        cursoInfo = false;
        experencia = false;

        result = (conocimientosInfo && experencia && !cursoInfo)|| cursoInfo  ? "SÍ" : "NO";
        System.out.println("¿Contratado?: " + result);
    }
}
