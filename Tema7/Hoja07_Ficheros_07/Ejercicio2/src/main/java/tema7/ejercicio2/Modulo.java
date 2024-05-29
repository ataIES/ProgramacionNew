/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author DAW125
 */
public class Modulo {

    private String nombreModulo;
    private Stack<Alumno> listaAlumnos;
    public static int contAlumnos;

    public Modulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.listaAlumnos = new Stack<>();
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public Stack<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Stack<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public static int getContAlumnos() {
        return contAlumnos;
    }

    public static void setContAlumnos(int contAlumnos) {
        Modulo.contAlumnos = contAlumnos;
    }

    public void insertarAlumno(Alumno a) {
        try {
            if (listaAlumnos.add(a)) {
                System.out.println("Se ha añadido al alumno " + a.getNombreAlumno());
            } else {
                throw new Exception("Error, no se puede añadir el alumno " + a.getNombreAlumno());
            }
        } catch (Exception ar) {
            System.out.println(ar.getMessage());
        }
    }

    public String listarAlumnos() {
        String cadena = "";
        Collections.sort(listaAlumnos);
        for (Alumno a : listaAlumnos) {
            cadena += "\n" + a.toString();
        }
        return cadena;
    }

    public void mostrarIniciales(File fichero) {
        String cadena = "";
        ObjectOutputStream fo = null;
        Collections.sort(listaAlumnos);
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            for (Alumno a : listaAlumnos) {
                cadena += "\n" + a.getNombreAlumno().substring(0, 1) + " Nota: " + a.getNota();
            }
            fo.writeUTF(cadena);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException io) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public void leerIniciales(File fichero) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            String a = "";
            while (!fin) {
                a = os.readUTF();
                System.out.println(a);
            }
        } catch (EOFException e) {
            fin = true;
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero");
                }
            }
        }
    }
    
    public Stack<Alumno>listarAprobados(){
        Stack<Alumno>aprobados=new Stack<>();
        Iterator<Alumno>it=listaAlumnos.iterator();
        while(it.hasNext()){
            Alumno a=it.next();
            if(a.getNota()>=5){
                aprobados.add(a);
            }
        }
        return aprobados;
    }
    
      public Stack<Alumno>listarSuspensos(){
        Stack<Alumno>suspensos=new Stack<>();
        Iterator<Alumno>it=listaAlumnos.iterator();
        while(it.hasNext()){
            Alumno a=it.next();
            if(a.getNota()<5){
                suspensos.add(a);
            }
        }
        return suspensos;
    }
   
    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("\n\tModulo:%s \nLista de Alumnos: %s", getNombreModulo(), listarAlumnos());
        return cadena;
    }

}
