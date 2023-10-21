/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        do{
            System.out.println(" ");
            System.out.println("----MENÚ CÁLCULO----");
            System.out.println("\t1.Método1");
            System.out.println("\t2.Método2");
            System.out.println("\t3.Método3");
            System.out.println("\t4.Método4");
            System.out.println("\t5.Método5");
            System.out.println("Introduce una opción: -1 para salir");
            opc=teclado.nextInt();
            Calculo c1=new Calculo();
            
            switch(opc){
                case 1->c1.metodo1();
                case 2->c1.metodo2();
                case 3->c1.metodo3();
            }
        }while(opc!=-1);
    }
}
