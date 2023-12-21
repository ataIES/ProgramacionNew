/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Vectores {

    private int vector[];

    public Vectores() {
        Scanner teclado = new Scanner(System.in);
        vector = new int[5];
        int numero = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce numero " + (i + 1) + ": ");
            numero = teclado.nextInt();
            vector[i] = numero;
        }
    }
//Calcular el menor

    public int valorMenor() {
        int menor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (menor > vector[i]) {
                menor = vector[i];
            }
        }
        return menor;
    }

    //Calcular el mayor
    public int valorMayor() {
        int mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (mayor < vector[i]) {
                mayor = vector[i];
            }
        }
        return mayor;
    }
    //Calcular la media de todos los números
    public int media(){
        int suma=0;
        for(int i=0; i<vector.length;i++){
            suma+=vector[i];
        }
        return suma/vector.length;
    }
    public String mostrarVector(){
        String cadena="";
        for(int i=0;i<vector.length;i++){
            cadena+=vector[i]+" ";
        }
        return cadena;
    }

}
