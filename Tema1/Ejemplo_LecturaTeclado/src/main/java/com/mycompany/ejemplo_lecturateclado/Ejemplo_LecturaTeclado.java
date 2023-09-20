/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo_lecturateclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class Ejemplo_LecturaTeclado {

    public static void main(String[] args) throws IOException {
        //JOptionPane
        String texto;
        int num;
        texto=JOptionPane.showInputDialog("Escriba un número");
        num=Integer.parseInt(texto);
        
        System.out.println(num);
        //System
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Introduce un número: ");
        String cad= br.readLine();
        //Conversión de la variable cad a el tipo de dato que quiero
        int num1=Integer.parseInt(cad);
        System.out.println(num1);
        
        //Scanner
        int edad;
        String nombre,apellido;
        Scanner teclado=new Scanner(System.in);
       
        System.out.println("Introduce tu nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Introduce tus apellidos: ");
        apellido=teclado.nextLine();
        
        System.out.println("Introduce tu edad: ");
        edad=teclado.nextInt();
        System.out.println("Nombre: "+nombre+"\nApellidos: "+apellido+"\nEdad: "+edad);
        
    }
}
