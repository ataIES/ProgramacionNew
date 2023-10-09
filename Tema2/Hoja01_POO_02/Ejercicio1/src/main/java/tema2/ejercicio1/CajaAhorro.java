/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class CajaAhorro {

    private int saldo;
    private int transacciones;
    
    //contructor sin parámetros
    public CajaAhorro(){
        saldo=0;
        transacciones=0;
    }
    //contructor que recibe saldo inicial
    public CajaAhorro(int saldo_inicial){
        saldo=saldo_inicial;
        transacciones=1;
    }

    public void depositar(int cantidad) {
        this.saldo += cantidad;
        transacciones++;
    }

    public void girar(int cantidad) {
        this.saldo -= cantidad;
        transacciones++;
    }

    public int obtenerSaldo() {
        return saldo;
    }

    public int obtenerTransacciones() {
        return transacciones;
    }
}
