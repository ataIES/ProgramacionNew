/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Cilindro extends Figura {

    public Cilindro(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
        return (2 * Math.PI * super.getRadio() * super.getAltura()) + (2 * Math.PI * Math.pow(super.getRadio(), 2));
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(super.getRadio(), 2) * super.getAltura();
    }
    @Override
    public void mostrar(){
        System.out.printf("Cilindro-> Radio: %.2f, Altura: %.2f, Área: %.2f, Volumen: %.2f\n", super.getRadio(), super.getAltura(), area(), volumen()); 
    }
}
