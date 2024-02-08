/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Plantilla p=new Plantilla();
        Empleado empleado1=new Empleado("Adrian","Ventas",23,false,1200.45);
        Empleado empleado2=new Empleado("Juan","Compras",40,true,1500.66);
        Programador programador1=new Programador(200,"Java","Maria","Informática",22,true,1800);
        Programador programador2=new Programador(200,"Phyton","Marta","Informática",60,false,2200.21);
        System.out.println("");
        
        System.out.println("---AÑADIR EMPLEADOS---");
        p.insertarEmpleado(empleado1);
        p.insertarEmpleado(programador1);
        p.insertarEmpleado(empleado2);
        p.insertarEmpleado(programador2);
        System.out.println("");
        
        System.out.println("---Mostrar todos los empleados---");
        System.out.println(p.mostrarEmpleados());
        System.out.println("");
        
        System.out.println("---Mostrar todos los empleados senior---");
        System.out.println(p.senior());
        System.out.println("");
        
        System.out.println("---Au");
       
        
        
    }
}
