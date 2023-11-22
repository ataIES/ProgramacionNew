/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio3;

/**
 *
 * @author daw1
 */
public class SintonizadorFM {

    private double frecuencia;

    public SintonizadorFM() {
        this.frecuencia = 80;
    }

    public SintonizadorFM(double frecuencia) {
        this.frecuencia = comprobarRango(frecuencia);
    }
    public SintonizadorFM(SintonizadorFM s){
        this.frecuencia=s.frecuencia;
    }

    private double comprobarRango(double frecuencia) {
        double nFrecuencia = 0;
        if (frecuencia < 80) {
            nFrecuencia = 108;
        } else if (frecuencia > 108) {
            nFrecuencia = 80;
        } else if (frecuencia > 80 && frecuencia < 108) {
            nFrecuencia = frecuencia;
        }
        return nFrecuencia;
    }

    public void subir() {
        frecuencia += 0.5;
    }

    public void bajar() {
        frecuencia -= 0.5;
    }

    public double mostrarFrecuencia() {
        return frecuencia;
    }
    
}
