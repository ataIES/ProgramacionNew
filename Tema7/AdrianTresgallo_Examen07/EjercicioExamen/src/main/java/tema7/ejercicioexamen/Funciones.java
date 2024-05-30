/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicioexamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Adrián Tresgallo Arozamena DAW125
 */
public class Funciones {

    public static Set<Profesor> leerProfesores(File ficheroProfesor, File ficheroDepartamento) {
        Set<Profesor> listaProfesores = new LinkedHashSet<>();
        Set<Departamento> listaDepartamentos = leerDepartamento(ficheroDepartamento);
        BufferedReader br = null;
        String linea = "";
        String apellido = "";
        String nombre = "";
        String dni = "";
        String correoElectronico = "";
        Departamento d = null;
        try {
            br = new BufferedReader(new FileReader(ficheroProfesor));
            while ((linea = br.readLine()) != null) {
                String cadena[] = linea.split(",");
                apellido = cadena[0];
                nombre = cadena[1];
                dni = cadena[2];
                correoElectronico = cadena[3];
                int id = Integer.parseInt(cadena[4]);
                d = buscarDepartamento(id, ficheroDepartamento);
                if (d == null) {
                    throw new NullPointerException("Error, el departamento no existe");
                }
                Profesor p = new Profesor(apellido, nombre, dni, correoElectronico, d);
                if (!listaProfesores.add(p)) {
                    System.out.println("Error, no se pudo añadir al profesor " + nombre);
                }
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el ficheo");
            }
        }

        return listaProfesores;
    }

    public static Set<Departamento> leerDepartamento(File fichero) {
        Set<Departamento> listaDepartamentos = new LinkedHashSet<>();
        BufferedReader br = null;
        String linea = "";
        int id = 0;
        String codigo = "";
        String nombre = "";
        Departamento d;
        try {
            br = new BufferedReader(new FileReader(fichero));
            while ((linea = br.readLine()) != null) {
                String cadena[] = linea.split(",");
                id = Integer.parseInt(cadena[0]);
                codigo = cadena[1];
                nombre = cadena[2];
                d = new Departamento(id, codigo, nombre);
                if (!listaDepartamentos.add(d)) {
                    System.out.println("Error, no se pudo añadir el departamento " + nombre);
                }
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el ficheo");
            }
        }
        return listaDepartamentos;
    }

    public static void listarProfesores(Set<Profesor> lista) {
        for (Profesor p : lista) {
            for (Map.Entry<String, String> listaAux : p.datosObjeto().entrySet()) {
                System.out.println(listaAux.getKey() + listaAux.getValue());
            }
        }
        System.out.println("Número de profesores: " + lista.size());
    }

    public static void guardarProfDep(Set<Profesor> lista, String codDep) {
        int nProfesores = 0;
        File fichero = new File("ProfesoresDEP.dat");
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            Iterator<Profesor> it = lista.iterator();
            while (it.hasNext()) {
                Profesor p = it.next();
                if (p.getDepartamento().getCodigo().equalsIgnoreCase(codDep)) {
                    fo.writeObject(p);
                    nProfesores++;
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
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

    public static void leerProfDep(File fichero) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Profesor p;
            while (!fin) {
                p = (Profesor) os.readObject();
                modoFicha(p.datosObjeto());
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

    public static void insertarProfesor(Profesor p, Departamento d, File fichero) {
        BufferedWriter br = null;
        String apellido = "";
        String nombre = "";
        String dni = "";
        String correo = "";
        int idDep = 0;
        String frase;
        try {
            br = new BufferedWriter(new FileWriter(fichero, true));
            apellido = p.getApellido();
            nombre = p.getNombre();
            dni = p.getDni();
            correo = p.getCorreoElectronico();
            d = p.getDepartamento();
            idDep = d.getId();
            frase = apellido + "," + nombre + "," + dni + "," + correo + "," + idDep;
            br.write(frase);
            br.write(System.lineSeparator());
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public void guardarDepartamentos(Set<Profesor> lista) {
        Set<Departamento> listaDep = new LinkedHashSet<>();
        File fichero = new File("departamentos.txt");
        BufferedWriter br = null;
        String frase;
        try {
            br = new BufferedWriter(new FileWriter(fichero, true));
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public static void modoFicha(Map<String, String> lista) {
        for (Map.Entry<String, String> listaAux : lista.entrySet()) {
            System.out.println(listaAux.getKey() + ": " + listaAux.getValue());
        }
    }

    public static Departamento buscarDepartamento(int id, File fichero) {
        Departamento d = null;
        boolean encontrado = false;
        Set<Departamento> listaDepartamento = leerDepartamento(fichero);
        Iterator<Departamento> it = listaDepartamento.iterator();
        while (it.hasNext() || !encontrado) {
            d = it.next();
            if (d.getId() == id) {
                encontrado = true;
            }
        }
        return d;
    }

}
