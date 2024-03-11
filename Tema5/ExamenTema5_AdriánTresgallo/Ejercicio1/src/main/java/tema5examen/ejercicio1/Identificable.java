/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema5examen.ejercicio1;

/**
 *
 * @author Adrián Tresgallo Arozamena DAW125
 */
public interface Identificable {
    
    //Metodo abstracto que imprimirá los datos de los objetos
    public abstract String imprime();
    
    //Metodo static que nos muestra la cadena Soy identificable
    public static String soyIdentificable(){
        return "Soy identificable";
    }
}
