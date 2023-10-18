/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio3;

/**
 *
 * @author daw1
 */
public class Llamada {

    private int segundos;

    public Llamada() {
        segundos = 0;
    }

    public double aPagar(int minutos, int segundos) {
        double costeLlamada = 0;
        this.segundos = minutos * 60 + segundos;
        if (this.segundos <= 60) {
            costeLlamada = 0.25;
        } else {
            costeLlamada = (this.segundos - 60) * 0.1 + 0.25;
        }
        return costeLlamada;
    }

}
