/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio8;

/**
 *
 * @author DAW125
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        int aux = 0;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
            System.out.print(numeros[i] + " ");

        }
        System.out.println("");
        for (int c = 1; c < numeros.length; c++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] <= numeros[c]) {
                    aux = numeros[i];
                    numeros[i] = numeros[c];
                    numeros[c] = aux;
                }
            }
        }
        
        //Mostrar ordenado de mayor a menor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        
        //Obtener el segundo mayor
        int mayor = numeros[0];
        int segundoMayor=0;
        for (int i = 1; i < numeros.length && !encontrado; i++) {
            //Esta condición es para evitar los duplicados
            if (mayor != numeros[i]) {
                if (mayor > numeros[i]) {
                    segundoMayor = numeros[i];
                    encontrado = true;
                }
            }
        }
        System.out.println("El segundo mayor es: " + segundoMayor);
    }
}
