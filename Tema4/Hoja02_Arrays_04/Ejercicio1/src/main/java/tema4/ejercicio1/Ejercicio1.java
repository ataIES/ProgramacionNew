/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones ope=new Operaciones();
        System.out.println("----Mostrar el array introducido");
        System.out.println(ope.mostrarArray());
        System.out.println(" ");
        ope.multiplicar();
        System.out.println("---Mostrar array multiplicado---");
        System.out.println(ope.mostrarArray());
        System.out.println("");
        System.out.println("La suma de los números en posiciones pares son: "+ope.sumaPares());
        
    }
}
