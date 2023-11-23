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
    private final double frecuenciaMax=108;
    private final double frecuenciaMin=80;

    public SintonizadorFM() {
        
    }
//Constructor con parámetros donde comprobamos el rango, si nos sale false, establecemos la frecuencia en 80
    public SintonizadorFM(double frecuencia) {
        if (comprobarRango(frecuencia) == true) {
            System.out.println("Frecuencia correcta");
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = frecuenciaMin;
        }
    }
//Constructor copia
    public SintonizadorFM(SintonizadorFM s) {
        if (comprobarRango(s.frecuencia) == true) {
            System.out.println("Frecuencia correcta");
            s.frecuencia = s.frecuencia;
        } else {
            s.frecuencia = s.frecuenciaMin;
        }
    }
//Método para subir la frecuencia, cuando sobrepase los 108, nos establezca la frecuencia en 80
    public void subir() {
        frecuencia += 0.05;
        if (frecuencia > 108) {
            frecuencia = frecuenciaMin;
        }
    }
//Método para bajar la frecuencia, cuando sea menor que 80, se nos establece la frecuencia en 108
    public void bajar() {
        frecuencia -= 0.05;
        if (frecuencia < 80) {
            frecuencia = frecuenciaMax;
        }
    }
//Método privado donde se comprueba si la frecuencia se encuentra dentro del rango 
    private boolean comprobarRango(double frecuencia) {
        boolean valido = false;
        if (frecuencia >= frecuenciaMin && frecuencia <= frecuenciaMax) {
            valido = true;
        }
        return valido;
    }
//Método para mostrar la frecuencia actual
    @Override
    public String toString() {
        return "Frecuencia actual: " + String.format("%,.2f", frecuencia) + " Hz";
    }

}
