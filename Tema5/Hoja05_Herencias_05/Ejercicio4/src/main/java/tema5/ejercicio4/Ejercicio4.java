/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5.ejercicio4;

/**
 *
 * @author atres
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Instrumento i=new Instrumento();
        Piano p=new Piano();
        Flauta f=new Flauta();
        i.tocarNota();
        p.tocarNota();
        f.tocarNota();
        System.out.println("Vemos el ejemplo de la ligadura dinámica");
        tocarInstrumento(f);
        tocarInstrumento(p);
    }
    //ligadura dinamica
    public static void tocarInstrumento(Instrumento instrumento1){
        instrumento1.tocarNota(); //es en tiempo de ejecución cuando se decide qué instrumento es y que nota toca
    }
}
