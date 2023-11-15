/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int clave =(int) Math.floor(Math.random()*(9999-1000+1))+1000, codigo=0,intentos=4;
        System.out.println("Clave "+clave);
        do {
            System.out.println("Introduce la clave de 4 dígitos: ");
            codigo = teclado.nextInt();
            if (codigo == clave) {
                System.out.println("Caja abierta correctamente");
                intentos=0;
            } else {
                intentos--;
                System.out.println("Clave incorrecta, quedan " + intentos + " intentos");
            }
        } while (intentos > 0);

    }
}
