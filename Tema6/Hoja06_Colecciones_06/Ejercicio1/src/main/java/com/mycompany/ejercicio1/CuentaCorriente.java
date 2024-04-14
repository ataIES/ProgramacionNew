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
public abstract class CuentaCorriente extends CuentaBancaria implements Identificable {
    
    private boolean siAutoriza;

    public CuentaCorriente(Persona titular, double saldo, String entidad, String oficina, String cuenta,boolean siAutoriza) {
        super(titular, saldo, entidad, oficina, cuenta);
        this.siAutoriza=siAutoriza;
    }

    public boolean isSiAutoriza() {
        return siAutoriza;
    }

    public void setSiAutoriza(boolean siAutoriza) {
        this.siAutoriza = siAutoriza;
    }
    
    @Override
    public Map listaObjeto(){
        String autoriza=siAutoriza?"Sí":"No";
        Map<String,String>matriz=new HashMap();
        matriz.putAll(super.listaObjeto());
        matriz.put("¿Autoriza?",autoriza );
        
        return matriz;
    }
    
    
}
