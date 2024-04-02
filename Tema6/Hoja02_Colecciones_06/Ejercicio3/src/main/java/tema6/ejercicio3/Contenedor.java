/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author atres
 */
public class Contenedor {

    public Contenedor() {
        
    }

    //Metodo que lista el contenedor pasado por parametros
    public String listarContenedor(LinkedList<Residuo> lista) {
        String cadena = "";
        for (Residuo residuo : lista) {
            cadena += String.format("\n%s", residuo.toString());
        }
        return cadena;
    }

    
    //Metodo que alamcena un residuo
    public LinkedList<Residuo> almacenarContenedor(LinkedList<Residuo> lista) {
        Residuo residuo = null;
        residuo = new Residuo();
        lista.addLast(residuo);
        System.out.println("Residuo " + residuo.getCodigo() + " almacenado");

        return lista;
    }

    //Metodo que retira del contenedor que entra por último
    public void retirarContenedor(LinkedList<Residuo> lista) {
        Residuo residuoBorrado = null;
        try {
            residuoBorrado = lista.removeLast();
            System.out.printf("\nResiduo "+ residuoBorrado.getCodigo()+" Borrado correctamente\n%s\nTiempo que ha estado en el almacén: %s ",
                     residuoBorrado, obtenerTiempoAlmacenado(residuoBorrado));
        } catch (NoSuchElementException n) {
            System.out.println("Error, el contenedor está vacío");
        }
    }

    //Metodo que obtiene el tiempo que lleva almacenado en el contenedor
    private String obtenerTiempoAlmacenado(Residuo residuo) {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaResiduo = residuo.getFecha();
        String cadena = "";
        int dia=0,mes=0,anio=0;
        
        
        Period diffFecha = Period.between(fechaResiduo, hoy);
        
        dia=diffFecha.getYears();
        mes=diffFecha.getMonths();
        anio=diffFecha.getYears();
       

        cadena = String.format("%d años %d meses %d dias",anio, mes,dia );

        return cadena;
    }
}
