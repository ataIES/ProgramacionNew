/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Persona persona=new Persona("Adrián","Tresgallo","Arozamena","72205130B");
        System.out.println(persona.clave());
        System.out.println(persona.dniValido());
    }
}
