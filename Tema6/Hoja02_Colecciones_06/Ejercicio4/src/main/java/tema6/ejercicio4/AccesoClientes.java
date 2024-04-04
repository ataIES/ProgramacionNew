/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DAW125
 */
public class AccesoClientes {

    private Queue<Cliente> llegados;
    private Queue<Cliente> atendidos;

    public AccesoClientes() {
        this.llegados = new LinkedList<>();
        this.atendidos = new LinkedList<>();
    }

    public void aniadirCliente(Cliente cliente) {
        String nombreCliente = cliente.getNombre();
        try {
            if (llegados.add(cliente)) {
                System.out.println("Cliente " + nombreCliente + " añadido correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo añadir el cliente");
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public void atenderCliente() {
        Cliente clienteAtendido = llegados.peek();
        String nombreCliente = clienteAtendido.getNombre();
        try {

            if (atendidos.add(clienteAtendido)) {
                System.out.println("...Establece una fecha de atención...");
                clienteAtendido.setFechaAtencion(LocalDateTime.now());
                borrarCliente(llegados, nombreCliente);
                System.out.println("Cliente " + nombreCliente + " atendido correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo atender a " + nombreCliente);
            }

        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    private void borrarCliente(Queue<Cliente> lista, String nombre) throws ExcepcionPersonalizada {
        Cliente clienteBorrado = null;
        int tamanoLista = lista.size();

        clienteBorrado = lista.poll();
        if (lista.size() == tamanoLista) {
            throw new ExcepcionPersonalizada("Error, no se pudo borrar al Cliente " + nombre);
        }
    }


    public long tiempoMedioEspera() {
        long tiempoMedio = 0, tiempoTotal=0;
        int minutos=0, horas=0,dias=0,mes=0,anio=0;
        for (Cliente c : llegados) {
           tiempoTotal+= Duration.between(c.getFechaLlegada(), LocalDateTime.now()).getSeconds();
        }
        tiempoMedio=tiempoTotal/llegados.size();
          
        return tiempoMedio;
        
    }

    private String mostrarListas(Queue<Cliente> lista) {
        String cadena = "";
        for (Cliente c : lista) {
            cadena += c.mostrarCliente()+"\n";
        }
        return cadena;
    }

    public String mostrarClientes() {
        String cadena = "";

        cadena = String.format("\n\t...Lista Clientes en Espera... \n%s\n\t...Lista Clientes Atendidos...\n%s", mostrarListas(llegados), mostrarListas(atendidos));

        return cadena;
    }
}
