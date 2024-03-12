/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Agenda {

    private ArrayList<Persona> agenda;

    public Agenda(){
        this.agenda=new ArrayList<>();
    }
    
    public void insertarPersona(){
        String opc="";
        boolean valido=false;
        Persona p=null;
        while(!valido){
              try {
                System.out.println("¿Quieres introducir una persona?");
                opc = new Scanner(System.in).nextLine();
                if (opc.equalsIgnoreCase("Si")) {
                    p=new Persona();
                    if(agenda.add(p)){
                        System.out.println(p.getNombre()+" añadida correctamente");
                    }
                } else if (opc.equalsIgnoreCase("No")) {
                    System.out.println("Finalizando insercción!!!!");
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, opción incorrecta");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        
        
    }
}
