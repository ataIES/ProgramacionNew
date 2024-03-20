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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.numPaginas;
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
        final LibroPapel other = (LibroPapel) obj;
        if(!this.titulo.equals(other.titulo)){
            return false;
        }
        if(!this.autor.equals(other.autor)){
            return false;
        }
        return Objects.equals(this.numPaginas, other.numPaginas);
        
    }
    

    //Metodo que muestra los datos del libroPapel
    @Override
    public String imprime() {
        return super.imprime()+"\tNúmero de Páginas: "+getNumPaginas();
    }
}
