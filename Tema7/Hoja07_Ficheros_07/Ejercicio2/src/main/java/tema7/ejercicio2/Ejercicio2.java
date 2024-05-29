/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema7.ejercicio2;

import java.io.File;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero1=new File("Iniciales.dat");
        Modulo m = new Modulo("Ciencias");
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        
        m.insertarAlumno(a1);
        m.insertarAlumno(a2);
        m.insertarAlumno(a3);
        System.out.println(m.listarAlumnos());
        System.out.println("");
        m.mostrarIniciales(fichero1);
        m.leerIniciales(fichero1);
        
        
        
        
        
    }
}
