/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio7_ternario;

/**
 *
 * @author daw1
 */
public class Ejercicio7_Ternario {

    public static void main(String[] args) {
        boolean llueve,tareas,biblioteca,salir;
        llueve=false;
        tareas=true;
        biblioteca=false;
        
        salir=(llueve==false && tareas==true)||(biblioteca ==true);
        System.out.println("¿Puedes salir? "+salir);
        
        
        
        
    }
}
