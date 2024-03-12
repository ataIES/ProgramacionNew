/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int nAsociacion = Integer.parseInt(args[0]);
        Asociacion asociacion = new Asociacion(nAsociacion);
        asociacion.insertarPersona();
        asociacion.insertarPersona();
        asociacion.insertarPersona();
        
        
        System.out.println("---BUSCAR EL DNI 72350548T---");
        String dni = new Scanner(System.in).nextLine();
        asociacion.buscarPorDNI(dni);
        System.out.println("---Mostrar lista---");
        System.out.println(asociacion.mostrarLista());
        System.out.println("---Ordenar por dni---");
        asociacion.ordenarPorDNI();
        System.out.println(asociacion.mostrarLista());
        System.out.println("---Ordenar por Nombre---");
        asociacion.ordenarPorNombre();
        System.out.println(asociacion.mostrarLista());
    }
}
