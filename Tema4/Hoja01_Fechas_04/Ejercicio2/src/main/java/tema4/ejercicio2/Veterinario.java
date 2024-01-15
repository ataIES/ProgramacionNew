/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Veterinario {

    private Mascota[] lista_mascotas;
    private int contador;

    public Veterinario() {
        this.lista_mascotas = new Mascota[100];
        this.contador = 0;
    }
//Metodo para añadir una mascota al veterinario

    public void aniadir(Mascota nueva_mascota) {
        if (contador < lista_mascotas.length) {
            lista_mascotas[contador] = nueva_mascota;
            contador++;
        } else {
            System.out.println("La lista está llena");
        }
    }
//Metodo para mostrar todas las mascotas del veterinario

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < this.contador; i++) {
            cadena += lista_mascotas[i].toString() + "\n";
        }
        return cadena;
    }
//Metodo para mostrar mascotas mayores de 5 años

    public String mostrarMayores() {
        String cadena = "";
        for (int i = 0; i < this.contador; i++) {
            if (lista_mascotas[i].getEdad() > 5) {
                cadena += lista_mascotas[i].toString() + "\n";
            }
        }
        return cadena;
    }

}
