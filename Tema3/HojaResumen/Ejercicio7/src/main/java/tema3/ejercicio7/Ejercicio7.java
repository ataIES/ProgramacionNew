/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio7;

/**
 *
 * @author DAW125
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        CuentaAhorro cuenta1=new CuentaAhorro(2000,"Adrian");
        CuentaAhorro cuenta2=new CuentaAhorro(1500,"Laura");
        
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println("");
        System.out.println(cuenta2.getDatosCuenta());
        System.out.println("");
        System.out.println("Ingreso de 300 euros en cuenta1");
        cuenta1.realizarIngreso(300);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println("");
        System.out.println("Reintegro de 500 euros en cuenta2");
        cuenta2.realizarIntegro(500);
        System.out.println(cuenta2.getDatosCuenta());
        System.out.println("");
        System.out.println("Transferencia de 1000 euros de cuenta2 a cuenta1");
        cuenta1.realizarTransferenciaEntreCuentas(cuenta2, 1000);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println("");
        System.out.println(cuenta2.getDatosCuenta());
    }
}
