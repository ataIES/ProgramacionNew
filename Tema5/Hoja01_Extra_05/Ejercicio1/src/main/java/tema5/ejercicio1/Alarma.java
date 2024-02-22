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
public class Alarma extends Servicio {

    private int numAlarmas;

    //Constructor que inicializa el trabajador a Revisor Especialista Humos
    public Alarma(int numAlarmas, LocalDate fechaInicio, String cliente) {
        super("Revisor Especialista Humos", fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }

    public int getNumAlarmas() {
        return numAlarmas;
    }

    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }

    //El coste material será 0 , no se utilzará
    @Override
    public double costeMaterial() {
        return 0;
    }
    
    //Metodo que calcula el coste de mano de obra
    @Override
    public double costeManoObra() {
        return (numAlarmas / 3) * 40;
    }
    //Metodo que calcula el coste total
    @Override
    public double costeTotal() {
        return costeManoObra();
    }
    
    //Metodo que muestra el servicio de alarmas
    @Override
    public String detalleServicio() {
        return "REVISIÓN PERIÓDICA HUMOS \n\tCliente: "+super.getCliente()+"\n\tFecha Revisión: "+super.fechaFormateada()
                +"\n---------------------------------------------\n\tTOTAL: "+String.format("%.2f€\n", costeTotal());
    }

}
