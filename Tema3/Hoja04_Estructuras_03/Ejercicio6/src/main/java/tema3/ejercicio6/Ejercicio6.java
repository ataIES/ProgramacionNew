/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opc = "";
        int num = 0;
        boolean salir = false;
        double cantidad = 0;
     do {
            System.out.println("Introduce la cantidad a apostar: ");
            cantidad = new Scanner(System.in).nextDouble();
            num = (int) (Math.floor(Math.random() * 2) + 1);
            if (num == 1) {
                cantidad *= 2;
                System.out.println("Has ganado, ahora tienes " + String.format("%,.2f", cantidad));
            }
            if (num == 2) {
                cantidad = 0;
                System.out.println("Has perdido todo");
            }
            System.out.println("¿Quieres volver a intentarlo?");
            opc = new Scanner(System.in).nextLine();
            if (opc.equalsIgnoreCase("si")) {
                salir = false;
            }
            if (opc.equalsIgnoreCase("no")) {
                System.out.println("Adios");
                salir = true;
            }
        } while (!salir);
    }
}
