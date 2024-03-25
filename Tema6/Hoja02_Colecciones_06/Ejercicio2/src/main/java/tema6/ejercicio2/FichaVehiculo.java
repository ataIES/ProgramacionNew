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

    //Constructor sin parámetros que pide datos por teclado
    public FichaVehiculo() {
        this.fechaEntrada = Teclado.fecha();
        this.fechaReparacion = null;
        this.fechaSalida = null;
        this.modelo = Teclado.modelo("Introduce el modelo: ");
        this.matricula = Teclado.matricula("Introduce la matrícula: ");
    }

    
    //Constructor por parámetros
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

    //Metodo que introduce una nueva fecha
    public LocalDateTime fechaMayor(LocalDateTime fecha1, String mensaje) throws ExcepcionPersonalizada {
        LocalDateTime fecha = null;
        boolean mayor = false;
        while (!mayor) {
            System.out.println(mensaje);
            fecha = Teclado.fecha();
            if (fecha.isAfter(fecha1)) {
                mayor = true;
            } else {
                throw new ExcepcionPersonalizada("Error, la fecha introducida es anterior a "+fecha1.getClass().getTypeName());
            }
        }
        return fecha;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena = String.format("\n\t---Ficha Vehiculo--- \nModelo: %s\nMatricula: %s"
                + "\nFecha de Entrada: %s\nFecha de Reparación: %s\nFecha de Salida: %s", getModelo(), getMatricula(), Teclado.formatoFecha(getFechaEntrada()),
                Teclado.formatoFecha(getFechaReparacion()), Teclado.formatoFecha(getFechaSalida()));

        return cadena;
    }
}
