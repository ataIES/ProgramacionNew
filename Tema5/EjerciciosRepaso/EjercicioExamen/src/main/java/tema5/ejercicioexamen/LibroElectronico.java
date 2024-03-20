/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

import java.util.Objects;

/**
 *
 * @author atres
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tamanoMB) ^ (Double.doubleToLongBits(this.tamanoMB) >>> 32));
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
        final LibroElectronico other = (LibroElectronico) obj;
        if (!this.titulo.equals(other.titulo)) {
            return false;
        }
        if (!this.autor.equals(other.autor)) {
            return false;
        }
        return Objects.equals(this.tamanoMB, other.tamanoMB);
    }

    //Metodo que muestra los datos del libro electronico
    @Override
    public String imprime() {
        return super.imprime() + "\tTamaño en MB: " + String.format("%.2f", getTamanoMB()) + "MB";
    }
}
