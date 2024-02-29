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

    protected int hora;
    protected int minuto;

    public Hora(int hora1, int minuto1) {
        this.hora = hora1;
        this.minuto = minuto1;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

//Metodo que incrementa un minuto
    public void inc() {
        minuto++;
        if (minuto > 59) {
            minuto = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        } 
    }

//Metodo que comprueba si el valor por parámetro está dentro del rango, modifique el valor de los minutos o no
    protected boolean setMinutos(int valor) {
        boolean valido = false;
        if (Validacion.validarRangoMinutos(valor)) {
            this.minuto = valor;
            valido = true;
        }
        return valido;
    }

    //Metodo que comprueba si el valor por parámetro está dentro del rango, modifique el valor de la hora o no
    protected boolean setHora(int valor) {
        boolean valido = false;
        if (Validacion.validarRangoHora(valor)) {
            this.hora = valor;
            valido = true;
        }
        return valido;
    }

    //Metodo que formatea la hora
    @Override
    public String toString() {
        String horario = "";
        if (hora < 10 && minuto < 10) {
            horario = "0" + hora + ":0" + minuto;
        } else if (hora < 10) {
            horario = "0" + hora + ":" + minuto;
        } else if (minuto < 10) {
            horario = hora + ":0" + minuto;
        } else {
            horario = hora + ":" + minuto;
        }
        return horario;
    }

   

}
