/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author DAW125
 */
public class Pintura extends Servicio {

    private double superficie;
    private double precioPintura;

    public Pintura(double superficie, double precioPintura, String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

//Metodo que calcula el costeMaterial
    @Override
    public double costeMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

//Metodo que devuelve el coste de mano de obra
    @Override
    public double costeManoObra() {
        return (superficie / 10) * 9.5;
    }

    //Metodo que devuelve el costeTotal
    @Override
    public double costeTotal() {
        return validarSuperficie() ? costeMaterial() + costeManoObra() + getCosteAdicional() : costeMaterial() + costeManoObra();
    }

    //Metodo que devuelve un boolean que valide la superfice sea menor de 50 o no
    private boolean validarSuperficie() {
        return superficie < 50;
    }

    //Metodo que calcula el coste adicional con el 15%
    private double getCosteAdicional() {
        return validarSuperficie() ? ((costeMaterial() + costeManoObra()) * 0.15) : 0;
    }
    //Metodo que muestra los datos del servicio de pintura
    @Override
    public String detalleServicio() {
        return "TRABAJO DE PINTURA \n\tCliente: " + super.getCliente() + "\n\tFecha de Inicio: " + super.fechaFormateada()
                + "\n---------------------------------------------" + "\n\tPintor: " + super.getTrabajador()
                + "\n\tCoste Material: " + String.format("%.2f€", costeMaterial())
                + "\n\tCoste Mano de Obra: " + String.format("%.2f€", costeManoObra())
                + "\n\tCoste Adicional: " + String.format("%.2f€", getCosteAdicional())
                + "\n\tTOTAL: " + String.format("%.2f€", costeTotal())
                + "\n---------------------------------------------\n";
    }

}
