/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        float a, b;
        String texto;
        boolean iguales;
        
        //Introduzco datos mediante JOptionPane
        texto=JOptionPane.showInputDialog("Introduce el valor de a");
        a=Float.parseFloat(texto);
        texto=JOptionPane.showInputDialog("Introduce el valor de b");
        b=Float.parseFloat(texto);
        
        //Creo la condición para saber si los dos números son iguales
        iguales=a==b;
        
        //Muestro el resultado
        JOptionPane.showMessageDialog(null, "¿a y b son iguales? "+iguales);
        
    }
}
