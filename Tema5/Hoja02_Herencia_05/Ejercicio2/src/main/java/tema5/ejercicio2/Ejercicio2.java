/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Articulo[] articulos = new Articulo[4];
        insertarArticulos(articulos);
        mostrarArticulos(articulos);

    }

    public static void insertarArticulos(Articulo[] articulo1) {
        Scanner teclado = new Scanner(System.in);
        String opc = "";
        if (Articulo.getContArticulos() < articulo1.length) {
            for (int i = 0; i < articulo1.length; i++) {
                System.out.println("---Menú de insertar Artículos--");
                System.out.println("¿Qué tipo de artículo quieres introducir, Perecedero o En Promocion?");
                opc = new Scanner(System.in).nextLine();
                if (opc.equalsIgnoreCase("En Promocion")) {
                    articulo1[i] = new EnPromocion();
                    articulo1[i].setCodigo(i + 1);
                    System.out.println("Artículo En Promocion añadido correctamente");
                    Articulo.setContArticulos();
                } else if (opc.equalsIgnoreCase("Perecedero")) {
                    articulo1[i] = new Perecedero();
                    articulo1[i].setCodigo(i + 1);
                    System.out.println("Artículo Perecedero añadido correctamente");
                    Articulo.setContArticulos();
                } else {
                    System.out.println("Error, has introducido una opción errónea");
                }
            }
        }else{
            System.out.println("Error, número máximo de articulos alcanzado");
        }
    }

    public static void mostrarArticulos(Articulo[] articulo1) {
        for (int i = 0; i < Articulo.getContArticulos(); i++) {
            System.out.print(articulo1[i].mostrar()+"\n");
        }
    }

}
