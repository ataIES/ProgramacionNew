/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Articulo {

    private int codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        Scanner teclado = new Scanner(System.in);
        this.codigo = 0;
        System.out.println("Introduce una descripcion: ");
        this.descripcion = new Scanner(System.in).nextLine();
        boolean valido = false;
        do {
            System.out.println("Introduce las existencias: ");
            this.existencias = teclado.nextInt();
            if (existencias > 0) {
                valido = true;
            } else {
                System.out.println("Error, existencias negativas");
            }
        } while (!valido);

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public String mostrar() {
        return "--Articulo-- \n\tCódigo: " + getCodigo() + "\n\tDescripción: " + getDescripcion() + "\n\tExistencias: " + getExistencias();
    }
}
