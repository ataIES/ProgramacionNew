/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio5;

/**
 *
 * @author daw1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String frase="Hoy es 25 de Octubre y la clase de los jueves es Programacion";
        String frase_convertida=sustituir(frase);
        System.out.println(frase+"\n"+frase_convertida);
    }
    public static String sustituir(String frase){
        //return frase.replace("es", "no por");
        String frase_convertida=" ";
        for(int i=0; i<frase.length();i++){
            if(frase.charAt(i)=='e' && frase.charAt(i+1)=='s'){
                frase_convertida+="no por";
            }else{
                frase_convertida+=frase.charAt(i);
            }
        }
        return frase_convertida;
    }
}
