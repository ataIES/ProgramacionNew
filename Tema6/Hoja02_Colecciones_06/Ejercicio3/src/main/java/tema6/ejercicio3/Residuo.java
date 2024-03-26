/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author atres
 */
public class Residuo {
    
    private String codigo;
    private String origen;
    private LocalDate fecha;
    
    public Residuo(){
        this.codigo=Teclado.introducirCodigo("Introduce el código del residuo: ");
        this.origen=Teclado.introducirOrigen("Introduce el origen: ");
        this.fecha=Teclado.fecha();
    }

    public Residuo(String codigo, String origen, LocalDate fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Residuo{" + "codigo=" + codigo + ", origen=" + origen + ", fecha=" + Teclado.formatoFecha(fecha) + '}';
    }
    
    
}
