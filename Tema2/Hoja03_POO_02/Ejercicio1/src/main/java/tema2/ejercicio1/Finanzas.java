/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Finanzas {

    private final double DOLARES_EUROS;

    public Finanzas() {
        DOLARES_EUROS = 1.06;
    }

    public Finanzas(double cambio_euro) {
        this.DOLARES_EUROS = cambio_euro;
    }

    public double dolaresToEuros(double cantidad_recibida) {
        return cantidad_recibida * DOLARES_EUROS;
    }

    public double eurosToDolares(double cantidad_recibida) {
        return cantidad_recibida / DOLARES_EUROS;
    }

    public double getDOLARES_EUROS() {
        return DOLARES_EUROS;
    }
    

}
