/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Contacto implements Comparable<Contacto>{

    private int id;
    private String nombre;
    private String apellidos;
    private long tlf;
    private LocalDate fechaNac;

    public Contacto(String nombre, String apellidos, long tlf, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlf = tlf;
        this.fechaNac = fechaNac;
    }

    public Contacto() {
        crearContacto();
    }

    private void crearContacto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce los apellidos: ");
        this.apellidos = new Scanner(System.in).nextLine();
        System.out.println("Introduce su número de teléfono: ");
        this.tlf = teclado.nextLong();
        System.out.println("Introduce su día de nacimiento: ");
        int dia = teclado.nextInt();
        System.out.println("Introduce su mes de nacimiento: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce su año de nacimiento: ");
        int anio = teclado.nextInt();
        this.fechaNac = LocalDate.of(anio, mes, dia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public long getTlf() {
        return tlf;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tlf=" + tlf + ", fechaNac=" + fechaNac.format(f) + '}';
    }

    @Override
    public int compareTo(Contacto o) {
       return this.nombre.compareTo(o.nombre);
    }
    

}
