/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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

    /**
     * Metodo que inserta un alumno
     * @param a 
     */
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

    /**
     * Metodo que lista los alumnos del modulo
     * @return 
     */
    public String listarAlumnos() {
        String cadena = "";
        Collections.sort(listaAlumnos);
        for (Alumno a : listaAlumnos) {
            cadena += "\n" + a.toString();
        }
        return cadena;
    }

    /**
     * Metodo que grabar los alumnos con sus iniciales y nota en fichero Iniciales.dat
     * @param fichero 
     */
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

    /**
     * Metodo que lee el fichero Iniciales.dat
     * @param fichero 
     */
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

    /**
     * Metodo que lista los aprobados
     * @return 
     */
    public Stack<Alumno> listarAprobados() {
        Stack<Alumno> aprobados = new Stack<>();
        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if (a.getNota() >= 5) {
                if (!aprobados.add(a)) {
                    System.out.println("Error, no se pudo añadir el alumno " + a.getNombreAlumno() + " a la lista de aprobados");
                }
            }
        }
        return aprobados;
    }

    /**
     * Metodo que lista los suspensos
     * @return 
     */
    public Stack<Alumno> listarSuspensos() {
        Stack<Alumno> suspensos = new Stack<>();
        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if (a.getNota() < 5) {
                if (!suspensos.add(a)) {
                    System.out.println("Error, no se pudo añadir el alumno " + a.getNombreAlumno() + " a la lista de suspensos");
                }
            }
        }
        return suspensos;
    }

    /**
     * Metodo que graba los aprobados en un fichero de txt aprobados.txt
     * @param fichero 
     */
    public void grabarAprobados(File fichero) {
        Stack<Alumno> listaAprobados = listarAprobados();
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(fichero, true));
            for (Alumno a : listaAprobados) {
                br.write(a.toString());
                br.write(System.lineSeparator());
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }

    /**
     * Metodo que graba los suspensos en un fichero llamado suspenso.dat
     * @param fichero 
     */
    public void grabarSuspensos(File fichero) {
        Stack<Alumno> listaSuspensos = listarSuspensos();
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            for (Alumno a : listaSuspensos) {
                fo.writeObject(a);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }

    /**
     * Metodo que lee el fichero suspensos.dat
     * @param fichero 
     */
    public void leerSuspensos(File fichero) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Alumno a;
            while (!fin) {
                a = (Alumno) os.readObject();
                System.out.println(a.toString());
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("Error, no se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }

    /**
     * Metodo que graba en un fichero llamado descendente.dat ordenados en orden desc
     * @param fichero 
     */
    public void grabarAlumnoDesc(File fichero) {
        OrdenarPorNombreDesc o = new OrdenarPorNombreDesc();
        Collections.sort(listaAlumnos, o);
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            for (Alumno a : listaAlumnos) {
                fo.writeObject(a);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
    
    /**
     * Metodo que lee el fichero descendente.dat
     * @param fichero 
     */
    public void leerAlumnosDesc(File fichero){
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Alumno a;
            while (!fin) {
                a = (Alumno) os.readObject();
                System.out.println(a.toString());
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("Error, no se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
    
    /**
     * Metodo que graba el modulo en el fichero modulo.dat
     * @param fichero
     * @param m 
     */
    public void grabarModulo(File fichero,Modulo m){
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            fo.writeUTF(m.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
    
    /**
     * Metodo que lee el fichero modulo.dat
     * @param fichero 
     */
    public void leerModulo(File fichero){
          ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
           String cadena="";
            while (!fin) {
                cadena+=os.readUTF();
                System.out.println(cadena);
            }
        } catch (EOFException e) {
            fin = true;
        } catch (FileNotFoundException e) {
            System.out.println("Error, no se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }

    /**
     * metodo que muestra los datos del modulo
     * @return 
     */
    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("\n\tModulo:%s \nLista de Alumnos: %s", getNombreModulo(), listarAlumnos());
        return cadena;
    }

}
