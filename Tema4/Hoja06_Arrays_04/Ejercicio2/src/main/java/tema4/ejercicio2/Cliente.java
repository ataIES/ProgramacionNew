/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Cliente {

    private int codigo;
    private String nombre;
    private String apellidos;
    private long telefono;
    private double saldo;

    //Contructor que pido por teclado los datos del cliente
    public Cliente() {
        this.codigo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce sus apellidos: ");
        this.apellidos = new Scanner(System.in).nextLine();
        System.out.println("Introduce el número de teléfono");
        this.telefono = teclado.nextLong();
        System.out.println("Introduce el saldo: ");
        this.saldo = teclado.nextDouble();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public long getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//Muestro los datos del cliente
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + String.format("%.2f", saldo) + '}';
    }
    

    

}
