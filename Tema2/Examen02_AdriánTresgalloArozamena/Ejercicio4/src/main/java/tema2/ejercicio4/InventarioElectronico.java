/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio4;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class InventarioElectronico {

    private int nTelefonos;
    private int nPortatil;
    private int nTablets;
    private double dinero_caja;

    //Constructor con parámetros
    public InventarioElectronico(int nuevoTelefonos, int nuevoPortatil, int nuevoTablets, double nuevo_dinero_caja) {
        this.nTelefonos = nuevoTelefonos;
        this.nPortatil = nuevoPortatil;
        this.nTablets = nuevoTablets;
        this.dinero_caja = nuevo_dinero_caja;
    }

    //Metodo que agrega una cantidad nueva de tablets. Tiene que ser la cantidad positiva
    public void agregarTablets(int numero_tablets) {
        int nuevaCantidad = 0;
        /*Creo una condición con ternarios, controlando que el número introducido por parámetros es positvo.
        Si es positivo me sumará la cantidad, pero si no es número positivo, no se añadirá ninguna tablet más
         */
        nTablets+=(numero_tablets>0)?numero_tablets:0;
    }

    //Metodo para calcular el valor total del inventario, el precio de venta es unitario para todos los productos y lo pasaremos por parámetros
    public double calcularValorInventario(int precioVenta) {
        return (nTelefonos * precioVenta) + (nPortatil * precioVenta) + (nTablets * precioVenta);
    }

    //Método que realiza una venta pasando por parámetros las unidades de cada producto que vamos a vender
    public void realizarVenta(int cantidad_telefonos, int cantidad_portatiles, int cantidad_tablets, int precio_venta) {
        double dinero_venta = 0;
        //Calculo el dinero que obtendremos por la venta de los productos,controlando siempre que la cantidad vendida no sea mayor de la que tengamos
        dinero_venta = (((cantidad_telefonos <= nTelefonos) ? cantidad_telefonos : 0) * precio_venta) + (((cantidad_portatiles <= nPortatil) ? cantidad_portatiles : 0) * precio_venta) + (((cantidad_tablets <= nTablets) ? cantidad_tablets : 0) * precio_venta);
        
        //Creo condiciones para restar y controlar que la venta sea mayor de lo que tenemos;
        dinero_caja = ((cantidad_telefonos <= nTelefonos) || (cantidad_portatiles <= nPortatil) || (cantidad_tablets <= nTablets)) ? dinero_caja += dinero_venta : dinero_caja;
        //Siendo que la cantidad que vendemos tiene que ser menor de la que ya tenemos para poder restar las cantidades vendidas a lo que tenemos en el almacén
        nTelefonos -= (cantidad_telefonos <= nTelefonos) ? cantidad_telefonos : 0;
        nPortatil -= (cantidad_portatiles <= nPortatil) ? cantidad_portatiles : 0;
        nTablets -= (cantidad_tablets <= nTablets) ? cantidad_tablets : 0;

    }

    public int getnTablets() {
        return nTablets;
    }

    @Override
    public String toString() {
        return "INVENTARIO ELECTRONICO" + "\n\tTeléfonos=" + nTelefonos + " unidades \n\tPortátiles=" + nPortatil + " unidades \n\tTablets=" + nTablets + " unidades \nDINERO EN CAJA: " + String.format("%.2f", dinero_caja)+"€";
    }

}
