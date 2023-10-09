/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Apartado c
        CajaAhorro caja1 = new CajaAhorro();
        //depositar dinero
        caja1.depositar(500);
        System.out.println("----Apartado c----\nEl saldo actual es: " + caja1.obtenerSaldo());
        //retirar dinero
        caja1.girar(200);
        System.out.println("El saldo actual después de girar es: " + caja1.obtenerSaldo() + "\nNúmero de transacciones: " + caja1.obtenerTransacciones());

        //Apartado d
        CajaAhorro caja2 = new CajaAhorro(1000);
        System.out.println("----Apartado d----\nEl saldo actual es: " + caja2.obtenerSaldo() + "\nNúmero de transacciones: " + caja2.obtenerTransacciones());
    }
}
