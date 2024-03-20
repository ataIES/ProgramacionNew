/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema5.ejercicioexamen;

/**
 *
 * @author atres
 */
public interface Identificable {
    
    //Metodo abstracto que imprimirá los datos de los objetos
    public abstract String imprime();
    
    //Metodo static que nos muestra la cadena Soy identificable
    public static String soyIdentificable(){
        return "Soy identificable";
    }
}
