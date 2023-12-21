/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Operaciones {

    private int numeros[];

    public Operaciones() {
        Scanner teclado=new Scanner(System.in);
        numeros=new int[5];
        int numero=0;
        for(int i=0;i<numeros.length;i++){
            System.out.println("Introduce numero "+(i+1)+": ");
            numero=teclado.nextInt();
            numeros[i]=numero;
        }
        
    }
    public void multiplicar(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]*=2;
        }
    }
    public String mostrarArray(){
        String cadena="";
        for(int i=0;i<numeros.length;i++){
            cadena+= numeros[i]+" ";
        }
        return cadena;
    }
    public int sumaPares(){
        int suma=0;
        for(int i=0; i<numeros.length;i++){
            if(i%2==0){
                suma+=numeros[i];
            }
        }
        return suma;
    }
    
    
}
