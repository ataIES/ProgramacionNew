/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio8_asignacion;

/**
 *
 * @author daw1
 */
public class Ejercicio8_Asignacion {

    public static void main(String[] args) {
        float kManzanas,kPeras;
        final float precioManzanas=2.35f;
        final float precioPeras=1.95f;
        float beneficios;
        
        kManzanas=10f;
        kPeras=15f;
        beneficios=(kManzanas*=precioManzanas)+((kPeras*=precioPeras));
        System.out.println("El beneficio es: "+String.format("%,.2f", beneficios));
        
      
        
    }
}
