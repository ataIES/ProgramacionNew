/*
 * 2.- 	Escribe Un programa que escriba líneas formadas por números del 1 al 9 sí es una línea impar 
y del 9 al 1 sí es una línea par. 
El número de líneas debe ser introducida por el teclado y solicitado al usuario. 
 */
package hojas_clase.ud_03_hoja_5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        int i=1;
        System.out.println("Introduce el número de líneas: ");
        int numero = teclado.nextInt();
        
        while(i <=numero){
            
            if(i%2!=0){
                int j=9;
                while(j!=0){
                    System.out.printf("%d ", j);
                    j--;
                }
                System.out.println(); 
                
            }
            else{
               int j=1;
                while(j!=10){
                    System.out.printf("%d ", j);
                    j++;
                }
                System.out.println(); 
            }
           
        i++;    
        }//while
        
    }//main
}//clase