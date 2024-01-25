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
        Alumno a=new Alumno("Adrian");
        System.out.println(a.mostrar());
        System.out.println("La nota mayor es: "+a.mayor());
        System.out.println("La nota menor es: "+a.menor());
        System.out.println("Introduce la nota a buscar: ");
        int nota=teclado.nextInt();
        System.out.println("La nota está el la posición: "+a.buscar(nota));
        int[]tresMejores=a.tresMejores();
        System.out.println("Las tres mejores notas son: ");
        for(int i=0;i<tresMejores.length;i++){
            if(i==tresMejores.length-1){
                System.out.print(tresMejores[i]+"\n");
            }else{
                System.out.print(tresMejores[i]+", ");
            }
        }
        System.out.println("---Poner a cero---");
        a.ponerACero();
        System.out.println(a.mostrar());
        
    }
}
