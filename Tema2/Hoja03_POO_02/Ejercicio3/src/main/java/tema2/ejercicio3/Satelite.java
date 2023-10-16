/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio3;

/**
 *
 * @author daw1
 */
public class Satelite {

    private int meridiano, paralelo, distancia_tierra;

    public Satelite() {
        meridiano = 0;
        paralelo = 0;
        distancia_tierra = 0;
    }

    public Satelite(int valor_meridiano, int valor_paralelo, int valor_distancia) {
        this.meridiano = valor_meridiano;
        this.paralelo = valor_paralelo;
        this.distancia_tierra = valor_distancia;
    }

    public void printPosicion() {
        System.out.println("----Posición del Satélite----\nMeridiano: " + meridiano + "\nParalelo: " + paralelo
                + "\nDistancia de la tierra: " + distancia_tierra);
    }

    public void variarAltura(int distancia) {
        this.distancia_tierra = distancia;
    }

    public void variarPosicion(int nuevo_meridiano, int nuevo_paralelo) {
        this.meridiano = nuevo_meridiano;
        this.paralelo = nuevo_paralelo;
    }

    public boolean enOrbita() {
        return distancia_tierra > 16000;
    }

}
