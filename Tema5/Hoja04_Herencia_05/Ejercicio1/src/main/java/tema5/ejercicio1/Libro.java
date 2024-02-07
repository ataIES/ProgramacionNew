/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW125
 */
public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int numPaginas1, String titulo1, String autor1, int dia1, int mes1, int anio1) {
        super(titulo1, autor1, dia1, mes1, anio1);
        this.numPaginas = numPaginas1;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "---Libro---\n\tId: " + super.getId() + "\n\tTítulo: " + super.getTitulo() + "\n\tAutor: " + super.getAutor()
                + "\n\tFecha: " + super.getFecha().format(f) + "\n\tNúmero de páginas: " + numPaginas + "\n";
    }
}
