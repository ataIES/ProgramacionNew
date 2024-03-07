/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author atres
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
        System.out.println("Introduce su nombre: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce su departamento: ");
        this.departamento = new Scanner(System.in).nextLine();
        this.edad = Validacion.validarEdad();
        this.casado = Validacion.validarCasado();
        this.salario = Validacion.validarSalario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String clasificacion() {
        String clasificacion = "";
        if (edad <= 21) {
            clasificacion = "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            clasificacion = "Avanzado";
        } else {
            clasificacion = "Senior";
        }
        return clasificacion;
    }
}
