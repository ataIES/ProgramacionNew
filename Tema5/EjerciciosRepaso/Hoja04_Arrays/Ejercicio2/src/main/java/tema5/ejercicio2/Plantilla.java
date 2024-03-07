/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.io.IOException;

/**
 *
 * @author atres
 */
public class Plantilla {

    private Empleado[] empleados;
    private static int contEmpleados;

    public Plantilla() {
        this.empleados = new Empleado[100];
        contEmpleados = 0;
    }

    public boolean insertarEmpleado(Empleado empleado) throws IOException, NullPointerException {
        boolean insertado = false;
        if (contEmpleados < empleados.length) {
            empleados[contEmpleados] = empleado;
            contEmpleados++;
            insertado = true;
        } else {
            throw new IOException("Error, has superado el límite de empleados");
        }

        return insertado;
    }

    public String mostrarTodos() {
        String cadena = "";
        for (int i = 0; i < contEmpleados; i++) {
            cadena += empleados[i].mostrarEmpleado() + "\n";
        }
        return cadena;
    }

    public Programador masLineas() {
        Programador aux = null;
        Programador[] lista = new Programador[contEmpleados];
        int contProgramador = 0;
        int masLineas = 0;
        double masSalario = 0;
        for (int i = 0; i < contEmpleados; i++) {
            if (empleados[i] instanceof Programador programaux) {
                if (programaux.getLineasDeCodigoPorHora() >= masLineas) {
                    lista[contProgramador] = programaux;
                    masLineas = programaux.getLineasDeCodigoPorHora();
                    contProgramador++;
                }
            }
        }
        for (int a = 0; a < contProgramador; a++) {
                if (lista[a].getSalario() > masSalario) {
                    aux = lista[a];
                    masSalario = lista[a].getSalario();
                }
            }
        return aux;
    }

    public String mostrarSenior() {
        String cadena = "";
        for (int i = 0; i < contEmpleados; i++) {
            if (empleados[i].clasificacion().equalsIgnoreCase("senior")) {
                cadena += empleados[i].mostrarEmpleado() + "\n";
            }
        }
        return cadena;
    }

    public void aumentarSalarioIntermedios() {
        boolean encontrado=false;
        for (Empleado p : empleados) {
            if (p != null) {
                if (p instanceof Programador programaux) {
                    if (programaux.clasificacion().equalsIgnoreCase("Intermedio")) {
                        programaux.aumentarSalario(20);
                        System.out.println(programaux.mostrarEmpleado());
                        encontrado=true;
                    }
                }
            }
        }
        if(!encontrado){
            System.out.println("No existe ningún programador Intermedio");
        }
    }
}
