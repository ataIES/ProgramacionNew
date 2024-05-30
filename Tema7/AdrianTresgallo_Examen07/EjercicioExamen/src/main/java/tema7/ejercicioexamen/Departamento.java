/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicioexamen;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * Clase Departamento que implementa Identificable y Serializable
 * @author Adrián Tresgallo Arozamena DAW125
 */
public class Departamento implements Identificable,Serializable{
    
    private int id;
    private String codigo;
    private String nombre;

    /**
     * Constructor por parámetros
     * @param id
     * @param codigo
     * @param nombre 
     */
    public Departamento(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Get y Set
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodos equals y hashcode que definirá si un departamento es igual a otro por la id
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        return this.id == other.id;
    }
    

    /**
     * Metodo que muestra informacion del departamento
     * @return 
     */
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String,String>departamentos=new LinkedHashMap<>();
        
        departamentos.put("ID Departamento: ", String.valueOf(getId()));
        departamentos.put("Código Departamento: ", getCodigo());
        departamentos.put("Nombre Departamento: ", getNombre());
        departamentos.put("", "");
        
        return departamentos;
    }
    
    
}
