/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen01.ejemplo_clases;

/**
 *
 * @author daw1
 */
public class Pez {

    //Definimos atributos con su tipo y su nombre
    private String color;
    private String tipo;
    private int tamano;

    //contructores ->Permiten instanciar la clase y su nombre es el mismo
    //contructor por defecto
    public Pez() {

    }

    //constructor un parámtero del tipo int parámetros
    public Pez(int _tamano) {
        tamano = _tamano;
    }

    //constructor de tres parámetros
    public Pez(String miColor, String miTipo, int miTamano) {
        color = miColor;
        tipo = miTipo;
        tamano = miTamano;
    }

    //Definimos los métodos
    public void respirar() {
        //contenido del método
    }

    public void nadar() {
        //contenido del método
    }

    public void alimentarse() {
        //contenido del método
    }

    //Métodos get y set para obtener y modificar los atributos de la clase
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
}
