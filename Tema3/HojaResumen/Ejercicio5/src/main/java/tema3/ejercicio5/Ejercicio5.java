/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio5;

/**
 *
 * @author DAW125
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Fraccion F1 = new Fraccion(2, 2);
        Fraccion F2 = new Fraccion(3, 5);
        System.out.println("Fracción 1: "+F1.toString());
        System.out.println("Fracción 2: "+F2.toString());
        System.out.println("---Suma de fracciones---");
        Fraccion fSuma = new Fraccion();
        fSuma = fSuma.suma(F1, F2);
        System.out.println(fSuma.toString());
        System.out.println("---Resta de fracciones---");
        Fraccion fResta = new Fraccion();
        fResta = fResta.resta(F1, F2);
        System.out.println(fResta.toString());
        System.out.println("---Multiplicacion de fracciones---");
        Fraccion fMulti = new Fraccion();
        fMulti = fMulti.multiplicacion(F1, F2);
        System.out.println(fMulti.toString());
        System.out.println("---Division de fracciones---");
        Fraccion fDiv = new Fraccion();
        fDiv = fDiv.division(F1, F2);
        System.out.println(fDiv.toString());
    }
}
