/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema8.ejercicioexamen;

import java.util.List;

/**
 *
 * @author atres
 * @param <T>
 */
public interface Repositorio<T> {
        // método para listar todos los objetos T
    // para listar todos los registros de una tabla
    public List<T> listar();
    // método para recuperar un objeto por su ID
    // nos recupera un registro de la base de datos por clave primaria
    public T porId( int id);
    // método para borrar un objeto por su ID
    // nos permite borrar un registro de la base de datos por clave primaria
    public void eliminar( int  id);
    
    //Metodo para insertar datos a una tabla
    public void insertar(T t);
    
    //Metodo para actualizar datos de una tabla;
    public void actualizar(T t);
}
