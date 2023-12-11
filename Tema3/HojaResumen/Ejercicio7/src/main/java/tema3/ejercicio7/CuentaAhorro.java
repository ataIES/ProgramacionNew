/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio7;

/**
 *
 * @author DAW125
 */
public class CuentaAhorro {

    private double saldoCuenta;
    private String titular;
    private long numeroCuenta;

    public CuentaAhorro(double saldoCuenta, String titular) {
        this.saldoCuenta = saldoCuenta;
        this.titular = titular;
        this.numeroCuenta = (long) (Math.floor(Math.random() * (1000000 - 1000 + 1)) + 1000);
    }

    public double realizarIngreso(double saldo) {
        return this.saldoCuenta += saldo;
    }

    public void realizarIntegro(double saldo) {
        double saldoActual = 0;
        if (saldo <= saldoCuenta) {
            saldoCuenta -= saldo;
        } else {
            System.out.println("Error, extraer mayor saldo de el que tienes");
        }
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getDatosCuenta() {
        return "----DATOS DE LA CUENTA---- \n\tTitular: " + titular + "\n\tSaldo Actual: " + String.format("%.2f", saldoCuenta) + "\n\tNúmero de Cuenta: " + numeroCuenta;
    }

    public void realizarTransferenciaEntreCuentas(CuentaAhorro c2, double saldoTrans) {
        if (saldoCuenta <= saldoTrans) {
            c2.realizarIngreso(saldoTrans);
            saldoCuenta -= saldoTrans;

        } else {
            System.out.println("Error, quieres transferir más saldo de el que tienes");
        }

    }

}
