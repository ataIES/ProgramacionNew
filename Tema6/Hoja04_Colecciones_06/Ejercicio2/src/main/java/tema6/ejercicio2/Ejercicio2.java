/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int opc=0;
        Agenda agenda=new Agenda();
        do{
            menu();
            opc=new Scanner(System.in).nextInt();
            switch(opc){
                case 1->agenda.aniadirPersona();
                
                case 2->{
                    String dniABorrar=Teclado.introDni("Introduce el dni de la persona a borrar: ");
                    agenda.borrarPersona(dniABorrar);
                }
                case 3->System.out.println(agenda.mostrarAgenda());
                
                case 4->{
                    String dniABuscar=Teclado.introDni("Introduce el dni de la persona a buscar: ");
                    Persona personaEncontrada=agenda.buscarPersona(dniABuscar);
                    System.out.println(personaEncontrada.mostrarPersona());
                }
                case 5->{
                    String dniAModificar=Teclado.introDni("Introduce el dni de la persona a modificar: ");
                    agenda.modificarDni(dniAModificar);
                }
                case 6->System.out.println("Muchas Gracias!!");
                
                default->System.out.println("Error, opción incorrecta");
            }
        }while(opc!=6);
    }
    public static void menu(){
        System.out.printf("\n\t---Menú de Agenda---"
                + "\n1.Insertar persona a la agenda"
                + "\n2.Borrar una persona"
                + "\n3.Mostrar agenda"
                + "\n4.Buscar una persona por dni"
                + "\n5.Modificar dni"
                + "\n6.Salir"
                + "\nIntroduce una opción: ");
    }
}
