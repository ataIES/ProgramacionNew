/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Calculo {

    private Scanner teclado;

    public Calculo() {
        teclado = new Scanner(System.in);
    }

    public void metodo1() {
        int numero = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();

        if (numero >= 100 && numero <= 1000) {
            System.out.println("Está comprendido");
        } else {
            System.out.println("No está comprendido");
        }
    }

    public void metodo2() {
        int numero = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es nulo");
        }
    }

    public void metodo3() {
        int numero = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();

        if ((numero % 2 == 0) && (numero % 5 == 0)) {
            System.out.println("Es divisible por 2 y 5");
        } else {
            System.out.println("No es divisible por 2 y 5");
        }
    }

    public void metodo4() {
        double numero = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextDouble();

        if (numero % 1 != 0) {
            System.out.println("Tiene parte fraccionaria");
        } else {
            System.out.println("No tiene parte fraccionaria");
        }

    }

    public void metodo5() {
        int anio = 0;
        System.out.println("Introduce un año: (1900-2100)");
        anio = teclado.nextInt();
        if (anio < 1900 && anio > 2100) {
            if ((anio % 4 == 0) || ((anio % 100 == 0) && (anio % 400 != 0))) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } else {
            System.out.println("El año está fuera del rango");
        }
    }

    public void metodo6() {
        int numero = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public void metodo7() {
        int numero = 0;
        System.out.println("Introduce un número:(1-10) ");
        numero = teclado.nextInt();
        if (numero >= 1 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } else {
            System.out.println("No está en el rango establecido");
        }
    }

    public void metodo8() {
        int numero1 = 0, numero2 = 0, numero3 = 0;
        int mayor = 0, menor = 0, medio = 0;
        System.out.println("Introduce el número 1: ");
        numero1 = teclado.nextInt();

        System.out.println("Introduce el número 2: ");
        numero2 = teclado.nextInt();

        System.out.println("Introduce el número 3: ");
        numero3 = teclado.nextInt();
        //Sacaré el numero mayor
        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        //Sacaré el numero menor
        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }
        /*
        mayor = Math.max(numero1, Math.max(numero2, numero3));
        menor = Math.min(numero1, Math.min(numero2, numero3));
         */
        //Aqui compruebo que si tengo dos número iguales me asigne el valor en la variable medio
        if ((numero1 == numero2 || numero1 == numero3)) {
            medio = numero1;
        } else if (numero2 == numero3) {
            medio = numero2;
        }

        //Aqui compruebo que número deberá de estar en medio
        if (numero1 != mayor && numero1 != menor) {
            medio = numero1;
        }
        if (numero2 != mayor && numero2 != menor) {
            medio = numero2;
        }
        if (numero3 != mayor && numero3 != menor) {
            medio = numero3;
        }
        System.out.println(mayor + " " + medio + " " + menor);

    }

    public void metodo9() {
        int numero1 = 0, numero2 = 0;

        System.out.println("Introduce el número1: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el número 2: ");
        numero2 = teclado.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es divisible entre " + numero2);
        } else if (numero2 % numero1 == 0) {
            System.out.println(numero2 + " es divisible entre " + numero1);
        } else {
            System.out.println("No es divisible entre ellos");
        }
    }

}
