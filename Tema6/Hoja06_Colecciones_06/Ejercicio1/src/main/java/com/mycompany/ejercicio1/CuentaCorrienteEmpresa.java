/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author atres
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    public final double MAX_DESCUBIERTO = 50000;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String entidad, String oficina, String cuenta, boolean siAutoriza) {
        super(titular, saldo, entidad, oficina, cuenta, siAutoriza);
    }
    

    public double getMAX_DESCUBIERTO() {
        return MAX_DESCUBIERTO;
    }


    @Override
    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        } else if (cantidad + saldo <= MAX_DESCUBIERTO) {
            System.out.println("No puedes tener una saldo descubierto mayor a 50000");
        } else {
            saldo += cantidad;
            System.out.println("Ingreso realizado correctamente.");
            System.out.println("Saldo actual: " + saldo);
        }
    }
}
