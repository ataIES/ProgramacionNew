/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Encargado extends Empleado{

    public Encargado() {
        super();
    }

    public Encargado(String nombre2, String apellido2, double sueldo2) {
        super(nombre2, apellido2, sueldo2);
    }

    @Override
    public double getSueldo() {
        return sueldo+(sueldo*0.10);
    }
    
    @Override
    public String mostrarEmpleado(){
        return "---Encargado--- \nNombre: "+super.nombre+"\nApellido: "+super.apellido+"\nSueldo: "+String.format("%.2f", getSueldo())+"€";
    }
    
    
    
}
