/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author atres
 */
public class Taller {

    private Queue<FichaVehiculo> enEspera;
    private Queue<FichaVehiculo> reparados;
    private Queue<FichaVehiculo> finalizados;

    //Constructor por defecto
    public Taller() {
        enEspera = new LinkedList<>();
        reparados = new LinkedList<>();
        finalizados = new LinkedList<>();
    }

    //Metodo que inserta un vehiculo a la lista enEspera
    public void insertarVehiculo() {
        FichaVehiculo vehiculo = new FichaVehiculo();
        String matricula = vehiculo.getMatricula();
        if (enEspera.add(vehiculo)) {
            System.out.println("Vehiculo " + matricula + " añadido correctamente");
        } else {
            System.out.println("Error, no se pudo añadir el vehiculo " + matricula);
        }
    }

    //Metodo que reparar un vehiculo y elimina de la lista enEspera
    public void repararVehiculo(String matricula) {
        FichaVehiculo vehiculo = buscarVehiculo(matricula, enEspera);
        LocalDateTime fechaReparado = null;
        try {
            if (vehiculo != null) {
                fechaReparado = vehiculo.fechaMayor(vehiculo.getFechaEntrada(), "Introduciendo al fecha de reparación...");
                if (reparados.add(vehiculo)) {
                    vehiculo.setFechaReparacion(fechaReparado);
                    eliminarVehiculo(vehiculo, enEspera);
                    System.out.println("Vehiculo " + matricula + " reparadp");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo añadir el vehiculo " + matricula);
                }
            } else {
                throw new NullPointerException("Error, no existe el vehiculo " + matricula);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Metodo que da salida un vehiculo y elimina de la lista reparados
    public void darSalidaVehiculo(String matricula) {
        FichaVehiculo vehiculo = buscarVehiculo(matricula, reparados);
        LocalDateTime fechaSalida = null;
        try {
            if (vehiculo != null) {
                fechaSalida = vehiculo.fechaMayor(vehiculo.getFechaReparacion(), "Introduciendo al fecha de salida...");
                if (finalizados.add(vehiculo)) {
                    vehiculo.setFechaSalida(fechaSalida);
                    eliminarVehiculo(vehiculo, reparados);
                    System.out.println("Vehiculo "+matricula+" finalizado");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo añadir el vehiculo " + matricula);
                }
            } else {
                throw new NullPointerException("Error, no existe el vehiculo " + matricula);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Metodos que muestra el taller
    public String mostrarEstado() {
        String cadena = "";

        cadena = String.format("\n\t---Taller---\nEN ESPERA%s \nREPARADOS%s \nFINALIZADOS%s",
                mostrarEnEspera(), mostrarReparados(), mostrarFinalizados());

        return cadena;
    }

    //Metodo que muestra la lista enEspera
    private String mostrarEnEspera() {
        String cadena = "";
        for (FichaVehiculo vehiculo : enEspera) {
            cadena += vehiculo.toString();
        }
        return cadena;
    }

    //Metodo que muestra la lista reparados
    private String mostrarReparados() {
        String cadena = "";
        for (FichaVehiculo vehiculo : reparados) {
            cadena += vehiculo.toString();
        }
        return cadena;
    }

    //Metodo que muestra la lista finalizados
    private String mostrarFinalizados() {
        String cadena = "";
        for (FichaVehiculo vehiculo : finalizados) {
            cadena += vehiculo.toString();
        }
        return cadena;
    }

    //Metodo que elimina un vehiculo en una lista
    private void eliminarVehiculo(FichaVehiculo vehiculo, Queue<FichaVehiculo> lista) throws ExcepcionPersonalizada {
        String matricula = vehiculo.getMatricula();
        boolean borrado = false;
        if (lista.remove(vehiculo)) {
            borrado = true;
        }

        if (!borrado) {
            throw new ExcepcionPersonalizada("Error, no se pudo borrar el vehiculo " + matricula);
        }
    }

//Metodo que busca un vehiculo en una lista
    private FichaVehiculo buscarVehiculo(String matricula, Queue<FichaVehiculo> lista) {
        FichaVehiculo vehiculo = null;
        boolean encontrado = false;
        for (FichaVehiculo f : lista) {
            if (f.getMatricula().equalsIgnoreCase(matricula) && !encontrado) {
                encontrado = true;
                vehiculo = f;
            }
        }
        return vehiculo;
    }

}
