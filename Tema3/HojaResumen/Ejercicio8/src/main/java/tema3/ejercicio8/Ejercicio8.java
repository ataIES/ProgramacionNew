/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int numero = validarNumero();
        System.out.println("Número sin codificar: " + numero);
        System.out.println(codificarNumero(numero));
    }

    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número de 4 dígitos: ");
            num = teclado.nextInt();
            if (num > 1000 && num < 9999) {
                valido = true;
            } else {
                System.out.println("Error, número introducido no tiene 4 dígitos");
            }
        } while (!valido);
        return num;
    }

    public static String codificarNumero(int num) {
        String codificado = "", numero = String.valueOf(num);
        int n = 0, resto = 0;
        for (int i = 0; i < 4; i++) {
            n = Character.getNumericValue(numero.charAt(i));
            n += 7;
            resto = n % 10;
            codificado += resto;
        }
        return codificado;
    }

    public static int codi(int num) {
        int digito1 = 0, digito2 = 0, digito3 = 0, digito4 = 0;
        digito1 = num / 1000;
        digito2 = (num / 100) % 10;
        digito3 = (num / 10) % 10;
        digito4 = num % 10;

        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;

        int temp = digito1;
        digito1 = digito3;
        digito3 = temp;

        temp = digito2;
        digito2 = digito4;
        digito4 = digito2;

        int numCod = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;

        return numCod;
    }
}
