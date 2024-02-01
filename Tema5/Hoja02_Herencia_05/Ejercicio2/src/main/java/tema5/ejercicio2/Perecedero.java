/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Perecedero extends Articulo {

    private int mesCaducidad;
    private int anioCaducidad;

    public Perecedero(int mesCaducidad, int anioCaducidad, int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
        this.mesCaducidad = mesCaducidad;
        this.anioCaducidad = anioCaducidad;
    }
    public Perecedero(){
        super();
        Scanner teclado=new Scanner(System.in);    
        System.out.println("Introduce su mes de caducidad: ");
        this.mesCaducidad=teclado.nextInt();
        System.out.println("Introduce su año de caducidad: ");
        this.anioCaducidad=teclado.nextInt();  
    }

    public int getMesCaducidad() {
        return mesCaducidad;
    }
    public String mes(){
        return (mesCaducidad<10)?"0"+mesCaducidad:String.valueOf(mesCaducidad);
    }

    public int getAnioCaducidad() {
        return anioCaducidad;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "\n\tMes de Caducidad: " + mes() + "\n\tAño de Caducidad: " + anioCaducidad;
    }

}
