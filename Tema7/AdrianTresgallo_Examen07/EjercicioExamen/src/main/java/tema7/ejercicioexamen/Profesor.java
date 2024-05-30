/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicioexamen;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Objects;

/**
 * Clase Profesor que implementa Identificable y Serializable
 * @author Adrian Tresgallo Arozamena DAW125
 */
public class Profesor implements Identificable,Serializable{
    
    private String apellido;
    private String nombre;
    private String dni;
    private String correoElectronico;
    private Departamento departamento;
    
    /**
     * Constructor por parámetros
     * @param apellido
     * @param nombre
     * @param dni
     * @param correoElectronico
     * @param departamento 
     */

    public Profesor(String apellido, String nombre, String dni, String correoElectronico, Departamento departamento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
        this.departamento = departamento;
    }

    /**
     * Metodos get y Set
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Metodos equals y hashcode que un profesor es igual a otro si tienen el mismo dni
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.dni);
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
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.dni, other.dni);
    }
    

    /**
     * Metodo que muestra la información del profesor
     * @return 
     */
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String,String>profesor=new LinkedHashMap<>();
        profesor.put("Nombre del Profesor: ", getNombre());
        profesor.put("Apellidos:", getApellido());
        profesor.put("DNI: ",getDni());
        profesor.put("Correo Electrónico: ", getCorreoElectronico());
        profesor.put("Id Departamento: ", String.valueOf(getDepartamento().getId()));
        profesor.put("Código Dep: ", getDepartamento().getCodigo());
        profesor.put("Nombre Dep: ",getDepartamento().getNombre());
        profesor.put("", "");
        
        return profesor;
        
    }
    
    
}
