/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema6.ejercicio3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Contenedor contenedor = new Contenedor();
        LinkedList<Residuo> lista = new LinkedList<>();
        int opc = 0;
        do {
            menu();
            opc = teclado.nextInt();

            switch (opc) {
                case 1 ->
                    System.out.println(contenedor.listarContenedor(lista));

                case 2 -> {
                    lista = contenedor.almacenarContenedor(lista);
                }
                case 3 ->
                    contenedor.retirarContenedor(lista);

                case 4 ->
                    System.out.println("Saliendo...");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 4);
    }

    public static void menu() {
        System.out.printf("\n\t---Menú de Contenedor--- "
                + "\n1.Listar Contenedor"
                + "\n2.Almacenar un residuo"
                + "\n3.Retirar un contenedor"
                + "\n4.Salir"
                + "\nIntroduce una opción: ");
    }

}
