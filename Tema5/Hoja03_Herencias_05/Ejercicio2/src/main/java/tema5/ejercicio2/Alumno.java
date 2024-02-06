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
public class Alumno extends Persona {

    private int[] notas;

    public Alumno(int nNotas) {
        super();
        this.notas = new int[nNotas];
        introducirNotas();
    }

    public void introducirNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + " nota: ");
            notas[i] = new Scanner(System.in).nextInt();
        }
    }

    public int media() {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    @Override
    public String mostrar() {
        return "---Alumno---\nDni: "+super.getDni()+"\nDirección: "+super.getDireccion()+"\nNombre: "+super.getNombre()+"\nNota Media: "+media();
    }
}
