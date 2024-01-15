/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void imprimir() {
        System.out.printf("---DATOS DE EMPLEADO--- \n\tNombre: %s \n\tSueldo: %.2f\n", nombre, sueldo);
    }

    public String pagarImpuestos() {
        return sueldo > 3000 ? "Debe pagar impuestos" : "No tiene que pagar impuestos";
    }

    public static void main(String[] args) {
        int aux=args.length;
        if(aux>0){
            Empleado empleado1=new Empleado(args[0], Double.parseDouble(args[1]));
            empleado1.imprimir();
            System.out.println(empleado1.pagarImpuestos());
        }
    }
}
