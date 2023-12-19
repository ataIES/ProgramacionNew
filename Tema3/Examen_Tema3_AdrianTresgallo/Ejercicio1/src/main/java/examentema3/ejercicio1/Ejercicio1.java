/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        double saldo=0;
        do {
            System.out.print(menu());
            opc = teclado.nextInt();
            Contrato contrato1 = new Contrato(0.15, 0.05, 25);
            switch (opc) {
                case 1 -> {
                    contrato1.restarSaldo(0.15);
                    System.out.println("Llamando....");
                    System.out.printf("Se ha restado %.2f€ de tu saldo\n", contrato1.getCostoLlamada());
                    saldo=contrato1.getSaldo();
                }
                case 2 -> {
                    contrato1.restarSaldo(0.05);
                    System.out.println("Enviando Mensaje...");
                    System.out.printf("Se ha restado %.2f€ de tu saldo\n", contrato1.getCostoMensaje());
                    saldo=contrato1.getSaldo();
                }
                case 3 -> {
                    System.out.printf("Tu saldo actual es: %.2f€\n", saldo);
                }
                case 4 ->
                    System.out.println("¡Hasta Luego!");

                default ->
                    System.out.println("Error, opción errónea");
            }
        } while (opc != 4);
    }

    public static String menu() {
        return "----Centralita Telefónica--- \n\t1.Llamar \n\t2.Enviar Mensaje \n\t3.Ver Saldo \n\t4.Salir \nSelecciona una opción: ";
    }
}
