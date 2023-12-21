/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Invierno {

    private int temperaturas[];

    public Invierno(int n) {
        Scanner teclado = new Scanner(System.in);
        temperaturas = new int[n];
        int temperatura = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce numero " + (i + 1) + ": ");
            temperatura = teclado.nextInt();
            temperaturas[i] = temperatura;
        }
    }

    public int tempMedia() {
        int suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }
        return suma / temperaturas.length;

    }

    public int[] fahrenheit() {
        int fahrenheit[]=new int[temperaturas.length];
        for(int i=0;i<fahrenheit.length;i++){
            fahrenheit[i]=(int) ((temperaturas[i]*1.8)+32);
        }
        return fahrenheit;
    }
     public String mostrarTemperatura(){
        String cadena="";
        for(int i=0;i<temperaturas.length;i++){
            cadena+=temperaturas[i]+" ";
        }
        return cadena;
    }

}
