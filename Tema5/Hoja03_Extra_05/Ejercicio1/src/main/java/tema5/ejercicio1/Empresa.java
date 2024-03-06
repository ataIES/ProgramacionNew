/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.io.IOException;

/**
 *
 * @author DAW125
 */
public class Empresa {

    private Empleado[] empleados;
    private static int contEmpleado;

    public Empresa(int nEmpleado) {
        this.empleados = new Empleado[nEmpleado];
        this.contEmpleado = 0;
    }

    public static int getContEmpleado() {
        return contEmpleado;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        boolean agregado = false;
        try {
            if (contEmpleado < empleados.length) {
                empleados[contEmpleado] = empleado;
                contEmpleado++;
                agregado = true;
            } else {
                throw new IOException("Error, limite del array superado");
            }
        } catch (IOException io) {
            System.err.println(io.getMessage());
        }
        return agregado;
    }

    public void eliminarEmpleado(String dni) {
        boolean encontrado = false;
        int pos = 0;
        try {
            for (int i = 0; i < contEmpleado; i++) {
                if (empleados[i].getDni().equalsIgnoreCase(dni)) {
                    pos = i;
                    encontrado = true;
                }
            }
            if (encontrado) {
                for (int i = pos; i < contEmpleado - 1; i++) {
                    empleados[i] = empleados[i + 1];
                }
                System.out.println("DNI " + dni + " borrado correctamente");
                contEmpleado--;
            } else {
                throw new EmpleadoNOEncontradoException("Error, no existe el empleado con dni " + dni);
            }
        } catch (EmpleadoNOEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarEmpleadoMasHoras() {
        int contEmpleadosHora = 0;
        int masHoras = 0;
        double masTarifa=0;
        EmpleadoPorHoras aux=null;
        EmpleadoPorHoras[] lista = new EmpleadoPorHoras[contEmpleado];
        for (int i = 0; i < contEmpleado; i++) {
            if (empleados[i] instanceof EmpleadoPorHoras empleaux) {
                if (empleaux.getHorasTrabajadas() >= masHoras) {
                    lista[contEmpleadosHora] = empleaux;
                    masHoras = empleaux.getHorasTrabajadas();
                    contEmpleadosHora++;
                }

            }
        }
        for (int a = 0; a < contEmpleadosHora; a++) {
            if(lista[a].getTarifaPorHora()>masTarifa){
                masTarifa=lista[a].getTarifaPorHora();
                aux=lista[a];
            }
        }
        eliminarEmpleado(aux.getDni());

    }

    public String mostrarEmpleados() {
        String cadena = "";
        try {
            if (contEmpleado != 0) {
                for (int i = 0; i < contEmpleado; i++) {
                    cadena += empleados[i].toString() + "\n";
                }
            } else {
                throw new NullPointerException("Error, no puedes mostrar los datos porque está vacio");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
        return cadena;
    }

}
