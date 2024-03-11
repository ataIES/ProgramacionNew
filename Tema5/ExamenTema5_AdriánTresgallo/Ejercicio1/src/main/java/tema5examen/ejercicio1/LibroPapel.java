/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5examen.ejercicio1;

/**
 *
 * @author Adrian Tresgallo Arozamena DAW125
 */
public class LibroPapel extends Libro {

    private int numPaginas;

    //Constructor por defecto que pido por teclado los datos
    public LibroPapel() {
        super();
        this.numPaginas = Teclado.validarEnteros("Introduce los números de página: ");
    }

    //Constructor con parámetros 
    public LibroPapel(int numPaginas1,String titulo1,String autor1) {
        super(titulo1,autor1);
        this.numPaginas = numPaginas1;
    }
    
    //Get y Set
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //Metodo que muestra los datos del libroPapel
    @Override
    public String imprime() {
        return super.imprime()+"\tNúmero de Páginas: "+getNumPaginas();
    }
}
