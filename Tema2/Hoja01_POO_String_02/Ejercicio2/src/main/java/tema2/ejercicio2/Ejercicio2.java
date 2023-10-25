/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre = "Adrián", primerApellido = "Tresgallo", segundoApellido = "Arozamena";
        //Concateno los dos apellidos con mi nombre con nombre.concat
        nombre = nombre.concat(" " + primerApellido + " " + segundoApellido);
        //Muestro mi nombre completo y la longitu
        System.out.println("Mi nombre es: " + nombre + "\nLongitud: " + nombre.length());
    }
}
