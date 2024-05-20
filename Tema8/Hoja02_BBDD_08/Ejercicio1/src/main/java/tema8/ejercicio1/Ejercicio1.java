/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      int opc=0;
      do{
         menu();
         opc=teclado.nextInt();
         switch(opc){
             case 1->{
                 try{
                 String dni=Teclado.introDNI("Introduce el dni: ");
                 Paciente nuevo=MetodosDB.buscarPorDNI(dni);
                 if(nuevo!=null){
                     throw new Exception("Error, ya existe un paciente con dni: "+dni);
                 }else{
                     MetodosDB.insertarPaciente(dni);
                 }
                 }catch(Exception e){
                     System.out.println(e.getMessage());
                 }
             }
         }
      }while(opc!=5);
    }
    public static void menu(){
        System.out.printf("\n\t---MENU DENTISTA---"
                + "\n\t1.Insertar Paciente"
                + "\n\t2.Crear Visita"
                + "\n\t3.Mostrar agenda de un dia específico"
                + "\n\t4.Visitas de un cliente"
                + "\n\t5.Salir"
                + "\n\tIntroduce una opcion: ");
    }
}
