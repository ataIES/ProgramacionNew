/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author DAW125
 */
public class MetodosFichero {

    /**
     * Metodo que escribe un objeto en un fichero
     *
     * @param fichero
     */
    public static void escribirFactura(File fichero) {
        ObjectOutputStream fo = null;
        int nFactura = 0;
        String nombreCliente = "";
        double importe = 0;
        boolean pagado = false;
        try {
            if (fichero.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStream(new FileOutputStream(fichero));
            }
            nFactura = Teclado.introEntero("Introduce el número de factura: ");
            nombreCliente = Teclado.introNombre("Introduce el nombre del cliente: ");
            importe = Teclado.introDouble("Introduce el importe: ");
            pagado = Teclado.introBoolean("¿Está Pagado?: ");
            Factura f = new Factura(nFactura, nombreCliente, importe, pagado);
            fo.writeObject(f);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error, al cerrar el fichero");
                }
            }
        }
    }

    /**
     * Metodo que lee un fichero
     *
     * @param fichero
     */
    public static void leerFacturas(File fichero) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Factura f;
            while (!fin) {
                f = (Factura) os.readObject();
                System.out.println(f.toString());
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException c) {
            System.out.println("Error, el tipo de objeto no es compatible");
        } catch (FileNotFoundException f) {
            System.out.println("No se encontró el archivo");
        } catch (IOException io) {
            System.out.println(io.getMessage());
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

    public static void eliminarFichero(File fichero) {
        try {
            if (fichero.exists()) {
                if (fichero.delete()) {
                    System.out.println("Fichero " + fichero.getName() + " borrado correctamente");
                } else {
                    throw new SecurityException("Error, no se ha podido borrar el fichero");
                }
            }
        }catch(SecurityException s){
            System.out.println(s.getMessage());
        }
    }
}
