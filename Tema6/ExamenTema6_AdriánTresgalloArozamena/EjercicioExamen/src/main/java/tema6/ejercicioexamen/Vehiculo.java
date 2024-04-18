/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicioexamen;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author DAW125
 */
/*Clase Vehículo que no se podrá crear ningún objeto de este tipo e implementará la interfaz Primable*/
public abstract class Vehiculo implements Primable, Comparable<Vehiculo>{

    private String matricula;
    private String modelo;
    private Conductor conductor;
    private static int nVehiculos;

    public Vehiculo(String matricula, String modelo, Conductor conductor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.conductor = conductor;
        nVehiculos++;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected String getModelo() {
        return modelo;
    }

    protected Conductor getConductor() {
        return conductor;
    }

    protected static int getnVehiculos() {
        return nVehiculos;
    }

    @Override
    public double calcularPrimaSeguro() {
        double primaSeguro = 0;
        final double primaBase = 500;
        LocalDate fechaCarnet = getConductor().getFechaCarnet();
        LocalDate hoy = LocalDate.now();
        int añosEntreFechas = Period.between(fechaCarnet, hoy).getYears();

        if (añosEntreFechas >= 5 && añosEntreFechas <= 15) {
            primaSeguro = primaBase - (primaBase * 0.35);
        } else {
            primaSeguro = primaBase;
        }
        return primaSeguro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    
    @Override
    public int compareTo(Vehiculo v){
        return this.matricula.compareTo(v.matricula);
    }
    
}
