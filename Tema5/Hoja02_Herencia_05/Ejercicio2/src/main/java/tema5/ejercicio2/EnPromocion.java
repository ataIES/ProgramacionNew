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
        return "---ARTÍCULO---\n\tCódigo: " + super.getCodigo() + "\n\tDescripción: " + super.getDescripcion() + "\n\tDescuento: " + descuento + "%" + "\n\tPrecio: " + String.format("%.2f", super.getPrecio() + (super.getPrecio() * (descuento / 100)));
    }

}
