/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio4;

/**
 *
 * @author daw1
 */
public class Billete {

    private int distancia, n_dias;

    public Billete(int distancia, int n_dias) {
        this.distancia = distancia;
        this.n_dias = n_dias;
    }

    public double importe() {
        double importeTotal = 0, descuento = 0.30;
        if (distancia > 800 && n_dias > 7) {
            importeTotal = (distancia * 0.60) - (distancia * 0.60 * descuento);
        } else {
            importeTotal = distancia * 0.60;
        }
        return importeTotal;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getN_dias() {
        return n_dias;
    }

    public void setN_dias(int n_dias) {
        this.n_dias = n_dias;
    }

}
