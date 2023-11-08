/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Alarma {

    private float temperatura;
    private Timbre timbre;

    public Alarma(float temperatura) {
        this.temperatura = temperatura;
        timbre = Timbre.APAGADO;
    }

    public void comprueba() {
        if (temperatura > 35 || temperatura < 10) {
            timbre = Timbre.ENCENDIDO;
        }
    }

    public void normaliza() {
        temperatura = 25;
        timbre = Timbre.APAGADO;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public Timbre getTimbre() {
        return timbre;
    }
    
    public void mostrarAlarma(){
        System.out.printf("----DATOS DE ALARMA---- \n\tTemperatura actual: %.2f \n\tEstado de la Alarma: %s\n",temperatura,timbre);
    }
}
