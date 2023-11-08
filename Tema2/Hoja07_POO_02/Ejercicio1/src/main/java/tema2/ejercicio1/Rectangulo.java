/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo() {
    }
    
    public Rectangulo(int largo,int ancho){
        this.largo=largo;
        this.ancho=ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int area(){
        return largo*ancho;
    }
    public int diagonal(){
        return (int) Math.sqrt(Math.pow(largo, 2)+Math.pow(ancho, 2));
    }
    
}
