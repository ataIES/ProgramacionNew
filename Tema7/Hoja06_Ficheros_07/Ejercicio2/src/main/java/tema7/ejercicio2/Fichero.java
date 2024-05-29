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

    /**
     * Metodo que inserta un objeto a un fichero
     *
     * @param fichero fichero donde se añadirá el objeto
     * @param a tipo Agenda
     */
    public static void aniadirFichero(File fichero, Agenda a) {
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

    /**
     * Metodo que lee el fichero
     *
     * @param fichero
     */
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

    /**
     * Metodo que busca una o varias personas en un fichero
     *
     * @param lista
     * @param nombre
     * @return
     */
    public static List<Agenda> buscarEnAgenda(List<Agenda> lista, String nombre) {
        List<Agenda> listaAux = new ArrayList<>();
        Iterator<Agenda> it = lista.iterator();
        while (it.hasNext()) {
            Agenda a = it.next();
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                if (!listaAux.add(a)) {
                    System.out.println("Error, no se pudo añadir");
                }
            }
        }
        if (listaAux.isEmpty()) {
            System.out.println("Error, no existe ningún " + nombre + " en la agenda");
        }
        return listaAux;
    }

    /**
     * Metodo que elimina una o varias personas
     *
     * @param fichero
     * @param lista
     * @param nombre
     * @return
     */
    public static boolean eliminarPersonaAgenda(File fichero, List<Agenda> lista, String nombre) {
        int op = 0;
        List<Agenda> listaAux = buscarEnAgenda(lista, nombre);
        int tlf = 0;
        Agenda a = null;
        boolean eliminado = false;
        try {
            if (!listaAux.isEmpty()) {
                listar(listaAux);
                tlf = Integer.parseInt(Teclado.introTelefono("Introduce el número de teléfono de la persona a borrar: "));
                Iterator<Agenda> it = listaAux.iterator();
                while (it.hasNext()) {
                    a = it.next();
                    if (a.getTlf() == tlf) {
                        it.remove();
                    }
                }
                if (fichero.delete()) {
                    aniadirFichero(fichero, a);
                    eliminado = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, no se eliminó el fichero ");
                }

            } else {
                throw new NullPointerException("Error, el fichero está vacío");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
        return eliminado;
    }

    /**
     * Metodo que añade los datos de un fichero a una lista
     *
     * @param fichero
     * @return
     */
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

    public static void eliminarFichero(File fichero) {
        if (fichero.delete()) {
            System.out.println("Fichero " + fichero.getName() + " elimiando correctamente");      
        } else {
            System.out.println("Error, no se pudo eliminar el fichero");
        }
    }

    /**
     * Metodo que recorre una lista
     *
     * @param lista
     */
    public static void listar(List<Agenda> lista) {
        for (Agenda a : lista) {
            System.out.println(a.toString());
        }
    }

}
