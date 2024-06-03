/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author DAW125
 */
public class Departamento {
    
    private int idDepartamento;
    private String codDepartamento;
    private String nombre;
    private int idJefe;

    public Departamento(int idDepartamento, String codDepartamento, String nombre, int idJefe) {
        this.idDepartamento = idDepartamento;
        this.codDepartamento = codDepartamento;
        this.nombre = nombre;
        this.idJefe = idJefe;
    }

    public Departamento(String codDepartamento, String nombre, int idJefe) {
        this.codDepartamento = codDepartamento;
        this.nombre = nombre;
        this.idJefe = idJefe;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", codDepartamento=" + codDepartamento + ", nombre=" + nombre + ", idJefe=" + idJefe + '}';
    }
    
    
}
