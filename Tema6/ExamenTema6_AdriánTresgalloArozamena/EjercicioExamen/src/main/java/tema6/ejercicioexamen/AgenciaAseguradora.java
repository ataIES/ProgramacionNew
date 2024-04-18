/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicioexamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW125
 */
public class AgenciaAseguradora {

    private SortedSet<Vehiculo> listaAseguradora;

    public AgenciaAseguradora() {
        this.listaAseguradora = new TreeSet<>();
    }

    public void aniadirVehiculo(Vehiculo v) {
        String matricula = v.getMatricula();
        try {
            if (!listaAseguradora.contains(v)) {
                if (listaAseguradora.add(v)) {
                    System.out.println("Vehiculo " + matricula + " añadido correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo añadir el vehiculo " + matricula);
                }
            } else {
                throw new ExcepcionPersonalizada("Erro, ya existe un vehiculo en la lista");
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarVehiculo(String matricula) {
        Vehiculo vehiculoEliminar = buscarVehiculo(matricula);
        try {
            if (vehiculoEliminar != null) {
                if (listaAseguradora.remove(vehiculoEliminar)) {
                    System.out.println("Vehiculo " + matricula + " borrada correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error el vehiculo " + matricula + " no se pudo borrar");
                }
            } else {
                throw new NullPointerException("Error, el vehiculo " + matricula + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public Vehiculo buscarVehiculo(String matricula) {
        Vehiculo vehiculoEncontrado = null;
        Iterator<Vehiculo> it = listaAseguradora.iterator();
        while (it.hasNext()) {
            Vehiculo v = it.next();
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculoEncontrado = v;
            }
        }
        return vehiculoEncontrado;
    }

    public String listarMotosPrima(double prima) {
        String cadena="";
       for(Vehiculo v:listaAseguradora){
           if(v instanceof Moto motoaux){
               if(motoaux.calcularPrimaSeguro()>prima){
                  cadena= MetodosEstaticos.mostrarDatos(motoaux.datosObjeto());
               }
           }
       }
       return cadena;
    }
    public ArrayList<Conductor>listarConductores(){
        ArrayList<Conductor>lista=new ArrayList<>();
        for(Vehiculo v:listaAseguradora){
            lista.add(v.getConductor());
        }
        return lista;
    }
    public int obtenerNumeroVehiculo(){
        return Vehiculo.getnVehiculos();
    }
}
