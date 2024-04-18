/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicioexamen;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAW125
 */
/*Clase moto que desciende de Vehiculo*/
public class Moto extends Vehiculo implements Identificable{
    
    private int cilindrada;

    public Moto(String matricula, String modelo, Conductor conductor, int cilindrada) {
        super(matricula, modelo, conductor);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override
    public double calcularPrimaSeguro(){
        double potenciaFinal = getCilindrada() * 0.25;
        double primaSeguro = 0;
        final double primaBase = 500;
        LocalDate fechaCarnet = getConductor().getFechaCarnet();
        LocalDate hoy = LocalDate.now();
        int añosEntreFechas = Period.between(fechaCarnet, hoy).getYears();

        if (añosEntreFechas >= 5 && añosEntreFechas <= 15) {
            primaSeguro = potenciaFinal * (primaBase - (primaBase * 0.35));
        } else {
            primaSeguro = potenciaFinal * primaBase;
        }
        return primaSeguro;
    }
    
    //Metodo que muestra los datos de la moto
    @Override
    public Map<String, String> datosObjeto() {
        Map<String, String> listaMoto = new HashMap();
        listaMoto.put("Prima: ", String.format("%.2f€", calcularPrimaSeguro()));
        listaMoto.put("Cilindrada: ", String.valueOf(getCilindrada())+"º");
        listaMoto.put("Modelo: ", getModelo());
        listaMoto.put("Matricula: ", getMatricula());
        listaMoto.putAll(getConductor().datosObjeto());

        return listaMoto;
    }
    
}
