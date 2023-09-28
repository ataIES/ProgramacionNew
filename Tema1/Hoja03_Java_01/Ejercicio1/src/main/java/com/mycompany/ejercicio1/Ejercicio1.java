/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        final int IVA;
        double baseImponible,importeFinal;
        char letra='%', euros='€';
        
        //Pido la base imponible y el IVA por teclado
        System.out.println("Introduce la base Imponible: ");
        baseImponible=teclado.nextFloat();
        System.out.println("Introduce el IVA que se debe aplicar: ");
        IVA=teclado.nextInt();
        
        //Calculo el importe final con el IVA
        importeFinal=baseImponible+(baseImponible*(IVA/100));
        
        //Muestro por pantalla los datos y el resultado
        System.out.printf("---CÁLCULO IMPORTE TOTAL---\n\tBase Imponible: %.2f%c  \n\tIVA a aplicar: %d%c"
                + "\n\tImporte final: %.2f%c \n------------------",baseImponible,euros,IVA,letra,importeFinal,euros);
        
    }
}
