/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Pajaro {

    private String color;
    private int edad;
    //Inicializo a 0 el atributo estático
    private static int numPajaros = 0;

    //Constructor por defecto
    public Pajaro() {
        this.color = " ";
        this.edad = 0;
    }

    //Constructor por parámetros
    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }
//Metodo que suma 1 si hay nuevo pájaro

    public static void nuevoPajaro() {
        numPajaros++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getNumPajaros() {
        return numPajaros;
    }
    //Mostrar al pajaro
    public String muestraPajaro() {
        return "---Pajaro---\nColor: " + color + "\nEdad: " + edad;
    }

}
