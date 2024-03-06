/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    //Constructor por parámteros
    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora, String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni, horasTrabajadas*tarifaPorHora);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    //Metodo que calcula el salario
    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * getTarifaPorHora();
    }

    //Metodo que muestra los datos del empleado por horas
    @Override
    public String toString() {
        return "---EMPLEADO POR HORA--- \n\tNombre: " + super.getNombre() + "\n\tApellidos: " + super.getApellidos()
                + "\n\tDNI: " + super.getDni() + "\n\tSalario: " + String.format("%.2f€", calcularSalario())+"\n\tHoras trabajadas: "+getHorasTrabajadas()
                +"\n\tTarifa por hora: "+String.format("%.2f€", getTarifaPorHora());
    }
}
