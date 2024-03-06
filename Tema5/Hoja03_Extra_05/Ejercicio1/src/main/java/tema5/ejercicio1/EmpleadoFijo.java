/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class EmpleadoFijo extends Empleado {

    private double salarioMensual;
    
    //Constructor por parámetros
    public EmpleadoFijo(double salarioMensual, String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni, salarioMensual);
        this.salarioMensual = salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Metodo que calcula el salario
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    //Metodo que muestra los datos del empleadoFijo
    @Override
    public String toString() {
        return "---EMPLEADO FIJO--- \n\tNombre: " + super.getNombre() + "\n\tApellidos: " + super.getApellidos()
                + "\n\tDNI: " + super.getDni() + "\n\tSalario: " + String.format("%.2f€", calcularSalario());
    }
}
