/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Curso c1=new Curso(4);
        c1.mostrar();
        System.out.println("---Mostrar solo iniciales---");
        c1.iniciales();
        System.out.println(" ");
        System.out.println("Desplazo a la derecha");
        c1.desplaza();
        c1.mostrar();
        System.out.println(" ");
        int pos=validarPosicion(4);
        System.out.println("El alumno que está en la posición "+pos+" es: "+c1.verNombre(pos));
        System.out.println("");
        System.out.println("¿Es DAW? "+c1.esDAW());
        
    }
    public static int validarPosicion(int nAlumnos){
        Scanner teclado=new Scanner(System.in);
        boolean valido=false;
        int pos=0;
        do{
            System.out.println("Introduce la posición: ");
            pos=teclado.nextInt();
            if(pos<=nAlumnos){
                valido=true;
            }else{
                System.out.println("Error, la posición excede el número de alumnos");
            }
        }while(!valido);
        return pos;
    }
}
