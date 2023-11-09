/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2.ejercicio4;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Crear un inventario con 50 telefonos, 30 portátiles, 10 tablets y valorado en 70.690,5
        InventarioElectronico inventario=new InventarioElectronico(50,30,10,70690.5);
        
        //Muestro la información del inventario
        System.out.println(inventario.toString());
        System.out.println("");
        
        //Si estimamos ahora que el precio unitario es 500. Calcular el valor del inventario y mostrarlo por pantalla
        System.out.printf("Valor del inventario: %.2f",inventario.calcularValorInventario(500));
        System.out.println("");
        
        //Realizar venta de 10 tlf, 5 portatiles, 10 tablets al precio anterior
        inventario.realizarVenta(10, 5, 10, 500);
        
        //Mostrar inventario tras 1ºVenta
        System.out.println("----INVENTARIO DESPUÉS DE LA 1ºVENTA---\n"+inventario.toString());
        System.out.println("");
        
        //Realizar venta de 10 tlf, 5 portátiles, 10 tablets, al precio anterior
        inventario.realizarVenta(10, 5, 10, 500);
        
        //Mostrar inventario tras 2ºVenta
        System.out.println("----INVENTARIO DESPUÉS DE LA 2ºVENTA---\n"+inventario.toString());
        System.out.println("");
        
        //Incrementar en 15 las unidades de tablets y mostrar las tablets
        inventario.agregarTablets(15);
        System.out.println("Número de tablets: "+inventario.getnTablets());
        
        
    }
}
