/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Complejo {

    private double parteReal;
    private double parteImaginaria;

    //Constructor por defecto que inicializa los datos a 0
    public Complejo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }
//Constructor por parámetros 

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
//Metodo que devuelte un objeto del tipo Complejo que suma dos números complejos

    public Complejo sumar(Complejo complejo1, Complejo complejo2) {
        Complejo complejoSuma;
        double sumaReal = 0;
        double sumaImaginaria = 0;

        sumaReal = complejo1.getParteReal() + complejo2.getParteReal();
        sumaImaginaria = complejo1.getParteImaginaria() + complejo2.getParteImaginaria();
        complejoSuma = new Complejo(sumaReal, sumaImaginaria);
        
        return complejoSuma;
    }

    //Método que devuelve un objeto del tipo Complejo que resta dos números complejos
    public Complejo restar(Complejo complejo1, Complejo complejo2) {
        Complejo complejoResta;
        double restaReal = 0;
        double restaImaginaria = 0;

        restaReal = complejo1.getParteReal() - complejo2.getParteReal();
        restaImaginaria = complejo1.getParteImaginaria() - complejo2.getParteImaginaria();
        complejoResta = new Complejo(restaReal, restaImaginaria);
        
        return complejoResta;
    }
//Método que devuelve un objeto del tipo Complejo que multiplica dos número complejos

    public Complejo multiplicarComplejos(Complejo complejo1, Complejo complejo2) {
        Complejo complejoMulti;
        double multiReal = 0;
        double multiImaginaria = 0;

        multiReal = (complejo1.getParteReal() * complejo2.getParteReal()) - (complejo1.getParteImaginaria() * complejo2.getParteImaginaria());
        multiImaginaria = (complejo1.getParteReal() * complejo2.getParteImaginaria()) + (complejo2.getParteImaginaria() * complejo1.getParteReal());
        complejoMulti = new Complejo(multiReal, multiImaginaria);
        
        return complejoMulti;
    }
//Método que devuelve un objeto del tipo Complejo que multiplica un número complejo por un número

    public Complejo multiplicarNumero(Complejo complejo1) {
        Scanner teclado = new Scanner(System.in);
        Complejo complejoMulti;
        double multiReal = 0;
        double multiImaginaria = 0;
        int num = 0;

        System.out.println("Introduce el número a multiplicar: ");
        num = teclado.nextInt();

        multiReal = complejo1.getParteReal() * num;
        multiImaginaria = complejo1.getParteImaginaria() * num;
        complejoMulti = new Complejo(multiReal, multiImaginaria);

        return complejoMulti;
    }
//Método que devuelve un objeto del tipo Complejo que divide dos números complejos

    public Complejo dividrComplejo(Complejo complejo1, Complejo complejo2) {
        Complejo complejoDividir;
        double dividirReal = 0;
        double dividirImaginario = 0;

        dividirReal = ((complejo1.getParteReal() * complejo2.getParteReal()) + (complejo1.getParteImaginaria() * complejo2.getParteImaginaria())) / (Math.pow(complejo2.getParteReal(), 2) + Math.pow(complejo2.getParteImaginaria(), 2));
        dividirImaginario = ((complejo1.getParteImaginaria() * complejo2.getParteImaginaria()) - (complejo1.getParteReal() * complejo2.getParteImaginaria())) / (Math.pow(complejo2.getParteReal(), 2) + Math.pow(complejo2.getParteImaginaria(), 2));
        complejoDividir = new Complejo(dividirReal, dividirImaginario);

        return complejoDividir;
    }

    @Override
    public String toString() {
        return String.format("%.2f", parteReal) + "+" + String.format("%.2f", parteImaginaria) + "i";
    }
}
