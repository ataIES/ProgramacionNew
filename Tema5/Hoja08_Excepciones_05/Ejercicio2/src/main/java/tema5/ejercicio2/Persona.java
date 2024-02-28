/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;


/**
 *
 * @author DAW125
 */
public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;
    
    public Persona(){
        this.nombre=Validacion.validarNombre("Introduce su nombre: ");
        this.edad=Validacion.validarEdad("Introduce su edad: ");
        this.estadoCivil=Validacion.validarEstadoCivil("Introduce su estado civil: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String mostrarPersona(){
        return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nEstado Civil: "+getEstadoCivil();
    }
}
