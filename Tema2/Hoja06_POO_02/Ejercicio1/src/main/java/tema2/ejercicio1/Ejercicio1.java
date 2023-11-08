/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio1;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Taller taller=new Taller(10,10);
        System.out.println(taller.toString());
        //Creo un objeto de tipo taller utilizando el constructor copia
        Taller taller2=new Taller(taller);
        System.out.println("Taller creado por constructor copia");
        System.out.println(taller2.toString());
        //Añado 3 bidones de aceite y ruedas
        taller.addAceite(3);
        taller.addRuedas(4);
        System.out.println("");
        System.out.println(taller.toString());
        //Realizo un cambio parcial y un cambio total
        taller.cambioParcial();
        System.out.println(" ");
        System.out.println(taller.toString());
        taller.cambioCompleto();
        System.out.println("");
        System.out.println(taller.toString());
    }
}
