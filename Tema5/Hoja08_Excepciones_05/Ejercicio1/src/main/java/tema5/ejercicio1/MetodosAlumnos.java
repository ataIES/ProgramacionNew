/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class MetodosAlumnos {

    private static int contAlumnos = 0;
//Metodo que inserta Alumnos
    public static void insertarAlumnos(Alumno[] lista) {
        if (contAlumnos < lista.length) {
            for (int i = 0; i < lista.length; i++) {
                lista[i] = new Alumno(5);
                System.out.println("Alumno " + lista[i].getNombre() + " añadido correctamente");
                contAlumnos++;
            }
        } else {
            System.out.println("Número máximo de alumnos alcanzado");
        }
    }
//Metodo mostrar todos los alumnos
    public static void mostrarAlumnos(Alumno[] lista) {
        for (int i = 0; i < contAlumnos; i++) {
            lista[i].mostrarAlumno();
        }
    }

    //Metodo que busca un alumno por su nombre
    public static void buscarAlumno(Alumno[] lista) {
        String nombre = "";
        try {
            System.out.println("Introduce el nombre del alumno a buscar: ");
            nombre = new Scanner(System.in).nextLine();
            for (int i = 0; i < contAlumnos; i++) {
                if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
                    lista[i].mostrarAlumno();
                }else{
                    throw new IndexOutOfBoundsException("Error, el alumno "+nombre+" no existe");
                }
            }
        }catch(IndexOutOfBoundsException i){
            System.err.println(i.getMessage());
        }
    }

}
