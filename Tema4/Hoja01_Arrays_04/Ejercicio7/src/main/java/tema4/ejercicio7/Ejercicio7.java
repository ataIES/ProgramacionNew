/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio7;

/**
 *
 * @author DAW125
 */
public class Ejercicio7 {
//Ordenar de mayor a menor un array
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int aux = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
            System.out.print(numeros[i] + " ");

        }
        System.out.println("");
        System.out.println("Ordenado de mayor a menor");
        
        for (int c = 1; c <numeros.length; c++) {    
            for (int i = 0; i < numeros.length - 1; i++) {   
                if (numeros[i] <= numeros[c]) {   
                    aux = numeros[i];       
                    numeros[i] = numeros[c];
                    numeros[c] = aux;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
    }

}
