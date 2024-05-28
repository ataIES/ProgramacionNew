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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author atres
 */
public class Fichero {

    public static void aniadirFichero(File fichero,Agenda a) {
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            fo.writeObject(a);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero");
                }
            }
        }
    }

    public static void leerFichero(File fichero) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Agenda agenda;
            while (!fin) {
                agenda = (Agenda) os.readObject();
                System.out.println(agenda.toString());
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
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

    public static List<Agenda> buscarEnAgenda(List<Agenda> lista, String nombre) {
        List<Agenda> listaAux = new ArrayList<>();
        Iterator<Agenda> it = lista.iterator();
        boolean noEncontrado = false;
        while (it.hasNext()) {
            Agenda a = it.next();
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                if (listaAux.add(a)) {
                    System.out.println(a.toString());
                    noEncontrado = false;
                }
            } else {
                noEncontrado = true;
            }
        }
        if (noEncontrado) {
            System.out.println("Error, no existe ningún " + nombre + " en la agenda");
        }
        return listaAux;
    }

    public static boolean eliminarPersonaAgenda(File fichero, List<Agenda> lista, String nombre) {
        List<Agenda> listaSinBorrar = buscarEnAgenda(lista, nombre);
        int op = 0;
        try {
            if (!listaSinBorrar.isEmpty()) {
                if (listaSinBorrar.size() == 1) {
                    fichero.delete();
                    listaSinBorrar.get
                    
                }
            }
        }

    }

    public static List<Agenda> aniadirLista(File fichero) {
        List<Agenda> listaAux = new ArrayList<>();
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Agenda agenda;
            while (!fin) {
                agenda = (Agenda) os.readObject();
                if (!listaAux.add(agenda)) {
                    System.out.println("Error, no se pudo añadir " + agenda.getNombre());
                }
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero");
                }
            }
        }
        return listaAux;
    }

    public List<Agenda> buscarPorNombre(List<Agenda> lista, String nombre) {
        List<Agenda> listaAux = null;
        Iterator<Agenda> it = lista.iterator();
        while (it.hasNext()) {
            Agenda agenda = it.next();
            if (agenda.getNombre().equalsIgnoreCase(nombre)) {
                if (!listaAux.add(agenda)) {
                    System.out.println("No se pudo añadir a la persona por nombre " + nombre);
                }
            }
        }
        return listaAux;
    }

    public static void listar(List<Agenda> lista) {
        for (Agenda a : lista) {
            System.out.println(a.toString());
        }
    }

}
