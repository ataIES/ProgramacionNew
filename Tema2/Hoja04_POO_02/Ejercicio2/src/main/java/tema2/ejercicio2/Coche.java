/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author atres
 */
public class Coche {

    private String matricula;
    private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelera(int increment_velocidad) {
        if (increment_velocidad <= 120) {
            this.velocidad = increment_velocidad;
        } else {
            System.out.println("Error, no puedes aumentar la velocidad por encima de 120");
        }
    }

    public void frena(int dism_velocidad) {
        if (dism_velocidad >= 0) {
            this.velocidad = dism_velocidad;
        } else {
            System.out.println("Error, no puedes disminuir la velocidad por debajo de 0");
        }
    }
    public String mostrarLetras(){
        String solo_letras=" ";
        for(int i=0;i<matricula.length();i++){
            if(Character.isLetter(matricula.charAt(i))){
                solo_letras+=matricula.charAt(i);
            }
        }
        return solo_letras;
    }
    public String mostrarCoche(){
        return "Matrícula: "+matricula+"\nVelocidad: "+velocidad;
    }

}
