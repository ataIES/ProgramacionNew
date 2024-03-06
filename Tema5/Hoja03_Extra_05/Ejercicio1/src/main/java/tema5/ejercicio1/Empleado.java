/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public abstract class Empleado {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private double salario;
    
    //Constructor por parámetros
    public Empleado(String nombre, String apellidos, String dni, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo abstracto para calcular Salario
    public abstract double calcularSalario();
    
    //Metodo abstracto para mostrar la informacion de los empleados
    public abstract String toString();
}
