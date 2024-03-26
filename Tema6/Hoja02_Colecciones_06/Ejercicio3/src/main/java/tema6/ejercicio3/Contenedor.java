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

    public String listarContenedor(LinkedList<Residuo> lista) {
        String cadena = "";
        for (Residuo residuo : lista) {
            System.out.printf("\n\t...Contendedor...");
            cadena += String.format("\n%s", residuo.toString());
        }
        return cadena;
    }

    public LinkedList<Residuo> almacenarContenedor(LinkedList<Residuo> lista) {
        Residuo residuo = null;
        residuo = new Residuo();
        lista.addLast(residuo);
        System.out.println("Residuo " + residuo.getCodigo() + "almacenado");

        return lista;
    }

    public void retirarContenedor(LinkedList<Residuo> lista) {
        Residuo residuoBorrado = null;
        try {
            residuoBorrado = lista.removeLast();
            System.out.printf("\nResiduo Borrado correctamente\n%s\nTiempo que ha estado en el almacén: %s ",
                     residuoBorrado, obtenerTiempoAlmacenado(residuoBorrado));
        } catch (NoSuchElementException n) {
            System.out.println("Error, el contenedor está vacío");
        }
    }

    private String obtenerTiempoAlmacenado(Residuo residuo) {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaResiduo = residuo.getFecha();
        String cadena = "";

        int diffDia = Period.between(fechaResiduo, hoy).getDays();
        int diffMes = Period.between(fechaResiduo, hoy).getMonths();
        int diffAnio = Period.between(fechaResiduo, hoy).getYears();

        cadena = String.format("%d años %d meses %d dias", diffAnio, diffMes, diffAnio);

        return cadena;
    }
}
