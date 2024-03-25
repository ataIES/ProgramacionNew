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
        Taller t = new Taller();
        int opc = 0;
        do {
            menu();
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->
                    t.insertarVehiculo();

                case 2 -> {
                    String matricula = Teclado.matricula("Introduce la matricula a reparar");
                    t.repararVehiculo(matricula);
                }
                case 3 -> {
                    String matricula = Teclado.matricula("Introduce la matricula que darás salida");
                    t.darSalidaVehiculo(matricula);
                }
                case 4 -> {
                    System.out.println(t.mostrarEstado());
                }

                case 5 ->
                    System.out.println("Saliendo....");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 5);

    }

    public static void menu() {
        System.out.printf("\n\t---MENÚ DEL TALLER---"
                + "\n1.Insertar Vehiculo"
                + "\n2.Reparar Vehiculo"
                + "\n3.Dar Salida Vehiculo"
                + "\n4.Mostrar estado del Taller"
                + "\n5.Salir"
                + "\nIntroduce una opción: ");
    }
}
