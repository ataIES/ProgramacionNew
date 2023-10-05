/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Variable texto para la escritura de teclado medainte JOptionPane
        String texto;
        int anio;
        boolean bisiesto;
        //creo una variable llamada resultado para formatear para cuando me salga true o false, me salga un Si o no
        String result;

        //Introducción de datos
        texto = JOptionPane.showInputDialog("Introduce un año");
        anio = Integer.parseInt(texto);

        //Creo la condición para averiguar si un año es bisiesto
        bisiesto = ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));

        //Ahora formateo el booleano para que me aparezca un Si y No con un ternario
        result = bisiesto ? "S" : "N";
        //Muestro el resultado
        JOptionPane.showMessageDialog(null, "El año introducido " + anio + " es bisiesto (S=Sí N=No) es igual a: " + result);
    }
}
