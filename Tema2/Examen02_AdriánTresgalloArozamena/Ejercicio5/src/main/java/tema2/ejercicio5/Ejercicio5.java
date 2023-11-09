/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio5;

/**
 *
 * @author Adrian Tresgallo Arozamena
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String coche="Seat León TDI 3 puertas";
        //Contar caracteres de la variable coche
        System.out.println("La cadena coche tiene "+coche.length()+" caracteres");
        //Obtener el número de puertas del coche aplicando métodos a la cadena coche
        //El método indexOf me buscará la posicion donde se encuentre por primera vez el 3 y con charArt muestro el valor de la posicion 
        System.out.println("El numero de puertas es "+coche.charAt(coche.indexOf("3"))+" puertas");
        //Obtener la marca de coche
        System.out.println("La marca del coche es "+coche.substring(0,5).toUpperCase());
        //Reemplazar las e por i
        System.out.println("Reemplaza las e por i "+coche.replace("e", "i"));
    }
}
