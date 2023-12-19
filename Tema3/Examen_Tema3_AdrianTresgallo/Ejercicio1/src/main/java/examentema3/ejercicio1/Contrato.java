/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema3.ejercicio1;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Contrato {

//Atributos costoLlamada y costoMensaje como final, por ser un atributo que no va a variar de valor
    private final double costoLlamada;
    private final double costoMensaje;
    private double saldo;

    public Contrato(double costoLlamada, double costoMensaje, double saldo) {
        this.costoLlamada = costoLlamada;
        this.costoMensaje = costoMensaje;
        this.saldo = saldo;
    }
//Metodos get

    public double getSaldo() {
        return saldo;
    }

    public double getCostoLlamada() {
        return costoLlamada;
    }

    public double getCostoMensaje() {
        return costoMensaje;
    }

//Método que resta el saldo al realizar una llamada o mensaje
    public void restarSaldo(double cantidad) {
        if (cantidad > 0) {
            saldo -= cantidad;
        } else {
            System.out.println("Error, cantidad menor que 0");
        }
    }

   
    
    
    
}
