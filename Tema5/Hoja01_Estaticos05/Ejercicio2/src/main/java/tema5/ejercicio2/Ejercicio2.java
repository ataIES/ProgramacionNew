/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        //Muestro como está la bombilla
        System.out.println(bombilla.toString());
        System.out.println("Estado de la bombilla general: " + Bombilla.getInterruptorGeneral());
        //Cambio el estado de la bombilla a ON
        System.out.println("");
        System.out.println("Cambio del estado de la bombilla a ON");
        bombilla.cambiarEstadoBombilla(Estado.ON);
        //Muestro si la bombilla está encendida
        System.out.println(validarLuce(bombilla));
        System.out.println(bombilla.toString());
        System.out.println("Estado de la bombilla general: " + Bombilla.getInterruptorGeneral());
        //Cambio el estado general a ON
        System.out.println("");
        System.out.println("---Cambio del estado general a ON");
        Bombilla.cambiarEstadoGeneral(Estado.ON);
        //Muestro si luce
        System.out.println(validarLuce(bombilla));
        System.out.println(bombilla.toString());
        System.out.println("Estado de la bombilla general: " + Bombilla.getInterruptorGeneral());
        System.out.println("");
        //Cambio el estado de la bombilla a OFF
        System.out.println("---CAMBIO DE LA BOMBILLA A OFF---");
        bombilla.cambiarEstadoBombilla(Estado.OFF);
        //Muestro si luce
        System.out.println(validarLuce(bombilla));
        System.out.println(bombilla.toString());
        System.out.println("Estado de la bombilla general: " + Bombilla.getInterruptorGeneral());
    }

    public static String validarLuce(Bombilla b) {
        return b.luce() ? "Está encendida" : "No está encendida";
    }
}
