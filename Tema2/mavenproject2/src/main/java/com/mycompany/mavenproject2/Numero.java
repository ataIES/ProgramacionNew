/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author paguirrei
 */
public class Numero {
    
    private int numero;
    
    public Numero(){
        this.numero=0;
    }
    
    public Numero (int numero){
        this.numero= numero;
    }
    
    public int Suma(int valor){
        
        return numero+=valor;
    }
    
    public int Resta (int valor){
        return numero-=valor;
    }

    public int getNumero() {
        return numero;
    }
    
    public int Doble(){
        return numero*2;
    }
    
    public int Triple(){
        return numero*3;
    }
    
    
}
