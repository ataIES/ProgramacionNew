/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        Mascota mascota1 = new Mascota("Perro", 01, 10, 2016);
        Mascota mascota2 = new Mascota("Gato", 05, 12, 2020);
        Mascota mascota3 = new Mascota("Pajaro", 25, 06, 2023);
        Mascota mascota4 = new Mascota("Urón", 20, 10, 2015);

        veterinario.aniadir(mascota1);
        veterinario.aniadir(mascota2);
        veterinario.aniadir(mascota3);
        veterinario.aniadir(mascota4);
        System.out.println("---Mostrando todas las mascotas");
        System.out.println(veterinario.mostrar());
        System.out.println("---Mostrar mascotas mayores de 5 años---");
        System.out.println(veterinario.mostrarMayores());
        

    }
}
