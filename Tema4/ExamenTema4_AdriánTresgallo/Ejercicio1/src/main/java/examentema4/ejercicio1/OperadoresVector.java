/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class OperadoresVector {

    private int[] numeros;

    public OperadoresVector(int[] numeros1) {
        this.numeros = numeros1;
    }

    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
    }

    public void encontrarPrimo() {
        boolean encontrado = false;
        for (int i = 0; i < numeros.length && !encontrado; i++) {
            if (numeros[i] % 1 == 0 && numeros[i] % numeros[i] == 0) {
                System.out.println("El primer número primo es: "+numeros[i]);
                encontrado=true;
            }else{
                System.out.println("No existe ningun número primo");
            }
        }
    }
    public void invertirVector(){
        int primerNumero=numeros[0];
        int ultimoNumero=numeros[numeros.length-1];
        int aux=0;
        for(int i=0;i<numeros.length-1;i++){
            for(int a=numeros.length-2;a>=1;a--){
                aux=numeros[i];
                numeros[i]=numeros[a];
                numeros[a]=aux;
            }
            aux=primerNumero;
            numeros[0]=ultimoNumero;
            numeros[numeros.length-1]=primerNumero;
        }
         
    }
    public void divisores(int num){
        numeros[0]=num;
        for(int i=1;i<numeros.length;i++){
            for(int a=num;a>0;a--){
                if(a%2==0){
                    numeros[i]=a;
                }
                
            }
            
        }
    }

}
