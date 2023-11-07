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
        //Establezco un circulo con un cosntructor sin parámetro y  le asigno un radio con setRadio
        Circulo c1=new Circulo();
        c1.setRadio(6.30f);
        System.out.println("Radio del circulo del primer círculo una vez establecido un radio: "+c1.getRadio());
        
        Circulo c2=new Circulo(10);
        System.out.println("Radio del círculo del segundo círculo nada más crearlo: "+c2.getRadio());
    }
}
