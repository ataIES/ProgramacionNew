/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Cono extends Figura {

    public Cono(double radio1, double altura1) {
        super(radio1, altura1);
    }

    @Override
    public double area() {
        return (Math.PI * super.getRadio() + super.getAltura() + (Math.PI * Math.pow(super.getRadio(), 2)));
    }

    @Override
    public double volumen() {
        return (Math.PI * Math.pow(super.getRadio(), 2) * super.getAltura()) / 3;
    }

    @Override
    public void mostrar() {
        System.out.printf("Cono-> Radio: %.2f, Altura: %.2f, Área: %.2f, Volumen: %.2f\n", super.getRadio(), super.getAltura(), area(), volumen());
    }

}
