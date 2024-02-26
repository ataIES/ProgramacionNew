/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno[]listaAlumnos=new Alumno[4];
        System.out.println("---Insertar alumnos--");
        MetodosAlumnos.insertarAlumnos(listaAlumnos);
        System.out.println("");
        System.out.println("---Mostrar alumnos---");
        MetodosAlumnos.mostrarAlumnos(listaAlumnos);
        System.out.println("--Buscar un alumno---");
        MetodosAlumnos.buscarAlumno(listaAlumnos); 
    }
}
