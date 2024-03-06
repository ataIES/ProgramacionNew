/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.Arrays;

/**
 *
 * @author DAW125
 * @param <T>
 */
public class Contenedor<T> {

    private T[] array;

    public Contenedor(T[] objeto) {
        this.array = objeto;
    }

    //Metodo que inserta al principio
    public void insertarAlPrincipio(T nuevo) {
        array = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = nuevo;
    }
    
    //Metodo que inserta al final
    public void insertarAlFinal(T nuevo) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = nuevo;
    }
    
    //Metodo que extrae el primero
    public T extraerDelPrincipio() {
        T result = array[0];
        if (array.length > 0) {
            array[0] = null;
            array = Arrays.copyOfRange(array, 1, array.length);
        }

        return result;
    }
    
    //Metodo que ordena el array
    public void ordenar() {
        Arrays.sort(array);
    }

   

    @Override
    public String toString() {
        String cadena = "";
        for (T mostrar : array) {
            if (mostrar != null) {
                cadena += mostrar + " ";
            }
        }
        return cadena;
    }

}
