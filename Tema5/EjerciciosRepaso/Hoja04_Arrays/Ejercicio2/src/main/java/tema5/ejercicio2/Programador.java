/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author atres
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String departamento, int edad, boolean casado, double salario) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public Programador(){
        super();
        this.lineasDeCodigoPorHora=Validacion.validarEntero("Introduce las líneas por hora: ");
        this.lenguajeDominante=Validacion.validarLenguaje();
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    @Override
    public String mostrarEmpleado(){
        return "---PROGRAMADOR---"+super.mostrarEmpleado()+"\nLineas de código Por hora: "+getLineasDeCodigoPorHora()
                +"\tLenguaje Dominante: "+getLenguajeDominante()+"\n";
    }
}
