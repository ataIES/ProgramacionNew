/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeDos de2=new DeDos();
        DeTres de3= new DeTres();
        System.out.println("---Pruebo con la clase deDos---");
        Series inter=de2;
        for(int i=0;i<5;i++){
            System.out.println("Muestro el siguiente "+inter.getSiguiente());
            
        }
        System.out.println("---Pruebo con la clase deTres---");
        Series inter2=de3;
        for(int i=0;i<5;i++){
            System.out.println("Muestro el siguiente "+inter2.getSiguiente());
        }
        System.out.println("Nombre de la interfaz: "+Series.nombreInterfaz());
        inter.mostrarInicio();
        
    }
    
}
