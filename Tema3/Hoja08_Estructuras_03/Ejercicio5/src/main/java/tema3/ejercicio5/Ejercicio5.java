/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*Variable numero1 para introducir el número que nos mirará si es fuerte
        Variable numeroFactorial guarda la suma de los numeros factoriales que compone el numero1
        Variable numeroI guarda el factorial de un número que compone numero1
         */
        int numero1 = 0, fact_n = 0, temp = numero1, i = 0, rem = 0, total = 0;
        String numeroAux = "";
        System.out.println("Introduce un número: ");
        numero1 = teclado.nextInt();
        //Transformo a String para sacar el número de cifras
        /*
        numeroAux = String.valueOf(numero1);
        for (int i = 0; i < numeroAux.length(); i++) {
            
            numeroI = factorial(Character.getNumericValue(numeroAux.charAt(i)));
            numeroFactorial += numeroI;
            System.out.println("El factorial de " + numeroAux.charAt(i) + " es: " + numeroI);

        }
         */
        while (numero1 != 0) {
            i = 1;
            fact_n = 1;
            rem = numero1 % 10;
            while (i <= rem) {
                fact_n = fact_n * i;
                i++;
            }
        }
        total=total+fact_n;
        numero1=numero1/10;

        //Condicion para saber si el número es fuerte
        if (total == temp) {
            System.out.println("Es un número fuerte");
        } else {
            System.out.println("No es un número fuerte");
        }

    }   
}
