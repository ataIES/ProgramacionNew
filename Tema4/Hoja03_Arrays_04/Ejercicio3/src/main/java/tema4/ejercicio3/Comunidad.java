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
            comunidades[i]=new Scanner(System.in).nextLine();
        }
    }
    public String mostrar(){
        String cadena="";
        cadena+="---"+nombreComunidad.toUpperCase()+"---\n";
        for(int i=0;i<comunidades.length;i++){
            if(comunidades[i].length()<4){
                cadena+=comunidades.length+" ";
            }else{
                if(i==comunidades.length-1){
                    cadena+=comunidades[i].substring(0, 3)+" ";
                }else{
                    cadena+=comunidades[i].substring(0, 4)+", ";
                }
                
            }
        }
        return cadena;
    }
    
}
