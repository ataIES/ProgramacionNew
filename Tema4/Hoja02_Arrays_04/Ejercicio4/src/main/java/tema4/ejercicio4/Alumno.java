/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Alumno {

    private String nombreAlumno;
    private int[] notas;

    public Alumno(String nombreAlumno) {
        Scanner teclado = new Scanner(System.in);
        this.nombreAlumno = nombreAlumno;
        notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + " nota: ");
            int nota = teclado.nextInt();
            notas[i] = nota;
        }
    }
    public int mayor(){
        int mayor=notas[0];
        for(int i=0;i<notas.length;i++){
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        return mayor;
    }
    public int menor(){
        
    }

}
