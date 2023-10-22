/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Calculo {

    public Calculo() {

    }

    //Método de cuenta atrás
    public void metodo1() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("¡DESPEGUE!");
    }

    //Método saber cuantos son positivos,negativos y cuantos nulos
    public void metodo2() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, positivos = 0, negativos = 0, nulos = 0;
        //Cuento los números que voy metiendo hasta 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i);
            numero = teclado.nextInt();
            //Empiezo a contar los positivos y los negativos
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }
        System.out.println("\nPositivos= " + positivos + "\nNegativos= " + negativos + "\nNulos= " + nulos);
    }

    //Método para calcular el factorial
    public void metodo3() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, factorial = 1, contador = 0;
        System.out.println("Introduce un número para calcular su factorial: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de" + numero + " es: " + factorial);
    }

    public void metodo4() {
        Scanner teclado = new Scanner(System.in);
        //pido la frase
        System.out.println("Introduce la frase");
        String frase = teclado.nextLine();

        //Saco la posición donde está el punto
        int posicionPunto = frase.lastIndexOf(".");

        //Obtengo la frase sin contar el punto final
        String frasefinal = frase.substring(0, posicionPunto);

        //Recojo la longitud de la frase
        int cont_caracteres = frasefinal.length();
        System.out.println("Hemos introducido " + cont_caracteres + " caracteres");
    }

    public void metodo5() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, suma = 0, media = 0, cont_numeros = 0;
        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            //Cada vez que introduzco un número los voy sumando
            suma += numero;
            //Utilizo esta variable para contar los número que voy introduciendo
            cont_numeros++;
        } while (numero > 0);
        media = suma / cont_numeros;

        System.out.println("La media es: " + media);
    }

}
