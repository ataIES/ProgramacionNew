/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do {
            menu();
            System.out.println("Introduce una opción: ");
            opc = teclado.nextInt();
            Banco banco = new Banco(3);
            switch (opc) {
                case 1 ->
                    banco.ingresarCliente();

                case 2 ->
                    System.out.println(banco.mostrar());

                case 3 ->
                    System.out.println(banco.buscar(1));

                case 4 ->
                    banco.eliminar();

                case 5 ->
                    System.out.println("Saliendoo");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 5);

    }

    public static void menu() {
        System.out.println("---MENÚ DE BANCO---");
        System.out.println("1.Ingresar cliente");
        System.out.println("2.Mostrar usuarios del banco");
        System.out.println("3.Buscar cliente");
        System.out.println("4.Eliminar cliente");
        System.out.println("5.Salir");
    }
}
