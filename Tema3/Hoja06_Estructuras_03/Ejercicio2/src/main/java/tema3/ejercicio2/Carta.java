/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio2;

/**
 *
 * @author daw1
 */
public class Carta {

    private int numeroCarta;
    private int palo;

    public Carta() {
        this.numeroCarta = (int) (Math.floor(Math.random() * 10) + 1);
        this.palo = (int) (Math.floor(Math.random() * 4) + 1);
    }

    public String mostrar() {
        return numeroCarta + " de " + mostrarPalo();
    }

    private String mostrarPalo() {
        String cadena = "";
        switch (palo) {
            case 1 ->
                cadena = "Oros";

            case 2 ->
                cadena = "Copas";

            case 3 ->
                cadena = "Espadas";

            case 4 ->
                cadena = "Bastos";
        }
        return cadena;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public int getPalo() {
        return palo;
    }

}
