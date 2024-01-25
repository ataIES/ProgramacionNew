/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Array {
    private int[]vector;

    public Array() {
        this.vector=new int[10];
    }
    public void mostrar(){
        for(int i=0;i<vector.length;i++){
            if(i==vector.length-1){
                System.out.print(vector[i]);
            }else{
                System.out.print(vector[i]+", ");
            }
        }
    }
    public void introducir(){
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.println("Introduce el "+(i+1)+" número: ");
            vector[i]=teclado.nextInt();
        }
    }
    public int media(){
        int suma=0;
        for(int i=0;i<vector.length;i++){
            suma+=vector[i];
        }
        return suma/vector.length;
    }
    public void modificar(int num,int pos){
        vector[pos-1]=num;
    }
  public void rotarIzquierda(){
        int pos=vector[0];
        for(int i=1; i<vector.length;i++){
            vector[i-1]=vector[i];
        }
        vector[vector.length-1]=pos;
    }
    
    public void rotarDerecha(){
        int pos=vector[vector.length-1];
        for(int i=vector.length-1;i>0;i--){
            vector[i]=vector[i-1];
        }
        vector[0]=pos;
    }
    public void comparar(Array a){
        int valor=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==a.vector[i]){
                if(i==vector.length-1){
                    valor=vector[i];
                    System.out.print(valor);
                }else{
                    valor=vector[i];
                    System.out.print(valor+", ");
                }
            }
        }
    }
    
}
