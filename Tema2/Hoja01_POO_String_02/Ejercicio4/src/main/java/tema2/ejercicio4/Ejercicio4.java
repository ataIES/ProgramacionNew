/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio4;

/**
 *
 * @author daw1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String frase="Hola, me llamo Pepito",frase_mitad=" ";
        frase_mitad=frase.substring(0,frase.length()/2);
        //System.out.println(frase+"\nLongitud: "+frase.length()+"\n"+frase_mitad+"\nLongitud: "+frase_mitad.length());
        System.out.println(frase.indexOf("Hola",5));
    }
  
}
