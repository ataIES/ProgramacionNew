/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

/**
 *
 * @author daw1
 */
public class TarjetaDebito {

    private String nombreTitular;
    private String numeroCuenta;
    private int pin;
    private Habilitar habilitada;
    private double saldo;

    public TarjetaDebito(String nombreTitular, String numeroCuenta, int pin, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
        this.saldo = saldo;
        this.habilitada = habilitada.BLOQUEADA;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Habilitar getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Habilitar habilitada) {
        this.habilitada = habilitada;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//Método que desbloquea nuestra tarjeta
    //Si el pin que introducimos por parámetro es igual al pin, se nos asignará el atributo habilitada a HABILITADA. En caso contrario, seguirá igual

    public void desbloquea(int nuevo_pin) {
        if (pin == nuevo_pin) {
            setHabilitada(habilitada.HABILITADA);
            System.out.println("La tarjeta está habilitada");
        } else {
            System.out.println("La tarjeta está bloqueada");
        }
    }

    /*Método que recibe por parámetros el importe de la compra, el pin, la descripcion de la compra y si introducimos propina o no
    Comprueba si está habilitada nuestra tarjeta, si el podemos realizar la compra y si queremos dar propina nos calcule un 5% más, añadiendo que luego nos imprima el ticket
     */
    public String pagar(double importeCompra, int pin, String descripcion, String propina) {
        String cadena = "";
        double importefinal = 0, importePropina = 0;
        if (habilitada == Habilitar.HABILITADA) {
            if (this.pin == pin) {
                if (saldo >= importeCompra) {
                    if (propina.equals("Si")) {
                        importePropina = importeCompra * 0.05;
                        importefinal += importeCompra + importePropina;
                        saldo -= importefinal;
                        cadena = "\n---TICKET---\n\t" + imprimeTicket() + "\n\tImporte de la Compra: " + String.format("%.2f", importeCompra) + "\n\tDescripción de la compra: " + descripcion
                                + "\n\tCargos: " + importePropina + "\n\tTotal Cargado: " + importefinal;
                    } else {
                        saldo -= importeCompra;
                        cadena = "\n---TICKET---" + imprimeTicket() + "\n\tImporte de la Compra: " + String.format("%.2f", importeCompra) + "\n\tDescripción de la compra: " + descripcion
                                + "\n\tTotal Cargado: " + importeCompra;

                    }
                } else {
                    System.out.println("Error, Importe de la compra mayor");
                }
            }
        } else {
            System.out.println("Error, Tarjeta está bloqueada");
        }
        return cadena;
    }
//Método que nos establece un * después de los primeros 4 dígitos de la cuenta

    private String nCuenta() {
        String cadena = "";
        String ulti = " ";
        for (int i = 4; i < numeroCuenta.length(); i++) {
            ulti += "*";
        }
        return cadena = numeroCuenta.substring(0, 3) + ulti;
    }
//Método que imprime el ticket

    private String imprimeTicket() {
        return "Nombre del Titular: " + nombreTitular + "\nNúmero de Cuenta: " + nCuenta();
    }

}
