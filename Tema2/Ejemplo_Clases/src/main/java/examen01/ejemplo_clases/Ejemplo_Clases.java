/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package examen01.ejemplo_clases;

/**
 *
 * @author daw1
 */
public class Ejemplo_Clases {

    public static void main(String[] args) {
        Pez carpa, grande, cometa;
        
        //Inicializamos las variables creando 3 peces diferentes
        carpa=new Pez();
        grande=new Pez(50);
        cometa=new Pez("Naranja","Cometa",8);
        
        //accediendo a los métodos de la clase Pez
        carpa.getColor();
        carpa.alimentarse();
        
        grande.setColor("Azul");
        grande.getTipo();
    }
}
