/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Alimento {

    private String nombre;
    private int grasas, hidratos;
    private boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + "\nNúmero de grasas: " + grasas
                + "\nNúmero de hidratos: " + hidratos + "\n¿Es origen animal?: " + origenAnimal);
    }

    public boolean esDietetico() {
        boolean dietetico = false;
        if (grasas < 12 && !origenAnimal) {
            dietetico = true;
        }
        return dietetico;
    }

    public double calorias(int gramos) {
        return gramos * ((grasas * 5.3) + (hidratos * 2.1));
    }
}
