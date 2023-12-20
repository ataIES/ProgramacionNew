/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio5;

/**
 *
 * @author DAW125
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("Array invertido");
         for (int i = 0, x = numeros.length-1; i < numeros.length/2; i++,x--) {       
            int aux = numeros[i];   
            numeros[i]=numeros[x]; 
            numeros[x]=aux;
        }
         //Mostrar el invertido
          for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
