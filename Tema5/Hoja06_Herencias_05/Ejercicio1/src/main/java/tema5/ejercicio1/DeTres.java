/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class DeTres implements Series {
    private int valor;
    
    public DeTres(){
        this.valor=Series.inicio;
    }

    @Override
    public int getSiguiente() {
        return valor+=3;
    }

    @Override
    public void reiniciar() {
        this.valor=Series.inicio;
    }

    @Override
    public void setComenzar(int x) {
        this.valor=x;
    }
    
}
