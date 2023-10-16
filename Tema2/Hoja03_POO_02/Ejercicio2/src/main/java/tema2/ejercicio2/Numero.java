/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Numero {

    private int numero;

    public Numero() {
        numero = 0;
    }

    public Numero(int nuevo_numero) {
        this.numero = nuevo_numero;
    }

    public void suma(int num_suma) {
        numero += num_suma;
    }

    public void resta(int num_resta) {
        numero -= num_resta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int doble() {
        return numero *= 2;
    }

    public int triple() {
        return numero *= 3;
    }

}
