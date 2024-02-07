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
        this.edad=validarEdad();
        
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
    private boolean esCasado(){
        String opc="";
        do{
            
        }while(!valido)
    }

}
