/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DAW125
 */
public class AccesoClientes {
    private Queue<Cliente>llegados;
    private Queue<Cliente>atendidos;
    
    public AccesoClientes(){
        this.llegados=new LinkedList<>();
        this.atendidos=new LinkedList<>();
    }
    
    public void aniadirCliente(Cliente cliente){
        String nombreCliente=cliente.getNombre();
        try{
            if(llegados.add(cliente)){
                System.out.println("Cliente "+nombreCliente+" añadido correctamente");
            }else{
                throw new ExcepcionPersonalizada("Error, no se pudo añadir el cliente");
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
    public void atenderCliente(){
        String nombreCliente="";
        try{
            Cliente clienteAtendido=llegados.remove();
            nombreCliente=clienteAtendido.getNombre();
           if(atendidos.add(clienteAtendido)){
               System.out.println("Cliente "+nombreCliente+" atendido correctamente");
           }else{
               throw new ExcepcionPersonalizada("Error, no se pudo atender a "+nombreCliente);
           }
        }
    }
}
