/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0, num = 0;
        num = validarNumero("Introduce un número entero positivo: ");
        do {
            System.out.println("----Menú de Operaciones----");
            System.out.println("\t1.Contar cuántas cifras tiene");
            System.out.println("\t2.Escribir sus 10 primeros múltiplos");
            System.out.println("\t3.Decir si es perfecto");
            System.out.println("\t4.Cambiar de número");
            System.out.println("\t0.Salir");
            System.out.println("Introduce una opción:");
            opc = teclado.nextInt();
            Operaciones ope = new Operaciones(num);

            switch (opc) {
                case 1 ->
                    System.out.println("El número " + num + " tiene " + ope.contarCifras() + " cifras");

                case 2 -> {
                    ope.multiplos();
                    System.out.println("");
                }

                case 3 -> {
                    String perfecto = ope.perfecto() ? "Es perfecto" : "No es perfecto";
                    System.out.println(perfecto);
                }
                case 4 -> {
                    num = validarNumero("Introduce un nuevo número entero positivo");
                }
                case -1 ->
                    System.out.println("Saliendo....");

                default ->
                    System.out.println("Error, has introducido una opción errónea");
            }
        } while (opc != 0);

    }

    public static int validarNumero(String texto) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println(texto);
            numero = teclado.nextInt();
            if (numero > 0) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (!valido);
        return numero;
    }
}
