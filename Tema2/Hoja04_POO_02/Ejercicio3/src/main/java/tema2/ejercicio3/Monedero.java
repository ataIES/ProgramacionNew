/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio3;

/**
 *
 * @author atres
 */
public class Monedero {

    private double dinero_disponible;

    public Monedero(double dinero_disponible) {
        this.dinero_disponible = dinero_disponible;
    }

    public void aniadirDinero(double cant_dinero) {
        dinero_disponible += cant_dinero;
    }

    public void sacarDinero(double cant_dinero) {
        if (cant_dinero < dinero_disponible) {
            dinero_disponible -= cant_dinero;
        } else {
            System.out.println("No puedes sacar más dinero del que hay");
        }
    }

    public double getDinero_disponible() {
        return dinero_disponible;
    }

}
