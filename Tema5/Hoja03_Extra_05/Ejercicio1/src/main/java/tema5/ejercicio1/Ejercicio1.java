/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio1;



/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int cont=0;
        Empresa empresa1 = new Empresa(4);
        EmpleadoPorHoras empleado1=new EmpleadoPorHoras(200,45.5,"Adrian","eee rrr","44455566L");
        EmpleadoFijo empleado2=new EmpleadoFijo(1320.45,"Maria","wer rtt","77787854W");
        EmpleadoPorHoras empleado3=new EmpleadoPorHoras(200,40.45,"Marcos","bbb fff","11145678P");
        EmpleadoFijo empleado4=new EmpleadoFijo(2200.12,"Lucia","tyr tre","44499999N");
        EmpleadoFijo empleado5=new EmpleadoFijo(1320.45,"Maria","wer rtt","77787854W");
        
        System.out.println("---Insertar empleados---");
        System.out.println(formateoInsertar(empresa1,empleado1));
        System.out.println(formateoInsertar(empresa1,empleado3));
        System.out.println(formateoInsertar(empresa1,empleado2));
        System.out.println(formateoInsertar(empresa1,empleado4));
        System.out.println(formateoInsertar(empresa1,empleado5));
        
        System.out.println("---Mostrar empleados---");
        System.out.println(empresa1.mostrarEmpleados());
       
        System.out.println("---Eliminar empleado con dni 77787854W---");
        empresa1.eliminarEmpleado("77787854W");
        System.out.println("---Vuelvo a mostrar los empleados---");
        System.out.println(empresa1.mostrarEmpleados());
        System.out.println("---Eliminar empleado con más horas--");
        empresa1.eliminarEmpleadoMasHoras();
        System.out.println(empresa1.mostrarEmpleados());
       
    }

    public static String formateoInsertar(Empresa e, Empleado empleado) {
        String cadena = "";
        if (e.agregarEmpleado(empleado)) {
            cadena = "Empleado " + empleado.getNombre() + " " + empleado.getApellidos() + " añadido correctamente";
        }
        return cadena;
    }

}
