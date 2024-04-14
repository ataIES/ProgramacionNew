/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author atres
 */
public abstract class CuentaBancaria implements Identificable {
    protected Persona titular;
    protected double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;

    public CuentaBancaria(Persona titular, double saldo, String entidad, String oficina, String cuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.entidad = entidad;
        this.oficina = oficina;
        this.cuenta = cuenta;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public Map listaObjeto() {
        Map<String,String>matriz= new HashMap();
        
        matriz.putAll(titular.listaObjeto());
        matriz.put("Saldo: ", String.valueOf(saldo));
        
        return matriz;
        
    }
    public void ingresar(double cantidad){
        saldo+=cantidad;
    }
    public void retirar(double cantidad){
        if(saldo>cantidad){
            saldo-=cantidad;
        }else{
            System.out.println("Error, no se puede retirar saldo, cantidad a retirar mayor que saldo disponible");
        }
    }
    
    
}
