/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio5;

/**
 *
 * @author DAW125
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {

    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

//Método que calcula la suma de dos fracciones
    public Fraccion suma(Fraccion f1, Fraccion f2) {
        Fraccion auxFraccion = new Fraccion();
        int numeroAux = minimoComunMultiplo(f1.denominador, f2.denominador);;
        if (f1.denominador == f2.denominador) {
            auxFraccion.numerador = f1.numerador + f2.numerador;
            auxFraccion.denominador = f1.denominador;
        } else {
            auxFraccion.numerador = (f1.numerador * (numeroAux / f1.numerador)) + (f2.numerador * (numeroAux / f2.denominador));
            auxFraccion.denominador = numeroAux;
        }
        return auxFraccion;
    }

    //Método que calcula la resta de dos fracciones
    public Fraccion resta(Fraccion f1, Fraccion f2) {
        Fraccion auxFraccion = new Fraccion();
        int numeroAux = minimoComunMultiplo(f1.denominador, f2.denominador);;
        if (f1.denominador == f2.denominador) {
            auxFraccion.numerador = f1.numerador - f2.numerador;
            auxFraccion.denominador = f1.denominador;
        } else {
            auxFraccion.numerador = (f1.numerador * (numeroAux / f1.numerador)) - (f2.numerador * (numeroAux / f2.denominador));
            auxFraccion.denominador = numeroAux;
        }
        return auxFraccion;
    }

    //Método que calcula la multiplicacion de dos fracciones
    public Fraccion multiplicacion(Fraccion f1, Fraccion f2) {
        Fraccion auxFraccion = new Fraccion();
        auxFraccion.numerador = f1.numerador * f2.numerador;
        auxFraccion.denominador = f1.denominador * f2.denominador;

        return auxFraccion;
    }

    //Método que calcula la division de dos fracciones
    public Fraccion division(Fraccion f1, Fraccion f2) {
        Fraccion auxFraccion = new Fraccion();
        auxFraccion.numerador = f1.numerador * f2.denominador;
        auxFraccion.denominador = f1.denominador * f2.numerador;
        
        return auxFraccion;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

    public static int minimoComunMultiplo(int num1, int num2) {
        return (num1 * num2) / maximoComunDivisor(num1, num2);
    }

    public static int maximoComunDivisor(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return maximoComunDivisor(num2, num1 % num2);
        }
    }

}
