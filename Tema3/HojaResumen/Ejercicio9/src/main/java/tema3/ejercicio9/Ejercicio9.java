/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        int opc = 0;
        do {
            System.out.println(menu());
            System.out.println("Introduce una opción: ");
            opc = teclado.nextInt();
            numero = valorNumero(opc);
            switch (opc) {
                case 1 -> {
                    System.out.printf("Área del Circulo: %.4f \n", areaCirculo(numero));
                }
                case 2 -> {
                    System.out.printf("Perímetro del Circulo: %.4f \n", perimetroCircunferencia(numero));
                }
                case 3 -> {
                    System.out.printf("Área del Cuadrado: %.4f \n", areaCuadrado(numero));
                }
                case 4 -> {
                    System.out.printf("Perímetro del Cuadrado: %.4f \n", perimetroCuadrado(numero));
                }
                case 5 ->
                    System.out.println("Hasta otra!!!");
                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 5);
    }
//Método que calcula el área de un círculo

    public static double areaCirculo(double numero) {
        return Math.PI * Math.pow(numero, 2);
    }
//Método que calcula el perímetro de una circunferencia

    public static double perimetroCircunferencia(double numero) {
        return 2 * Math.PI * numero;
    }
//Método que calcula el área de un cuadrado

    public static double areaCuadrado(double numero) {
        return numero * numero;
    }
//Método que calcula el perímetro del cuadrado

    public static double perimetroCuadrado(double numero) {
        return 4 * numero;
    }
//Método que crea el menú

    public static String menu() {
        return "---Menú de Opciones---\n\t1.Área del Círculo\n\t2.Perímetro de Circunferencia"
                + "\n\t3.Área del Cuadrado\n\t4.Perímetro del Cuadrado\n\t5.Salir";
    }
//Método que según la opción sea un lado o un radio

    public static double valorNumero(int opcion) {
        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        if (opcion == 1 || opcion == 2) {
            System.out.println("Introduce el radio: ");
            valor = teclado.nextDouble();
        } else if (opcion == 3 || opcion == 4) {
            System.out.println("Introduce el lado: ");
            valor = teclado.nextDouble();
        }
        return valor;
    }
}
