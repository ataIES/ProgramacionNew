/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema8.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author atres
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        final double IVA = 0.21, DESCUENTO = 0.10;
        double precio, precioIVA, precioDescuento;
        String mensaje;

        //Introduzco el valor del precio con el JOptionPane,creando una variable donde el valor será String para luego convertirlo a double y me lo recoja bien
        mensaje = JOptionPane.showInputDialog("Escriba el precio:");
        precio = Double.parseDouble(mensaje);

        //Calculo el precio con IVA y con el descuento
        precioIVA = precio + (precio * IVA);
        precioDescuento = precioIVA - (precioIVA * DESCUENTO);

        //Muestro los resultados por pantalla
        System.out.printf("El precio sin IVA es: %.2f \nEl precio con el porcentaje del 21 de IVA es: %.2f"
                + "\nEl precio después de aplicar un porcentaje de 10 de descuento es: %.2f \n", precio, precioIVA, precioDescuento);
        //Con la opción JOptionPane.showMessage
        JOptionPane.showMessageDialog(null, "El precio sin IVA es: " + String.format("%.2f", precio) + "\nEl precio con el porcentaje del 21 de IVA es: " + String.format("%.2f", precioIVA)
                + "\nEl precio después de aplicar un porcentaje de 10 de descuento es: " + String.format("%.2f", precioDescuento));

    }
}
