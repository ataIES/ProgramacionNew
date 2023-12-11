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
        System.out.println(codificarNumero(numero));
    }

    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número de 4 dígitos: ");
            num = teclado.nextInt();
            if (String.valueOf(num).length() == 4) {
                valido = true;
            } else {
                System.out.println("Error, número introducido no tiene 4 dígitos");
            }
        } while (!valido);
        return num;
    }

    public static String codificarNumero(int num) {
        String numeroCodificado = "", numero = String.valueOf(num);
        int n = 0, resto = 0;
        for (int i = 0; i < 4; i++) {
            n = Character.getNumericValue(numero.charAt(i));
            n += 7;
            resto = n % 10;
            numeroCodificado+=resto;         
        }
       
        return numeroCodificado;
    }
}
