/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicioexamen;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
/*Clase Conductor que no se podrá heredar de ella*/
public class Conductor implements Identificable, Comparable<Conductor> {

    private String nombre;
    private LocalDate fechaCarnet;

    public Conductor(String nombre, LocalDate fechaCarnet) {
        this.nombre = nombre;
        this.fechaCarnet = fechaCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCarnet() {
        return fechaCarnet;
    }

    //Metodo para mostrar datos del conductor
    @Override
    public Map<String, String> datosObjeto() {
        Map<String, String> listaConductor = new HashMap<>();
        String fecha = MetodosEstaticos.formatoFecha(getFechaCarnet());
        listaConductor.put("Fecha carnet ", fecha);
        listaConductor.put("Nombre Conductor: ", getNombre());

        return listaConductor;
    }

    @Override
    public int compareTo(Conductor o) {
        return this.fechaCarnet.compareTo(o.fechaCarnet);
    }
    

}
