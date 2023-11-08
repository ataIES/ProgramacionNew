/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author paguirrei
 */
public class finanzas {
    
    private double cambio;
    
    
    public finanzas(){
        cambio=1.06;
        //es el cambio de dólares a euros
    }
    
    public finanzas(double cambio){
        
        this.cambio = cambio;
    }
    
    public double dolaresToEuros(double cantidad){
        double equivalente;
        
        equivalente=cantidad* cambio;
        
        return equivalente;
    }
    
     public double eurostoDolares(double cantidad){
        double equivalente;
        
        equivalente=cantidad/ cambio;
        
        return equivalente;
    
     }
    
    
    
    
    
    
    
    
    
    
    
}
