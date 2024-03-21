/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class FichaVehiculo {
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaReparacion;
    private LocalDateTime fechaSalida;
    private String modelo;
    private String matricula;
    
    public FichaVehiculo(){
       this.fechaEntrada=Teclado.fecha();
       this.fechaReparacion=null;
       this.fechaSalida=null;
       this.modelo=Teclado.modelo("Introduce el modelo: ");
       this.matricula=new Scanner(System.in).nextLine();
    }

    public FichaVehiculo(LocalDateTime fechaEntrada, LocalDateTime fechaReparacion, LocalDateTime fechaSalida, String modelo, String matricula) {
        this.fechaEntrada = fechaEntrada;
        this.fechaReparacion = fechaReparacion;
        this.fechaSalida = fechaSalida;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
        String cadena="";
        
        cadena=String.format("\n\t---Ficha Vehiculo--- \nModelo: %s\nMatricula: %s"
                + "\nFecha de Entrada: %s",getModelo(),getMatricula());
    }
}
