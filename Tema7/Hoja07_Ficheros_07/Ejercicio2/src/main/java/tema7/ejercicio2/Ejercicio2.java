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
        File fichero2=new File("Aprobados.txt");
        File fichero3=new File("Suspensos.dat");
        File fichero4=new File("Descendente.dat");
        File fichero5=new File("Modulo.dat");
        Modulo m = new Modulo("Ciencias");
        
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        Alumno a4=new Alumno();
        
        m.insertarAlumno(a1);
        m.insertarAlumno(a2);
        m.insertarAlumno(a3);
        m.insertarAlumno(a4);


        System.out.println(m.listarAlumnos());
        System.out.println("");
        m.mostrarIniciales(fichero1);
        System.out.println("---Leer fichero iniciales.dat---");
        m.leerIniciales(fichero1);
        System.out.println("");
        m.grabarAprobados(fichero2);
        m.grabarSuspensos(fichero3);
        System.out.println("---Leer Suspensos.dat---");
        m.leerSuspensos(fichero3);
        m.grabarAlumnoDesc(fichero4);
        System.out.println("");
        System.out.println("---Mostrar alumnos descendente---");
        m.leerAlumnosDesc(fichero4);
        System.out.println("");
        m.grabarModulo(fichero5,m);
        m.leerModulo(fichero5);
        
        
        
        
    }
}
