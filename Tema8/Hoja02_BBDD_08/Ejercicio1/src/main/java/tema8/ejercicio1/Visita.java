/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.time.LocalDate;

/**
 * Clase Visita
 * @author DAW125
 */
public class Visita {
    private int id;
    private Paciente paciente;
    private LocalDate fecha;
    private Tratamientos tratamiento;
    private String observaciones;

    /**
     * Constructor que pasa todos los parámetros
     * @param id
     * @param paciente
     * @param fecha
     * @param tratamiento
     * @param observaciones 
     */
    public Visita(int id, Paciente paciente, LocalDate fecha, Tratamientos tratamiento, String observaciones) {
        this.id = id;
        this.paciente = paciente;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    /**
     * Constructor que pasa por parámetros todos los datos menos id
     * @param paciente
     * @param fecha
     * @param tratamiento
     * @param observaciones 
     */
    public Visita(Paciente paciente, LocalDate fecha, Tratamientos tratamiento, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    /**
     * Metodos Get y Set
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Tratamientos getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamientos tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Metodo que muestra una visita
     * @return 
     */
    @Override
    public String toString() {
        return "Visita{" + "id=" + id + ", paciente=" + paciente.toString() + ", fecha=" + fecha + ", tratamiento=" + tratamiento + ", observaciones=" + observaciones + '}';
    }  
}
