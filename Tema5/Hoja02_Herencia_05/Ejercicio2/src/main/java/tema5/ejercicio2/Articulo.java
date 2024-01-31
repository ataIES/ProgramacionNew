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
public class Articulo {
    private int codigo;
    private String descripcion;
    private float precio;

    public Articulo(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Articulo(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una descripción: ");
        this.descripcion=new Scanner(System.in).nextLine();
        System.out.println("Introduce un precio: ");
        this.precio=teclado.nextFloat();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String mostrar(){
        return "---ARTÍCULO---\n\tCódigo: "+codigo+"\n\tDescripción: "+descripcion+"\n\tPrecio: "+String.format("%.2f", precio);
    }
}
