/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

import java.time.LocalDateTime;

/**
 *
 * @author DAW125
 */
public class Cliente {
    private String nombre;
    private String tlf;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAtencion;
    
    public Cliente(){
        this.nombre=Teclado.introNombre("Introduce el nombre y el primer apellido: ");
        this.tlf=Teclado.introTlf("Introduce el teléfono: ");
        this.fechaLlegada=Teclado.fecha();
        this.fechaAtencion=null;
    }

    public Cliente(String nombre, String tlf, LocalDateTime fechaLlegada) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.fechaLlegada = fechaLlegada;
        this.fechaAtencion=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    
    public String mostrarCliente(){
        String cadena="";
        String fechaLlegada=Teclado.formatoFecha(getFechaLlegada());
        String fechaAtencion=Teclado.formatoFecha(getFechaAtencion());
        
        cadena=String.format("\nNombre: %s\nTeléfono: %s\nFecha de Llegada: "
                + "%s\nFecha de Atención: %s", getNombre(),getTlf(),fechaLlegada,fechaAtencion);
        
        return cadena;
    }
}
