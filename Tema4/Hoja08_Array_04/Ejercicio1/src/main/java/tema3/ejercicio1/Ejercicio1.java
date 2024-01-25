/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio1;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Array a=new Array();
        Array b=new Array();
        a.introducir();
        b.introducir();
        System.out.println("---Mostrar array---");
        a.mostrar();
        System.out.println("");
        System.out.println("---MEDIA---");
        System.out.println("La media es: "+a.media());
        System.out.println("---Modificar número en una posición---");
        a.modificar(12, 1);
        a.mostrar();
        System.out.println("");
        System.out.println("---ROTAR A LA DERECHA---");
        a.rotarDerecha();
        a.mostrar();
        System.out.println("");
        System.out.println("---ROTAR A LA IZQUIERDA---");
        a.rotarIzquierda();
        a.mostrar();
        System.out.println("---COMPARAR CON ARRAY B---");
        a.comparar(b);
        
    }
}
