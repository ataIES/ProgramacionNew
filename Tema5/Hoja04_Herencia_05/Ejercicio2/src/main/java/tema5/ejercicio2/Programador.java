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
public class Programador extends Empleado {

    private int lineasCodigo;
    private String lenguajeDominante;

    public Programador() {
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el lenguaje dominante: ");
        this.lenguajeDominante = teclado.nextLine();
        System.out.println("Introduce el número de líneas de código por hora: ");
        this.lineasCodigo = teclado.nextInt();
    }

    public Programador(int lineasCodigo, String lenguajeDominante, String nombre, String departamento, int edad, boolean casado, double salario) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasCodigo = lineasCodigo;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasCodigo() {
        return lineasCodigo;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public String mostrarProgramador() {
        String casado = super.isCasado() ? "Sí" : "No";
        return "---Programador---\n\tNombre: " + super.getNombre() + "\n\tDepartamento: " + super.getDepartamento() + "\n\tEdad: " + super.getEdad()
                + "\n\tCasado: " + casado + "\n\tSalario: " + String.format("%.2f", super.getSalario()) +"\n\tLíneas de código por hora: "+getLineasCodigo()+"\n\tLenguaje Dominante: "+getLenguajeDominante()+"\n";
    }
}
