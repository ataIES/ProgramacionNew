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
        int num_suma = 0, num_resta = 0;
        Numero num = new Numero();
        //Voy a mostrar cual es el número que tenemos metido inicialmente
        System.out.println("Tenemos " + num.getNumero());
        //Vamos a ir sumando y restando valores que metamos por teclado
        System.out.println("Introduce un valor para sumar: ");
        num_suma = teclado.nextInt();
        //Ahora sumamos con el método creado en la clase
        num.suma(num_suma);
        System.out.println("Tenemos " + num.getNumero());

        System.out.println("Introduce un valor para restar: ");
        num_resta = teclado.nextInt();
        num.resta(num_resta);
        System.out.println("Tenemos " + num.getNumero());

        //Ahora utilizaremos los metodos doble y triple pero estos métodos los utilizaré con otro objeto
        Numero num2 = new Numero(20);
        //Guardaré el número en una variable auxiliar
        int numeroaux = num2.getNumero();
        //Muestro el doble y el triple

        System.out.println("----Con constructor con parámetros----\nEl doble de " + numeroaux + " es: " + num2.doble() + "\nEl triple de " + numeroaux
                + " es " + num2.triple());

    }
}
