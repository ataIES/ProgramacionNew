/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_propuesto_circuito_electrico;

/**
 *
 * @author daw1
 */
public class Ejercicio_Propuesto_Circuito_Electrico {

    public static void main(String[] args) {
        boolean funciona,cableA,cableB,cableC,cableD;
        //TRUEel cable está en alta y false el cable está en baja
        cableA=false;
        cableB=false;
        cableC=false;
        cableD=false;
        
        funciona=((cableA && !cableB) || (!cableA && cableB)||(!cableA && !cableB))&&((cableC && cableD)||(!cableC && !cableD));
        System.out.println("¿Funciona?: "+funciona);
    }
}
