/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public abstract class Persona {
    private String dni;
    private String nombre;
    private String direccion;
    
    public Persona(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce su dni: ");
        this.dni=new Scanner(System.in).nextLine();
        System.out.println("Introduce su nombre: ");
        this.nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce su dirección: ");
        this.direccion=new Scanner(System.in).nextLine();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public abstract String mostrar();
}
