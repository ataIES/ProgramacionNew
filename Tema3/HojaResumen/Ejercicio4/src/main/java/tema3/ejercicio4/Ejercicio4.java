/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1=0, num2=0;
        System.out.println("Introduce el primer numero: ");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2=teclado.nextInt();
        System.out.println("El MCD es: "+maximoComunDivisor(num1,num2));
        System.out.println("El mcm es: "+minimoComunMultiplo(num1,num2));
    }
    public static int minimoComunMultiplo(int num1,int num2){
       return (num1*num2)/maximoComunDivisor(num1,num2); 
    }
     public static int maximoComunDivisor(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return maximoComunDivisor(num2, num1 % num2);
        }
    }
}
