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
public class CuentaCorrientePersonal extends CuentaCorriente implements Identificable {

    private double comisionMantenimiento;
    public final double MIN_COMISION_MANTENIMIENTO = 0;
    public final double MAX_COMISION_MANTENIMIENTO = 30;

    public CuentaCorrientePersonal(Persona titular, double saldo, String entidad, String oficina, String cuenta, boolean siAutoriza) {
        super(titular, saldo, entidad, oficina, cuenta, siAutoriza);
        try {
            if (comisionMantenimiento > 0 && comisionMantenimiento < 30) {
                this.comisionMantenimiento = comisionMantenimiento;
            } else {
                throw new ExcepcionPersonalizada("Error...la comision de mantenimiento esta fuera de rango 0-30");
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public double getMIN_COMISION_MANTENIMIENTO() {
        return MIN_COMISION_MANTENIMIENTO;
    }

    public double getMAX_COMISION_MANTENIMIENTO() {
        return MAX_COMISION_MANTENIMIENTO;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public Map listaOjeto() {
        Map<String, String> matriz = new HashMap();
        matriz.putAll(super.listaObjeto());
        matriz.put("comisionMantenimiento", String.valueOf(getComisionMantenimiento()));

        return matriz;
    }
}
