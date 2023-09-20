/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo_ternarios;

/**
 *
 * @author daw1
 */
public class Ejemplo_Ternarios {

    public static void main(String[] args) {
        int a,b;
        a=3<5 ? 1:-1;
        
        System.out.println("a vale "+a);
        
        b= a==7?10:20;
        
        System.out.println("b vale "+b);
        
        int num=-2;
        int valor=num>0?num:-num;
        
        System.out.println("El valor absoluto de "+num+" es: "+valor);
       
    }
}
