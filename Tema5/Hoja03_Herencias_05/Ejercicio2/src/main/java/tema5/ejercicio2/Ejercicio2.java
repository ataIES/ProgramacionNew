/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno(4);
        Profesor profesor = new Profesor(4);
        System.out.println(alumno.mostrar());
        System.out.println(" ");
        System.out.println(profesor.mostrar());
    }
}
