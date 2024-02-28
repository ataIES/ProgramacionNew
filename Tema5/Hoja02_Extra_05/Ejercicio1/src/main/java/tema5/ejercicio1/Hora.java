/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora1, int minuto1) {
        this.hora = hora1;
        this.minuto = minuto1;
    }

    public void inc() {
        if (minuto == 59) {
            minuto = 0;
            hora++;
        } else {
            minuto++;
        }
    }

    public boolean setMinutos(int valor) {
        boolean valido = false;
        if (Validacion.validarRangoMinutos(valor)) {
            this.minuto = valor;
            valido = true;
        }
        return valido;
    }

    public boolean setHora(int valor) {
        boolean valido = false;
        if (Validacion.validarRangoHora(valor)) {
            this.hora = valor;
            valido = true;
        }
        return valido;
    }

    public String toString() {
        String horario = "";
        if (hora < 10) {
            horario = "0" + hora + ":" + minuto;
        }else if(minuto<10){
            horario=hora+":0"+minuto;
        } 
        else {
            horario = hora + ":" + minuto;
        }
        return horario;
    }

}
