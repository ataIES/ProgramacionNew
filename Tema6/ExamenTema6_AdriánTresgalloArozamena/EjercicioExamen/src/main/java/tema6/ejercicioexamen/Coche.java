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
/*Clase Coche que desciende de Vehiculo*/
public class Coche extends Vehiculo implements Identificable {

    private int potencia;

    public Coche(String matricula, String modelo, Conductor conductor, int potencia) {
        super(matricula, modelo, conductor);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    //Metodo que calcula la prima anual añadiendo la potencia * 0.10
    @Override
    public double calcularPrimaSeguro() {
        double potenciaFinal = potencia * 0.10;
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

    //Metodo que muestra los datos del coche
    @Override
    public Map<String, String> datosObjeto() {
        Map<String, String> listaCoche = new HashMap();
        listaCoche.put("Prima: ", String.format("%.2f€", calcularPrimaSeguro()));
        listaCoche.put("Potencia: ", String.valueOf(getPotencia()) + "W");
        listaCoche.put("Modelo: ", getModelo());
        listaCoche.put("Matricula: ", getMatricula());
        listaCoche.putAll(getConductor().datosObjeto());

        return listaCoche;
    }

}
