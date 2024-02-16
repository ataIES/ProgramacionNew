/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public interface Series {

    int inicio = 0;

    public int getSiguiente();

    public void reiniciar();

    public void setComenzar(int x);
    
    public default void mostrarInicio(){
        System.out.println("Valor de inicio: "+inicio);
    }
    public static String nombreInterfaz(){
        return "Interfaz series";
    }
}
