/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       double distancia1,distancia2,distancia3,distanciaTotal;
       String texto;
       
       //Introduccion de datos
       texto=JOptionPane.showInputDialog("Introduce el valor de la distancia 1 en milimetros");
       distancia1=Double.parseDouble(texto);
       
       texto=JOptionPane.showInputDialog("Introduce el valor de la distancia 2 en centímetros");
       distancia2=Double.parseDouble(texto);
       
       texto=JOptionPane.showInputDialog("Introduce la distancia 3 en metros");
       distancia3=Double.parseDouble(texto);
       
       //Convierto las distancias a centimetros y sumarlas
       distanciaTotal=(distancia1/10)+distancia2+(distancia3*100);
       
       //Muestro el resultado
       
       JOptionPane.showMessageDialog(null, "Distancia 1: "+String.format("%.2f", (distancia1/10))+" centímetros "
               + "\nDistancia 2: "+String.format("%.2f", distancia2)+" centímetros"
                       + "\nDistancia 3: "+String.format("%.2f", (distancia3*100))+" centímetros \nDistancia Total: "+String.format("%.2f", distanciaTotal));
       
    }
}
