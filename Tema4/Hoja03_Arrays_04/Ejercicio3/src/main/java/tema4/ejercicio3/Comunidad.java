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
public class Comunidad {
    private String nombreComunidad;
    private String[] comunidades;

    public Comunidad(String nombreComunidad, int nComunidades) {
        this.nombreComunidad = nombreComunidad;
        this.comunidades=new String[nComunidades];
        insertarComunidades();
    }
    public void insertarComunidades(){
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<comunidades.length;i++){
            System.out.println("Introduce la "+(i+1)+"º comunidad: ");
            comunidades[i]=teclado.nextLine();
        }
    }
    public String mostrar(){
        
    }
    
}
