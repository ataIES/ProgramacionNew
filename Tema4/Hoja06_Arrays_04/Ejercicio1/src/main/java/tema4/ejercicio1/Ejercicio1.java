/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio1;

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
           System.out.println("Introduce una opción: ");
           opc=teclado.nextInt();
           Almacen almacen=new Almacen(3);
           switch(opc){
               case 1->{
                   Articulo a=new Articulo();
                   almacen.llenar(a);
               }
               case 2->System.out.println(almacen.mostrar());
               
               case 3->System.out.println(almacen.mostrarMenos10());
               
               case 4->System.out.println("Saliendoo");
               
               default->System.out.println("Error, opción incorrecta");
           }
       }while(opc!=4);
    }
    public static void menu(){
        System.out.println("---MENÚ DE OPCIONES DEL ALMACÉN---");
        System.out.println("\t1.Añadir artículos");
        System.out.println("\t2.Mostrar todos los artículos");
        System.out.println("\t3.Mostrar artículos por debajo de 10 existencias");
        System.out.println("\t4.Salir");
    }
}
