/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Bonoloto {

    private int[] numeros;

    public Bonoloto() {
        this.numeros = new int[6];
    }

    public void aniadirNumeros() {
        boolean valido = false;
        for (int i = 1; i < numeros.length; i++) {
            numeros[0] = (int) (Math.floor(Math.random() * 10) + 1);
            do {
                numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
                if (numeros[0] != numeros[i]) {
                    valido = true;
                }else{
                    numeros[i] = (int) (Math.floor(Math.random() * 10) + 1);
                }
            } while (!valido);
        }
    }
    public String mostrar(){
        String cadena="";
        for(int i=0;i<numeros.length;i++){
            cadena+=numeros[i]+" ";
        }
        return "----BONOLOTO--- \n"+cadena;
    }

}
