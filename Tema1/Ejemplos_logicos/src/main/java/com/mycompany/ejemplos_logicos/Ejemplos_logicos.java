/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplos_logicos;

/**
 *
 * @author daw1
 */
public class Ejemplos_logicos {

    public static void main(String[] args) {
        //explicación operadores lógicos
        // and
        int numero1,numero2;
        numero1=22;
        numero2=8;
        
        boolean f= (numero1>6 && numero2>6);
        System.out.println("Los dos números mayores de 6 es: "+f);
        
        //or
        int numero3=2;
        int numero4=1;
        
        boolean g=(numero3>6 || numero4>6);
        System.out.println("Al menos uno de los dos números es mayor que 6: "+g);
        
        //not
        int numero5=8;
        boolean j=(numero5)!=2;
        System.out.println("El número 5 es 2: "+j);
        
    }
}
