/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldo;

    public Empleado() {
        this.nombre="";
        this.apellido="";
        this.sueldo=0;
    }

    public Empleado(String nombre1, String apellido1, double sueldo1) {
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.sueldo = sueldo1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public String mostrarEmpleado(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nSueldo: "+String.format("%.2f",sueldo);
    }
    
    
}
