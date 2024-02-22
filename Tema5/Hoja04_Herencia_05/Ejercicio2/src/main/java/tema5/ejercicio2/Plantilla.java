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
    
//Método que inserta empleados
    public void insertarEmpleado(Empleado e) {
        if (contEmpleados < empleados.length) {
            empleados[contEmpleados] = e;
            System.out.println("Empleado "+e.nombre+" añadido correctamente");
            contEmpleados++;
        } else {
            System.out.println("Error, número máximo de empleados alcanzados");
        }
    }
    
//Método que muestra todos los empleados
    public String mostrarEmpleados() {
        String cadena = "";
        for (int i = 0; i < contEmpleados; i++) {
            cadena += empleados[i].mostrarEmpleado();
        }
        return cadena;
    }
    
//Método que obtiene el programador con más líneas de código
    public Programador masLineasCodigo(){
        int codigoMayor=0;
        Programador programaresult=null;
        Programador[]lista=new Programador[100];
        boolean encontrado=false;
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i]instanceof Programador programaaux){
                lista[i]=programaaux;
                if(programaaux.getLineasCodigo() >codigoMayor){
                    programaresult=programaaux;
                    codigoMayor=programaaux.getLineasCodigo();
                }
            }
        }
        if(programaresult==null){
            System.out.println("No existe ningún programador");
        }
        return programaresult;
    }
    
    public Programador[]listarProgramador(){
        Programador lista[]=new Programador[100];
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i] instanceof Programador programaaux){
                lista[i]=programaaux;
            }
        }
        return lista;
    }
    
//Método que muestra los empleados senior
    public String senior(){
        String senior="";
        boolean encontrado=false;
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i].clasificacion().equalsIgnoreCase("Senior")){
                encontrado=true;
                senior+=empleados[i].mostrarEmpleado();
            } 
        }
        if(encontrado==false){
            senior="No existe ningún empleado senior";
        }
        
        return senior; 
    }
    
    //Método que aumenta el salario en un 20% a todos los intermedios
    public void sueldoIntermedios(){
        boolean encontrado=false;
        for(int i=0;i<contEmpleados;i++){
            if(empleados[i].clasificacion().equalsIgnoreCase("Intermedio")){
                empleados[i].aumentarSalario(20);
                System.out.println(empleados[i].mostrarEmpleado());
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No existe ningún empleado intermedio");
        }
    }

}
