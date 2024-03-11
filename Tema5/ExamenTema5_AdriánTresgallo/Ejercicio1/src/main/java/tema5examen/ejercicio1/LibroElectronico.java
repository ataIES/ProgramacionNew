/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5examen.ejercicio1;

/**
 *
 * @author Adrian Tresgallo Arozamena DAW125
 */
public class LibroElectronico extends Libro {

    private double tamanoMB;

    //Constructor por defecto que pide los datos por teclado
    public LibroElectronico() {
        super();
        this.tamanoMB = Teclado.validarDouble("Introduce el tamaño del libro en MB(MegaBytes): ");
    }

    //Constructor por parámetros
    public LibroElectronico(double tamanoMB1, String titulo1, String autor1) {
        super(titulo1, autor1);
        this.tamanoMB = tamanoMB1;
    }

    //Get y set
    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(int tamanoMB) {
        this.tamanoMB = tamanoMB;
    }

    //Metodo que muestra los datos del libro electronico
    @Override
    public String imprime() {
        return super.imprime() + "\tTamaño en MB: " + String.format("%.2f", getTamanoMB()) + "MB";
    }

}
