/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo_propuesto_hipotenusa;

/**
 *
 * @author daw1
 */
public class Ejemplo_Propuesto_Hipotenusa {

    public static void main(String[] args) {
        //Cálculo de la hipotenusa sabiendo los dos catetos
        double cateto1, cateto2, hipotenusa,hipotenusa2;
        cateto1 = 3;
        cateto2 = 4;

        //Realizo la fórmula
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        //Muestro por pantalla resultados
        System.out.printf("Los valores de los catetos son %.2f y %.2f \nEl valor de la hipotenusa es %.2f \n", cateto1, cateto2, hipotenusa);
        
        //Otra resolución
        hipotenusa2=Math.hypot(cateto1, cateto2);
        System.out.printf("Los valores de los catetos son %.2f y %.2f \nEl valor de la hipotenusa es %.2f \n", cateto1, cateto2, hipotenusa2);
    }
}
