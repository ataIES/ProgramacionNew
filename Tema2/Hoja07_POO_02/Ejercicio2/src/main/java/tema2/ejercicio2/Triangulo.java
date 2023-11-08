/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Triangulo {

    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esIsosceles() {
        boolean isosceles = false;
        if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
            isosceles = true;
        }
        return isosceles;
    }

    public boolean esEquilatero() {
        boolean equilatero = false;
        if (lado1 == lado2 && lado2 == lado3) {
            equilatero = true;
        }
        return equilatero;
    }

    public int perimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public void mostrarTriangulo(){
        System.out.println("Lado1= "+lado1+"\nLado2= "+lado2+"\nLado3= "+lado3);
    }
}
