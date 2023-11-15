/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---MENÚ DE OPERACIONES---");
            System.out.println("\t1.Mostrar divisores");
            System.out.println("\t2.Mostrar los números impares entre dos números");
            System.out.println("\t3.Tabla de multiplicar");
            System.out.println("\t4.División mediante restas sucesivas");
            System.out.println("Introduce una opción (-1 para salir): ");
            
            opc=teclado.nextInt();
            Operaciones operaciones=new Operaciones();
            switch(opc){
                case 1->{
                    operaciones.metodo1();
                    System.out.println("\n");
                }
                case 2->{
                    operaciones.metodo2();
                    System.out.println("\n");
                }
                case 3->{
                    operaciones.metodo3();
                    System.out.println("\n");
                }                
                case 4->{
                    operaciones.metodo4();
                    System.out.println("\n");
                }
                case -1->System.out.println("Saliendoo");
                
                default->System.out.println("Error, has introducido una opción errónea");
                
            }
        }while(opc!=-1);
        
    }
}
