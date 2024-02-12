/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

import java.util.Arrays;


/**
 *
 * @author atres
 */
public class Agenda  {
    private Contacto[]agenda;
    private int contContacto;

    public Agenda(int nContacto) {
        this.agenda=new Contacto[nContacto];
        this.contContacto=0;
    }
    public void insertar(Contacto contacto){
        if(contContacto<agenda.length){
            contacto.setId(contContacto);
           agenda[contContacto]=contacto;
            System.out.println("Contacto "+contacto.getNombre()+" correctamente");
           contContacto++;
        }else{
            System.out.println("Error, no se puede agregar a "+contacto.getNombre()+" agenda llena");
        }
    }
    public void buscar(String nombreContacto){
        boolean encontrado=false;
        String cadena="";
        for(int i=0;i<contContacto;i++){
            if(agenda[i].getNombre().equalsIgnoreCase(nombreContacto)){
                cadena+=agenda[i].toString()+"\n";
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("Error, no existe el contacto con el nombre "+nombreContacto);
        }else{
            System.out.println(cadena);
        }
    }
    public void eliminar(String nombreContacto){
        int encontrados=0;
        boolean encontrado=false;
        int posInicial=0;
        for(int i=0;i<contContacto;i++){
            if(agenda[i].getNombre().equalsIgnoreCase(nombreContacto)){
                posInicial=i; 
            }
        }
        for(int i=posInicial;i<contContacto-1;i++){
            agenda[i]=agenda[i+1];
            
        }
        contContacto--;
        if(encontrado){
            System.out.println("Error, no existe ningún contacto con el nombre "+nombreContacto);
        }
    }
    public void ordenar(){
        Arrays.sort(agenda,0,contContacto);
    }

    @Override
    public String toString() {
        String cadena="";
        for(int i=0;i<contContacto;i++){
            cadena+=agenda[i].toString()+"\n";
        }
        return cadena;
    }
    
    
}
