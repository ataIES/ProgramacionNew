/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class DeDos implements Series {
    private int valor;
    private int anterior;
    
    public DeDos(){
        this.valor=Series.inicio;
        this.anterior=Series.inicio-2;
    }
    @Override
    public int getSiguiente(){
        this.anterior=valor;
        return valor+=2;
    }
    @Override
    public void reiniciar(){
        this.valor=Series.inicio;
        this.anterior=inicio-2;
    }
    @Override
    public void setComenzar(int nValor){
        this.valor=nValor;
        anterior=nValor-2;
    }

    public int getAnterior() {
        return anterior;
    }
    
}
