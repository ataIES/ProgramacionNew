/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Banco {

    private Cliente[] clientes;
    private int cont;

    public Banco(int nClientes) {
        this.clientes = new Cliente[nClientes];
        this.cont = 0;
    }
//Metodo para ingresar lLientes

    public void ingresarCliente() {
        if (this.cont < clientes.length) {
            for (int i = 0; i < clientes.length; i++) {
                Cliente c = new Cliente();
                c.setCodigo(this.cont + 1);
                clientes[i] = c;
                System.out.println("Cliente ingresado");
                this.cont++;
            }
        } else {
            System.out.println("No se puede añadir más clientes");
        }

    }
//Mostrar los clientes del banco

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            cadena += clientes[i].toString() + "\n";
        }
        return cadena;
    }
//Buscar un cliente por el código que pasamos por parámetros

    public String buscar(int codigo) {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            if (clientes[i].getCodigo() == codigo) {
                cadena = clientes[i].toString();
            }
        }
        return cadena;
    }
//Eliminar un cliente

    public void eliminar() {
        Scanner teclado = new Scanner(System.in);
        int codigo = 0;
        System.out.println("Introduce el código del cliente a eliminar: ");
        codigo = teclado.nextInt();

        int id = codigo - 1;

        for (int i = 0; i < cont; i++) {
            if (clientes[i].getCodigo() == id) {
                for (int a = id; a < cont; a++) {
                    clientes[a].setCodigo(clientes[a + 1].getCodigo());
                    clientes[a].setNombre(clientes[a + 1].getNombre());
                    clientes[a].setApellidos(clientes[a + 1].getApellidos());
                    clientes[a].setTelefono(clientes[a + 1].getTelefono());
                    clientes[a].setSaldo(clientes[a + 1].getSaldo());
                    System.out.println("Cliente con el código " + codigo + " borrado correctamente");
                }
            } else {
                System.out.println("No existe el cliente con el código " + codigo);
            }
        }
    }

}
