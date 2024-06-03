/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import ventanas.Departamento;
import ventanas.Profesor;
import ventanas.Solicitud;
import ventanas.TipoProfesor;

/**
 *
 * @author DAW125
 */
public class MetodosFicheros {

    public static List<Profesor> importarFicheroProfesores(File fichero) {
        List<Profesor> listaProfesor = new ArrayList<>();
        BufferedReader br = null;
        String linea = "";
        String[] listar = new String[5];
        Profesor p = null;
        try {
            br = new BufferedReader(new FileReader(fichero));
            while ((linea = br.readLine()) != null) {
                linea = br.readLine();
                listar = linea.split(",");
                String apellido = listar[0];
                String nombre = listar[1];
                String dni = listar[2];
                String mail = listar[3];
                int idDepartamento = Integer.parseInt(listar[4]);
                p = new Profesor(nombre, apellido, dni, TipoProfesor.PROFESOR, idDepartamento, mail, "1111", true);
                if (!listaProfesor.add(p)) {
                    System.out.println("Error, no se pudo añadir al profesor");
                }

            }
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
        return listaProfesor;
    }

    public static List<Departamento> importarFicheroDepartamento(File fichero) {
        List<Departamento> listaDepartamento = new ArrayList<>();
        BufferedReader br = null;
        String linea = "";
        String[] listar = new String[4];
        Departamento d = null;
        try {
            br = new BufferedReader(new FileReader(fichero));
            while ((linea = br.readLine()) != null) {
                linea = br.readLine();
                listar = linea.split(",");
                int idDepartamento = Integer.parseInt(listar[0]);
                String codDepartamento = listar[1];
                String nombre = listar[2];
                int idJefe = 1;
                d = new Departamento(idDepartamento, codDepartamento, nombre, idJefe);
                if (!listaDepartamento.add(d)) {
                    System.out.println("Error, no se pudo añadir el departamento");
                }
            }
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
        return listaDepartamento;
    }

    public static void EscribirProfesores(File fichero, List<Profesor> lista) {
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            for (Profesor c : lista) {
                fo.writeObject(c);
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
    public static void EscribirSolicitudes(File fichero, List<Solicitud> lista) {
        ObjectOutputStream fo = null;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            for (Solicitud s : lista) {
                fo.writeObject(s);
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

}
