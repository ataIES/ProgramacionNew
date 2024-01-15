/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW125
 */
public class Mascota {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Mascota(String nombre,int dia,int mes,int anio) {
        this.nombre = nombre;
        /*
        Otra opción es con String
        String fecha="";
        fecha=dia+"/"+mes+"/"+anio;
        */
        
        this.fechaNacimiento=LocalDate.of(anio, mes, dia);
    }
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Mascota{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento.format(f) + '}';
    }
    
    
    
}
