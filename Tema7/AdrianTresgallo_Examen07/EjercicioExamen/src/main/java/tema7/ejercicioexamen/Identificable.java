/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema7.ejercicioexamen;

import java.util.LinkedHashMap;


/**
 *
 * @author Adrian Tresgallo Arozamena DAW125
 */
public interface Identificable {
    
    /**
     * Metodo que mostrará la informacion de los objetos que implementen esta clase
     * @return LinkedHasMap mantiene el orden de insercion
     */
    public abstract LinkedHashMap<String,String>datosObjeto();
}
