/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author paguirrei
 */
public class Monedero {
    
    private double dinero;
    
    public Monedero(double dinero){
        this.dinero = dinero;
        
    }
    
    
    public void ahorrar(double dinero){
        this.dinero+=dinero;
    }
    
    
    
    public String gastar(double gasto){
        
      boolean haySaldo =(this.dinero>=gasto) ? true : false;
      this.dinero = haySaldo ? this.dinero-gasto : this.dinero;
       String texto= haySaldo ==false ? "No hay fondos" : "";
        return texto;
       
        
        
    }
    
    public double getSaldo(){
        return dinero;
    }
    
    
    
}
