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
public class EnPromocion extends Articulo {

    private int descuento;

    public EnPromocion(int descuento, int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }

    public EnPromocion() {
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce su descuento: ");
        this.descuento = teclado.nextInt();
    }

    public int getDescuento() {
        return descuento;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "\n\tDescuento: " + getDescuento() + "%" + "\n\tPrecio después de Aplicar Descuento: " + String.format("%.2f", super.getPrecio() + (super.getPrecio() * (getDescuento() / 100)));
    }

}
