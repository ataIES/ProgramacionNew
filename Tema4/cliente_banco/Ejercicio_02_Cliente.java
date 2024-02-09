/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_clase.unidad_04.hoja_06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_02_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//       Cliente c1 = new Cliente();
//        
//       System.out.println(c1.mostrarCliente());
        
        Banco b1 = new Banco(10);
        
        Scanner teclado = new Scanner(System.in);
        boolean salir =false;
        int opcion, codigo1;//codigo1 es el código para buscar un cliente para ver sus datos o para darlo de baja
        
        
        while(!salir){
            
            System.out.println("Gestión de mi Banco");
        System.out.println("1.- Dar de Alta un Cliente");
        System.out.println("2.- Mostrar los Clientes del Banco");
        System.out.println("3.- Buscar un cliente (Hay que conocer el código)");
        System.out.println("4.- Dar de baja un Cliente");
        System.out.println("5.- Salir");
            
        System.out.println("Escribe una de las opciones");
           opcion = teclado.nextInt();
           
           //char, byte, short, int, enum
           switch(opcion){
               case 1:
                   System.out.println("Alta de cliente");
                   b1.insertarCliente();
                   break;
               case 2:
                   b1.mostrarClientes();
                   break;
               case 3:
                   System.out.println("Indica el código del cliente buscado");
                   codigo1 = teclado.nextInt();
                   System.out.println(b1.buscar(codigo1));
                   break;
               case 4:
                   System.out.println("Dar de baja un Cliente en el Banco");
                   System.out.println("Indica el código del cliente buscado");
                   codigo1 = teclado.nextInt();
                   
                   b1.darBaja(codigo1);
                   break;
               case 5:{
                   salir = true;
                   break;}
               default:
                   System.out.println("Opción No válida. Comprueba tu opción");
           }
        }
        
        
        
        
        
        
        
        
    }//fin del main
    
}
