/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String asteriscos = "*";
        String s1 = "**";

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el numero de filas: ");
        int nfilas = teclado.nextInt();

        int nEspacios = nfilas * 2;//hago que los espacios iniciales sean el doble de las filas que tengo
        int espacios = 0;

        for (int i = nfilas; i >= 1; i--) {

            //calculo los espacios que tengo que dejar, va de mas a menos
            espacios = 0;
            while (espacios <= nEspacios) { //si los espacios de llevo son menores que los que debo tener
                System.out.printf(" ");
                espacios++;
            }

            System.out.println(asteriscos);
            asteriscos = asteriscos.concat(s1);//concateno al String anterior 2 asteriscos mas

            nEspacios--; //resto el numero de espacios que debo dejar
        }
    }
}
