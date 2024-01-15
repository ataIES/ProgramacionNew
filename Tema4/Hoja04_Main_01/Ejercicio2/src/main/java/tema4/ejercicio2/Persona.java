/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.printf("---DATOS DE LA PERSONA--- \n\tNombre: %s \n\tEdad: %d\n", nombre, edad);
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }
}
