/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicio1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Integer[] array = new Integer[0];
        Contenedor<Integer> contenedor = new Contenedor<>(array);
        /*System.out.println("---Insertar al principio 5---");
        contenedor.insertarAlPrincipio(5);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al principio 10---");
        contenedor.insertarAlPrincipio(10);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al final 7---");
        contenedor.insertarAlFinal(7);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al final 1---");
        contenedor.insertarAlFinal(1);
        System.out.println(contenedor.toString());
        System.out.println("---Ordenar array---");
        contenedor.ordenar();
        System.out.println(contenedor.toString());
        System.out.println("---Extraer del principio---");
        contenedor.extraerDelPrincipio();
        System.out.println(contenedor.toString());*/
        apilarNumeros(contenedor);

    }

    public static void apilarNumeros(Contenedor<Integer> contenedor) {
        int num = 0;
        while (num != -1) {
            num = validarNumero();
            System.out.println("---Apilando "+num+" ---");
            contenedor.apilar(num);
        }
        if(num==-1){
            System.out.println("---Terminar de apilar---");
            System.out.println(contenedor.toString());
        }
    }

    public static int validarNumero() {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce un número entero: ");
                num = new Scanner(System.in).nextInt();
                if (num >= -1) {
                    valido = true;
                } else {
                    throw new IOException("Error, has introducido número negativo");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
        return num;
    }

}
