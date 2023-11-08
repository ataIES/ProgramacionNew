/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author paguirrei
 */
public class Coche {
    
   private String matricula;
   private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad=0;
    }
   public int getVelocidad(){
       
       return velocidad;
   }
   public int acelera(int aceleron){
       
       velocidad+=aceleron;
       
       velocidad = (velocidad>120)? 120:velocidad;
       
       return velocidad;
       
   }
   
    public String letrasMatricula(){
        
        return matricula.substring(4,matricula.length());
    }
    
    
    
}
