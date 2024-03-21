/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Curso {
    private int codigo;
    private String descripcion;
    private int nHoras;
    
    public Curso(){
        this.codigo=0;
        this.descripcion=Teclado.validarDescripcion("Introduce su descripcion: ");
        this.nHoras=Teclado.validarNúmeroHoras("Introduce el número de horas: ");
    }

    public Curso(int codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    
    public String mostrarCurso(){
        String cadena="";
        
        cadena+="\n---Curso "+getCodigo()+"---"+"\nDescripción: "+getDescripcion()+"\nNúmero de Horas Cursadas: "+getnHoras();
        return cadena;
    }
}
