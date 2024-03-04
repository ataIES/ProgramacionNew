/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAlumnos;

import ejemploHash.Pintor;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Artista implements Comparable<Artista>{
    //atributos 
    private String nombre;
    private String ciudad; //ciudad en la que nació
    private int nacimiento; //será el año en que nació
    
    //constructor

    public Artista(String nombre, String ciudad, int nacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nacimiento = nacimiento;
    }
    
    
    //métodos get & set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
    //método toString

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Ciudad=" + ciudad + ", Año de nacimiento=" + nacimiento + "\t";
    }

//    @Override
//    public int compareTo(Artista otroArtista) {
//        // Comparación basada en el nombre del artista
//        return this.nombre.compareTo(otroArtista.nombre);
//    }
    
    @Override
   public int compareTo(Artista otroPintor) {
       //vamos a ordenar por año de nacimiento
       int comparacionPorNacimiento = Integer.compare(otroPintor.nacimiento, this.nacimiento);
       if (comparacionPorNacimiento !=0) {
           return comparacionPorNacimiento;
       } else{
           //si los años de nacimiento son iguales, ordenamos por nombre
           return this.nombre.compareTo(otroPintor.nombre);
       }
   }
    
    
    //sobreescritura de hashCode y equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.ciudad);
        hash = 97 * hash + this.nacimiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artista other = (Artista) obj;
        if (this.nacimiento != other.nacimiento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ciudad, other.ciudad);
    }
    
    
    
}//fin de la clase
