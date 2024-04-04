/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int opc = 0;
        AccesoClientes operaciones = new AccesoClientes();
        do {
            menu();
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 -> {
                    Cliente cliente = new Cliente();
                    operaciones.aniadirCliente(cliente);
                }
                case 2 ->
                    operaciones.atenderCliente();

                case 3 -> {
                    System.out.println("El tiempo medio es "+operaciones.tiempoMedioEspera()+" minutos");
                }

                case 5 ->
                    System.out.println(operaciones.mostrarClientes());

                case 6 ->
                    System.out.println("Muchas Gracias!");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 6);
    }

    public static void menu() {
        System.out.printf("\n\tMENÚ DE OPCIONES "
                + "\n1.Añadir cliente"
                + "\n2.Atender Cliente"
                + "\n3.Obtener tiempo medio de los clientes sin atender"
                + "\n4.Obtener tiempo medio de los clientes atendidos"
                + "\n5.Mostrar todos los clientes"
                + "\n6.Salir\n"
                + "\nIntroduce una opción: ");
    }
}
