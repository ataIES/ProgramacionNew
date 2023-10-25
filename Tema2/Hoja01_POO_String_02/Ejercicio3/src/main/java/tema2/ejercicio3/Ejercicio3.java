/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = " ", frase_cambiada = " ";
        System.out.println("Introduce una frase");
        frase = teclado.nextLine();
        frase_cambiada=cambioVocales(frase);
        System.out.println(frase_cambiada);
    }

    public static String cambioVocales(String frase) {
        String frase_convertida = " ";
        char letra;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
               frase_convertida+="o";
            }else{
                frase_convertida+=frase.charAt(i);
            }
        }
        return frase_convertida;
    }
}
