/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5.ejercicio2;

import java.io.IOException;


/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Programador p1= new Programador(200,"Java","Adrian","Programacion",21,false,1200.45);
        Programador p2= new Programador(200,"Python","Maria","Programacion",30,false,1500.45);
        Empleado e1=new Empleado("Marcos","Comercial",40,true,2200.34);
        Empleado e2= new Empleado("Carmen","Logistica",22,false,1100.45);
        Plantilla plantilla = new Plantilla();
        System.out.println("---Insertar empleados---");
        insertar(plantilla,p1);
        insertar(plantilla,e1);
        insertar(plantilla,p2);
        insertar(plantilla,e2);
        System.out.println("---Mostrar todos los empleados---");
        System.out.println(plantilla.mostrarTodos());
        System.out.println("");
        System.out.println("---Programador con más lineas de código---");
        Programador aux=plantilla.masLineas();
        System.out.println(aux.mostrarEmpleado());
        System.out.println("---Mostrar todos los senior---");
        System.out.println(plantilla.mostrarSenior());
        System.out.println("---Aumentar un 20% el sueldo de los Programadores Intermedios---");
        plantilla.aumentarSalarioIntermedios();
        System.out.println(plantilla.mostrarTodos());
        

    }

    public static void insertar(Plantilla p,Empleado e) {
        try {
            if (p.insertarEmpleado(e)) {
                System.out.println("Insertado correctamente");
            }
        }catch(RuntimeException r){
            System.out.println("Error, estás intentando insertar alguien que no es un empleado");
        }catch(IOException io){
            System.out.println(io.getMessage());
        } 
        
    }
}
