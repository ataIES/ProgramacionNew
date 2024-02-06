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
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(int nAsignaturas) {
        super();
        this.asignaturas = new String[nAsignaturas];
        introducirAsignaturas();
    }

    public void introducirAsignaturas() {
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + " nota: ");
            asignaturas[i] = new Scanner(System.in).nextLine();
        }
    }

    public String mostrarAsignaturas() {
        String cadena = "";
        for (int i = 0; i < asignaturas.length; i++) {
            if (i == asignaturas.length - 1) {
                cadena += asignaturas[i].toUpperCase() + " ";
            } else {
                cadena += asignaturas[i].toUpperCase() + ", ";
            }
        }
        return cadena;
    }

    @Override
    public String mostrar() {
        return "---Profesor---\nDni: " + super.getDni() + "\nNombre: " + super.getNombre() + "\nDirección: " + super.getDireccion() + "\nAsignaturas: " + mostrarAsignaturas();
    }
}
