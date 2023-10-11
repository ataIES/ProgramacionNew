/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Circulo {

    //Creamos un atributo del tipo private que solo se podrá acceder mediante esta clase
    private double radio;

    //Contructor por defecto
    public Circulo() {

    }

    //Contructor que pasamos por parámetros un radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Método para obtener el radio del circulo
    public double getRadio() {
        return radio;
    }

    //Método para asignar el valor de radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Método para obtener el área del Circulo
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    //Metodo para obtener la longitud del Círculo
    public double longitud() {
        return 2 * Math.PI * radio;
    }
}
