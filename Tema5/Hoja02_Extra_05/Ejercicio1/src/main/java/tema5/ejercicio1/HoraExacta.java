/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class HoraExacta extends Hora {

    private int segundo;

    public HoraExacta(int hora1, int minuto1, int segundo1) {
        super(hora1, minuto1);
        this.segundo = segundo1;
    }

    //Metodo que comprueba si el valor por parámetro está dentro del rango, modifique el valor de los segundos o no
    public boolean setSegundos(int valor) {
        boolean valido = false;
        if (Validacion.validarRangoSegundos(valor)) {
            this.segundo = valor;
            valido = true;
        }
        return valido;
    }

    //Metodo que aumenta 1 segundo
    @Override
    public void inc() {
        int hora = super.getHora();
        int minuto = super.getMinuto();
        segundo++;
        if (segundo > 59) {
            segundo = 0;
            minuto++;
            hora++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
                if (hora > 23) {
                    hora = 0;
                }
            }
        }
    }

    //Metodo que muestra la horaExacta
    @Override
    public String toString() {
        String horario = "";
        int hora = super.getHora();
        int minuto = super.getMinuto();
        if (hora < 10 && minuto < 10 && segundo < 10) {
            horario = super.toString() + ":0" + segundo;
        } else if (hora < 10 && segundo < 10) {
            horario = super.toString() + ":0" + segundo;
        } else if (minuto < 10 && segundo < 10) {
            horario = super.toString() + ":0" + segundo;
        } else if (segundo < 10) {
            horario = super.toString() + ":0" + segundo;
        } else {
            horario = super.toString() + ":" + segundo;
        }
        return horario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.segundo;
        hash = 23 * hash + this.minuto;
        hash = 23 * hash + this.segundo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoraExacta other = (HoraExacta) obj;
        if (this.hora != other.hora) {
            return false;
        } else if (this.minuto != other.minuto) {
            return false;
        }
        return this.segundo == other.segundo;
    }

}
