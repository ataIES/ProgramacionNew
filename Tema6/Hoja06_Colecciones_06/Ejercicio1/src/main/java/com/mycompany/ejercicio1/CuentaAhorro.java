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
public class CuentaAhorro extends CuentaBancaria implements Identificable {

    private double tipoInteres;
    public final double MIN_TIPO_INTERES = 0.50;
    public final double MAX_TIPO_INTERES = 8.50;

    public CuentaAhorro(Persona titular, double saldo, String entidad, String oficina, String cuenta, double tipoInteres) {
        super(titular, saldo, entidad, oficina, cuenta);
        try {
            if (tipoInteres > MIN_TIPO_INTERES && tipoInteres < MAX_TIPO_INTERES) {
                this.tipoInteres = tipoInteres;
            } else {
                throw new ExcepcionPersonalizada("error... Tipo de interes invalido debe estra entre 0.5 y 8.5...");
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getMIN_TIPO_INTERES() {
        return MIN_TIPO_INTERES;
    }

    public double getMAX_TIPO_INTERES() {
        return MAX_TIPO_INTERES;
    }
    
    @Override
    public Map listaObjeto(){
        Map<String,String>matriz=new HashMap();
        matriz.putAll(super.listaObjeto());
        matriz.put("Tipo Interés: ",String.valueOf(getTipoInteres()));
        
        return matriz;
    }

}
