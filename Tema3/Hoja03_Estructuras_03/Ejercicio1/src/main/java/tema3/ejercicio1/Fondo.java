/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

/**
 *
 * @author daw1
 */
public class Fondo {

    private double capital;
    private double interes;
    private int anio;

    public Fondo(double capital, double interes, int anio) {
        this.capital = capital;
        this.interes = interes;
        this.anio = anio;
    }

    public void evolucion() {
        double capital_simple = 0;
        double interes_compuesto = 0;
        double capital_compuesto = 0;
        for (int i = 1; i <= anio; i++) {
            //Interés simple
            capital_simple = capital + (capital * interes * i);
            //Interés compuesto
            capital_compuesto=capital+capital_simple;
            System.out.printf("---Año %d--- \nCapital con interés simple: %.2f \nCapital con interés compuesto: %.2f \n", i, capital_simple, capital_compuesto);
        }

    }

    public double getCapital() {
        return capital;
    }

    public double getInteres() {
        return interes;
    }

    public int getAnio() {
        return anio;
    }

    public String mostrar() {
        return "Capital: " + capital + "\nInterés: " + interes + "\nAños capital en el fondo: " + anio + "\n";
    }

}
