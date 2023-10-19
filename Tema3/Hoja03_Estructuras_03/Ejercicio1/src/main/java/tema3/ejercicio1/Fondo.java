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
        double capital_final = 0;
        double capital_compuesto=0;
        for (int i = 1; i <= anio; i++) {
            capital_final = capital + (capital * (interes / 100) * i);
            capital_compuesto=capital+Math.pow(1+interes, i);
            System.out.printf("---Año %d--- \nCapital final: %.2f \nInterés compuesto: %.2f", i, capital_final,capital_compuesto);
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
