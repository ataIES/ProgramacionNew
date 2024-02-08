/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public abstract class Empleado {

    protected String nombre;
    protected String departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce su nombre: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce su departamento: ");
        this.departamento = new Scanner(System.in).nextLine();
        this.edad = validarEdad();
        this.casado = esCasado();
        this.salario = teclado.nextDouble();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private int validarEdad() {
        boolean valido = false;
        do {
            System.out.println("Introduce su edad entre 18 y 65 años: ");
            this.edad = new Scanner(System.in).nextInt();
            if (edad > 17 && edad < 66) {
                System.out.println("Edad válida introducida");
                valido = true;
            } else {
                System.out.println("Error, edad incorrecta");
            }
        } while (!valido);
        return edad;
    }

    private boolean esCasado() {
        String opc = "";
        boolean valido = false;
        boolean casado = false;
        do {
            System.out.println("¿Está casado?");
            opc = new Scanner(System.in).nextLine();
            if (opc.equalsIgnoreCase("Si")) {
                casado = true;
                valido = true;
            } else if (opc.equalsIgnoreCase("No")) {
                valido = true;
            } else {
                System.out.println("Error,vuelve a introducir si está casado");
            }
        } while (!valido);
        return casado;
    }

    public String clasificacion() {
        String clasificacion = "";
        if (edad <= 21) {
            clasificacion = "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            clasificacion = "Intermedio";
        } else {
            clasificacion = "Senior";
        }
        return clasificacion;
    }

    public void aumentarSalario(int porcentaje) {
        double porcentaje1 = porcentaje / 100;
        this.salario = getSalario() + (getSalario() * porcentaje1);
    }

    public String mostrarEmpleado() {
        String casado = esCasado() ? "Sí" : "No";
        return "---Empleado---\n\tNombre: " + getNombre() + "\n\tDepartamento: " + getDepartamento() + "\n\tEdad: " + getEdad()
                + "\n\tCasado: " + casado + "\nSalario: " + String.format("%.2f", getSalario() + "\n");
    }

}
