/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;
    
    public Persona(){
        System.out.println("Introduce su nombre: ");
        this.nombre=new Scanner(System.in).nextLine();
        this.edad=Validacion.validarEdad("Introduce su edad: ");
        this.estadoCivil=Validacion.validarEstadoCivil("Introduce su estado civil: ");
    }
    public String mostrarPersona(){
        return""
    }
}
