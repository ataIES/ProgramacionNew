/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Bombilla {

    private Estado interruptorBombilla;
    private static Estado interruptorGeneral;
    private boolean luce;

    public Bombilla() {
        this.interruptorBombilla = Estado.OFF;
        interruptorGeneral = Estado.OFF;
        this.luce = false;
    }

    public Bombilla(Estado interruptorBombilla) {
        this.interruptorBombilla = interruptorBombilla;
    }
//Metodo que cambia el estado de la bombilla

    public void cambiarEstadoBombilla(Estado estado) {
        this.interruptorBombilla = estado;
    }
//Metodo estático que cambia el estado General 

    public static void cambiarEstadoGeneral(Estado estado) {
        interruptorGeneral = estado;
    }
//Método que muestra el estado de la bombilla

    public Estado getInterruptorBombilla() {
        return interruptorBombilla;
    }
//Método que muestra el estado general

    public static Estado getInterruptorGeneral() {
        return interruptorGeneral;
    }

//Metodo que devuelve boolean si la bombilla luce o no
    public boolean luce() {
        if (interruptorBombilla == Estado.ON && interruptorGeneral == Estado.ON) {
            luce = true;
        } else {
            luce = false;
        }
        return luce;
    }

    @Override
    public String toString() {
        return "Bombilla{" + "interruptorBombilla=" + interruptorBombilla + ", luce=" + luce + '}';
    }

}
