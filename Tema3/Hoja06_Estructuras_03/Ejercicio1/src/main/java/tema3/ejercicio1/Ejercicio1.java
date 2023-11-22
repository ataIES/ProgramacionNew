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
        Scanner teclado = new Scanner(System.in);
        int pin = validarPin();
        int opc = 0;
        do {
            System.out.println("\n----Menú del Banco----");
            System.out.println("\t1.Desbloquear tarjeta");
            System.out.println("\t2.Pagar");
            System.out.println("\t3.Salir");
            System.out.println("Introduce una opción: ");
            opc = teclado.nextInt();
            TarjetaDebito tarjeta = new TarjetaDebito("Adrian", "ESN34568545", pin, 100.50);
            switch (opc) {
                case 1 -> {
                    System.out.println("Pin: " + tarjeta.getPin());
                    System.out.println("Introduce el pin para desbloquear la tarjeta: ");
                    int nuevo_pin = teclado.nextInt();
                    tarjeta.desbloquea(nuevo_pin);
                }
                case 2 -> {
                    System.out.println("Introduce el importe de la compra: ");
                    double importe = teclado.nextDouble();
                    System.out.println("Introduce una descripcion: ");
                    String descripcion = new Scanner(System.in).nextLine();
                    System.out.println("¿Incluye propina?: ");
                    String propina = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el pin: ");
                    int nPin = teclado.nextInt();
                    tarjeta.desbloquea(nPin);
                    System.out.println(tarjeta.pagar(importe, nPin, descripcion, propina));
                    System.out.println("\nSaldo disponible: " + String.format("%.2f", tarjeta.getSaldo()));
                }
                case 3 ->
                    System.out.println("Saliendoo");
                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 3);
    }

    public static int validarPin() {
        int nAleatorios = 0;
        String nPin = "";
        for (int i = 0; i < 4; i++) {
            nAleatorios = (int) (Math.floor(Math.random() * 10));
            nPin += nAleatorios;
        }
        return Integer.parseInt(nPin);
    }

}
