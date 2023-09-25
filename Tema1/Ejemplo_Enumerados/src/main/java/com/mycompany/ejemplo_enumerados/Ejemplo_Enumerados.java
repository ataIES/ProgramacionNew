/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo_enumerados;

/**
 *
 * @author daw1
 */
public class Ejemplo_Enumerados {
    public enum nivel{
        BAJO,MEDIO,ALTO;
    }
    
    public static void main(String[] args) {
        nivel miNivel=nivel.MEDIO;
        System.out.println("Mi nivel es "+miNivel);
    }
}
