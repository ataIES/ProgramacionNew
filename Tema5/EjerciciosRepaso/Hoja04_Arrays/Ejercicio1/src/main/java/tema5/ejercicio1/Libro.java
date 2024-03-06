/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(int numPaginas, String titulo1, String autor1, int dia, int mes, int anio) {
        super(titulo1, autor1, dia, mes, anio);
        this.numPaginas = numPaginas;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
   
    @Override
    public String toString(){
        return "---LIBRO---\n\tTitulo: "+super.getTitulo()+"\n\tAutor: "+super.getAutor()
                +"\n\tFecha: "+super.getFecha().getTime()+"\n\tNúmero de páginas: "+getNumPaginas();
    }
    
    
}
