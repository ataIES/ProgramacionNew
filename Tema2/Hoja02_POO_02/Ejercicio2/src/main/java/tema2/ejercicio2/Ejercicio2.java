/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creo una variable para el circulo c3
        double radio;
        
        //Creo los objetos c1,c2 y c3
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);
        Circulo c3;
        
        //Introduzco la radio por teclado para c3
        System.out.println("Introduce un radio: ");
        radio = teclado.nextDouble();
        c3 = new Circulo(radio);
        
        //Cambiamos el radio de c1 a 5
        c1.setRadio(5);
        System.out.printf("El radio de c1 es: %.2f",c1.getRadio());
        
        //Mostramos el radio de c3
        System.out.printf("\nEl radio de c3 es: %.2f",c3.getRadio());
        
        //Mostramos el área de c2
        System.out.printf("\nEl área de c2 es: %.2f",c2.area());
        
        //Mostramos el área y longitud de c3
        System.out.printf("\nEl área de c3 es: %.2f y la longitud de c3 es: %.2f",c3.area(),c3.longitud());
    }
}
