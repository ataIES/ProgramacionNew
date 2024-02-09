/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author atres
 */
public class Gato extends Mamifero implements Domestico,Felino{
    private String nombre;

    public Gato(String nombre, String raza, int npatas, String alimento) {
        super(raza, npatas, alimento);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre +", "+ super.toString()+ '}';
    }
    @Override
    public String obedecer(){
        return "Obedeciendo";
    }
    @Override
    public String araniar(){
        return "Arañando";
    }
    
    
}
