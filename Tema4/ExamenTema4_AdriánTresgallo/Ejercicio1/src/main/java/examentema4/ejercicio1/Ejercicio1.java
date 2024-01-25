/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema4.ejercicio1;

import java.util.Scanner;

/**
 * Adrian Tresgallo Arozamena
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int longitud = args.length;
        int vector[] = null;
        if (longitud > 0) {
            vector = new int[longitud];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = Integer.parseInt(args[i]);
            }
        } else {
            System.out.println("Error, no hay ningun argumento");
        }
        OperadoresVector ope = new OperadoresVector(vector);
       int opc=0;
       do{
           System.out.println("");
           System.out.println("---Menú de opciones---");
           System.out.println("1.Mostrar vector");
           System.out.println("2.Encontrar numero primo");
           System.out.println("3.Invertir vector");
           System.out.println("4.Divisores");
           System.out.println("5.Salir");
           System.out.println("Introduce una opción: ");
           opc=teclado.nextInt();
           switch(opc){
               case 1->ope.mostrar();
               
               case 2->ope.encontrarPrimo();
               
               case 3-> {
                   ope.invertirVector();
                   ope.mostrar();
               }
               
               case 4-> {
                   ope.divisores(opc);
                   ope.mostrar();}
               
               case 5-> System.out.println("Saliendoo");
               
               default-> System.out.println("Error, opción incorrecta");
           }
       }while(opc!=5);

    }

}
