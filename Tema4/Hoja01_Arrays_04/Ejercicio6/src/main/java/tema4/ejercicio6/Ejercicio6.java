/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio6;

/**
 *
 * @author DAW125
 */
public class Ejercicio6 {
//Obtener el mayor de un array de números
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int mayor=numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
            System.out.print(numeros[i] + " ");
            if(mayor<=numeros[i]){
                mayor=numeros[i];
            }
        }
        System.out.println("");
        System.out.println("El mayor es: "+mayor);
    }
}
