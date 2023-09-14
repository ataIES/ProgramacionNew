/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.volumencilindro;

/**
 *
 * @author daw1
 */
public class VolumenCilindro {

    public static void main(String[] args) {
        //Una Manera de hacerla
        float altura=10.5f;
        float radio=50.5f;
        final float PI=3.14f;
        
        System.out.println("El volumen de un cilindro es: "+(altura*Math.pow(radio, 2)*PI));
        //Otra forma hacer el cálculo en una variable aparte
        double volumen=altura*Math.pow(radio, 2)*PI;
        
        System.out.println("El volumen de un cilindro es: "+volumen);
        
        //Utilizando la clase Math
        System.out.println("El volumen de un cilindro es: "+(altura*Math.pow(radio, 2)*Math.PI));
    }
}
