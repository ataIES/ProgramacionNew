/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW125
 */
public abstract class Servicio {
    private String trabajador;
    private LocalDate fechaInicio;
    private String cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }
    
    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    //Método que formatea la fecha 
    protected String fechaFormateada(){
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaInicio.format(f);
    }
    
    public abstract double costeMaterial();
    
    public abstract double costeManoObra();
    
    public abstract double costeTotal();
    
    public abstract String detalleServicio();
    
    
    
}
