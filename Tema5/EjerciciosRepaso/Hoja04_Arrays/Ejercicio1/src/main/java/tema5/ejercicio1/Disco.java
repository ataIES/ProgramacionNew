/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class Disco extends Publicacion {

    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo1, String autor1, int dia, int mes, int anio) {
        super(titulo1, autor1, dia, mes, anio);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public String toString(){
        return "---DISCO---\n\tTitulo: "+super.getTitulo()+"\n\tAutor: "+super.getAutor()
                +"\n\tFecha: "+super.getFecha().getTime()+"\n\tDuracion en minutos: "+getDuracionMinutos();
    }
}
