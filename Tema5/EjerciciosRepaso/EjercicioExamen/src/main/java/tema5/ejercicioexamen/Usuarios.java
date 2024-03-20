/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

/**
 *
 * @author atres
 */
public class Usuarios  {
    
    private String nombre;
    private String apellidos;

    //Constructor por defecto que pide los datos por teclado
    public Usuarios() {
        this.nombre = Teclado.validarString("Introduce el nombre de Usuario: ");
        this.apellidos = Teclado.validarString("Introduce los apellidos: ");
    }

    //Constructor por parámetros 
    public Usuarios(String nombre1, String apellidos1) {
        this.nombre = nombre1;
        this.apellidos = apellidos1;
    }

    //Get y set
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
     //Metodo toString para mostrar el usuario
    @Override
    public String toString() {
        return "\nUsuario: Nombre: " + getNombre() + "\nApellidos: " + getApellidos();
    }

}
