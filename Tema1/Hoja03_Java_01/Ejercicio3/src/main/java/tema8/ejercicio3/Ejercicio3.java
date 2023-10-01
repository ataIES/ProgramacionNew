/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n=0,m=0,multiplo=0;
        System.out.println("Introduce el valor de n: ");
        n=teclado.nextInt();
        System.out.println("Introduce el valor de m: ");
        m=teclado.nextInt();
        
        multiplo=(n%m==0)?0:n-m%n;
        System.out.println("A "+n+" hay que sumarle "+multiplo+" para que sea múltiplo de "+n);
    }
}
