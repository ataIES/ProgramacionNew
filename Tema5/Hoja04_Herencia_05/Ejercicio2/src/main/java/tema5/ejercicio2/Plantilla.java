/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Plantilla {

    private Empleado[] empleados;
    private int contEmpleados;

    public Plantilla() {
        this.empleados = new Empleado[100];
        this.contEmpleados = 0;
    }

    public void insertarEmpleado(Empleado e) {
        if (contEmpleados < empleados.length) {
            empleados[contEmpleados] = e;
            System.out.println("Empleado "+e.nombre+" añadido correctamente");
            contEmpleados++;
        } else {
            System.out.println("Error, número máximo de empleados alcanzados");
        }
    }

    public String mostrarEmpleados() {
        String cadena = "";
        for (int i = 0; i < contEmpleados; i++) {
            cadena += empleados[i].mostrarEmpleado();
        }
        return cadena;
    }
    public Programador masLineasCodigo(){
        int codigoMayor=0;
        Programador programaresult=null;
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i]instanceof Programador programaaux){
                if(programaaux.getLineasCodigo() >codigoMayor){
                    programaresult=programaaux;
                }
            }else{
                
                System.out.println("No existe ningún programador");
            }
        }
        return programaresult;
    }
    public String senior(){
        String senior="";
        boolean encontrado=false;
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i].clasificacion().equalsIgnoreCase("Senior")){
                encontrado=true;
                senior+=empleados[i].mostrarEmpleado();
            } 
        }
        if(!encontrado){
            senior="No existe ningún empleado senior";
        }
        return senior; 
    }
    public void sueldoIntermedios(){
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i].clasificacion().equalsIgnoreCase("Intermedio")){
                empleados[i].aumentarSalario(20);
            }
            else{
                System.out.println("No existe ningún empleado intermedio");
            }
        }
    }

}
