/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public abstract class Figura {

    private double radio;
    private double altura;

    public Figura(double radio1, double altura1) {
        this.radio = radio1;
        this.altura = altura1;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public abstract double area();

    public abstract double volumen();
    
    public abstract void mostrar();
}
