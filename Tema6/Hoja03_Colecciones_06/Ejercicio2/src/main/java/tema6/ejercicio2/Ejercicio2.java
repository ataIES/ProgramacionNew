/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        Almacen almacen = new Almacen();
        do {
            menu();
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                    Articulo a = new Articulo();
                    almacen.insertarArticulos(a);
                }

                case 2 -> {
                    almacen.mostrarArticuloPorCódigo();
                }

                case 3 ->
                    System.out.println(almacen.pedidos());

                case 4 ->
                    System.out.println("Hasta Luego!!!");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 4);
    }

    public static void menu() {
        System.out.printf("\n\t---Menú del Almacén---"
                + "\n1.Insertar articulos"
                + "\n2.Buscar articulo por código"
                + "\n3.Mostrar artículos con menos de 5 existencias"
                + "\n4.Salir"
                + "\nIntroduce una opción: ");
    }
}
