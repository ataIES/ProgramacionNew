/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejemploarrayobjectos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DAW125
 */
public class EjemploArrayObjectos {

    public static void main(String[] args) {
        
        Alumno alumno1=new Alumno("Pepe","Vazquez",7,LocalDate.of(2003, 12, 1));
        alumno1.imprime();
        
        Grupo daw1=new Grupo(3,"DAW1");
        daw1.print();
    }
}
