/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo_joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Ejemplo_JOptionPane {

    public static void main(String[] args) {
        String texto;
        int num;
        texto = JOptionPane.showInputDialog("Escribe un número");
        num = Integer.parseInt(texto);
        System.out.println("Has introducido el número "+num);
        //Mostrando el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null,"Has introducido el número "+num);
        
        //Mensaje de error
        JOptionPane.showMessageDialog(null, "Advertencia", "Peligro",JOptionPane.WARNING_MESSAGE);
    }
}
