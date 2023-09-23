/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio7;

/**
 *
 * @author atres
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Utilizaré una variable auxiliar para el intercambio
        int a,b,aux;
        a=23;
        b=56;
        System.out.println("Valores antes de intercambiar de a: "+a+" y  de b: "+b);
        aux=a;
        a=b;
        b=aux;
        System.out.println("Valores después de intercambiar de a: "+a+" y de b: "+b);
    }
}
