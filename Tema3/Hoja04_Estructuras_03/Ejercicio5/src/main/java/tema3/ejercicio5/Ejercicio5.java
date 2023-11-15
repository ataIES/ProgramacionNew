/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio5;

/**
 *
 * @author daw1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero = 0, mayor = 1, menor = 100;
        String cadena = " ";
        for (int i = 1; i < 11; i++) {
            numero = (int) (Math.floor(Math.random() * 100) + 1);
            cadena += numero + " ";
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println(cadena);
        System.out.println("El mayor es: " + mayor + "\nEl menor es: " + menor);
    }
}
