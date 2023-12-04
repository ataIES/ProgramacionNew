/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int suma=0;
        for(int i=1;i<=40;i++){
            if(i%2==0){
                System.out.print(i+" ");
                suma+=i;
            }
        }
        System.out.print("son los pares\n");
        System.out.println("La suma de los pares son: "+suma);
    }
}
