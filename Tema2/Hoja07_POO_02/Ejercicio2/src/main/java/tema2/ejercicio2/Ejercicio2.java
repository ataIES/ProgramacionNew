/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Triangulo t1=new Triangulo(10,10,10);
        t1.mostrarTriangulo();
        System.out.println("¿Es Isósceles?: "+t1.esIsosceles()+"\n¿Es Equilátero?: "+t1.esEquilatero()
        +"\nPerímetro: "+t1.perimetro());
    }
}
