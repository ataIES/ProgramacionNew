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
        
    }

    public SintonizadorFM(double frecuencia) {
        if (comprobarRango(frecuencia) == true) {
            System.out.println("Frecuencia correcta");
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = 80;
        }
    }

    public SintonizadorFM(SintonizadorFM s) {
        if (comprobarRango(s.frecuencia) == true) {
            System.out.println("Frecuencia correcta");
            s.frecuencia = s.frecuencia;
        } else {
            s.frecuencia = 80;
        }
    }

    public void subir() {
        frecuencia += 0.05;
        if (frecuencia > 108) {
            frecuencia = 80;
        }
    }

    public void bajar() {
        frecuencia -= 0.05;
        if (frecuencia < 80) {
            frecuencia = 108;
        }
    }

    private boolean comprobarRango(double frecuencia) {
        boolean valido = false;
        if (frecuencia >= 80 && frecuencia <= 108) {
            valido = true;
        }
        return valido;
    }

    @Override
    public String toString() {
        return "Frecuencia actual: " + String.format("%,.2f", frecuencia) + " Hz";
    }

}
