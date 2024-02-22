/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Trabajos {
    
    private static Servicio[]trabajos;
    private static int contTrabajos;
    
    public Trabajos(int nTrabajos){
        trabajos=new Servicio[nTrabajos];
        contTrabajos=0;  
    }
    
    public static boolean insertarTrabajos(Servicio s){
       boolean insertado=false;
       if(contTrabajos<trabajos.length){
           trabajos[contTrabajos]=s;
           contTrabajos++;
           insertado=true;
       }
       return insertado;
    }
    public static void mostrarTrabajos(){
        for(int i=0;i<contTrabajos;i++){
            System.out.print(trabajos[i].detalleServicio()+"\n");
        }
    }
}
