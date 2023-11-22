/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

/**
 *
 * @author daw1
 */
public class TarjetaDebito {
    private String nombreTitular;
    private String numeroCuenta;
    private int pin;
    private Habilitar habilitada;
    private double saldo;

    public TarjetaDebito(String nombreTitular, String numeroCuenta, int pin, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
        this.saldo = saldo;
        this.habilitada=habilitada.BLOQUEADA;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Habilitar getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Habilitar habilitada) {
        this.habilitada = habilitada;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void desbloquea(int nuevo_pin){
        if(pin==nuevo_pin){
            setHabilitada(habilitada.HABILITADA);
        }
    }
    public void pagar(double importeCompra, int pin, String descripcion,String propina){
        if(habilitada!=Habilitar.HABILITADA){
            System.out.println("Error, tarjeta no habilitada");
        }else if(this.pin!=pin){
            System.out.println("Error, PIN incorrecto");
        }
        else if(importeCompra>saldo){
            System.out.println("Error, Importe mayor que el saldo disponible");
        }
        else if(propina.equalsIgnoreCase("Si")){
            importeCompra+=(importeCompra*0.05);
        }
        setSaldo(saldo-importeCompra);
    }
    private String 
    
    
   
}
