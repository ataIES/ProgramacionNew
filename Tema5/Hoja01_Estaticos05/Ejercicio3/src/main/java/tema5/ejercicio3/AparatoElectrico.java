/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class AparatoElectrico {

    private static double consumoTotal;
    private double potencia;
    private boolean encendido;

    public AparatoElectrico(double potencia1) {
        this.potencia = potencia1;
        this.encendido = false;
        consumoTotal = 0;
    }
//Método estático que devuelve el consumoTotal

    public static double getConsumoTotal() {
        return consumoTotal;
    }
//Método que devuelve la potencia del aparato electrico

    public double getPotencia() {
        return potencia;
    }
    //Metodo que incremente el consumo a la potencia y enciende el aparato  

    public void enciende() {
        consumoTotal += potencia;
        this.encendido = true;
    }

    //Metodo que decrementa el consumo a la potencia y apaga el aparato
    public void apaga() {
        consumoTotal -= potencia;
        this.encendido = false;
    }

    //Muestra los datos del aparato
    @Override
    public String toString() {
        String encender = encendido ? "Sí" : "No";
        return "AparatoElectrico{" + "potencia=" + potencia + " w" + ", encendido=" + encender + '}';
    }

}
