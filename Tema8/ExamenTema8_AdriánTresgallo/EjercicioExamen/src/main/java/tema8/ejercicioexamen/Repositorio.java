/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema8.ejercicioexamen;

import java.util.List;

/**
 * Interfaz con el Patrón DAO
 * @author Adrián Tresgallo Arozamena
 * @param <T>
 */
public interface Repositorio<T> {
    
    /**
     * Metodo que lista objetos
     * @return 
     */
    public List<T>listar();
    
    /**
     * Metodo que devuelve un objeto por codigo pasado por parámetro
     * @param cadena
     * @return 
     */
    public T porCod(String cadena);
    
    /**
     * Metodo que inserta un objeto pasado por parámetro
     * @param t 
     */
    public void insertar(T t);
    
    /**
     * Metodo que modifica un valor de la BD
     * @param cadena 
     */
    public void modificar(String cadena);
    
    /**
     * Metodo que elimina un dato de la BD y devuelve un boolean
     * @param cadena
     * @return 
     */
    public boolean eliminar(String cadena);
}
