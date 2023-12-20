/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int numeros[]=new int[10];
        int aux[]=new int[10];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int) (Math.floor(Math.random()*10)+1);
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("Array invertido");
        for (int i = 0, a = 9; i < aux.length && a >= 0; i++, a--) {
            aux[i]=numeros[a];
            System.out.print(aux[i]+" ");
        }
        
    }
}
