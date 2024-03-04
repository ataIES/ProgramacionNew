/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Integer[] array = new Integer[0];
        Contenedor<Integer> contenedor = new Contenedor<>(array);
        System.out.println("---Insertar al principio 5---");
        contenedor.insertarAlPrincipio(5);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al principio 10---");
        contenedor.insertarAlPrincipio(10);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al final 7---");
        contenedor.insertarAlFinal(7);
        System.out.println(contenedor.toString());
        System.out.println("---Insertar al final 1---");
        contenedor.insertarAlFinal(1);
        System.out.println(contenedor.toString());
        System.out.println("---Ordenar array---");
        contenedor.ordenar();
        System.out.println(contenedor.toString());
        System.out.println("---Extraer del principio---");
        contenedor.extraerDelPrincipio();
        System.out.println(contenedor.toString());
        
    }
   
}
