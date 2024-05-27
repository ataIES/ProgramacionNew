/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio1;

import java.io.Serializable;

/**
 *
 * @author DAW125
 */
public class Factura implements Serializable {

    private int nFactura;
    private String nombreCliente;
    private double importe;
    private boolean pagado;

    public Factura() {
    }

    public Factura(int nFactura, String nombreCliente, double importe, boolean pagado) {
        this.nFactura = nFactura;
        this.nombreCliente = nombreCliente;
        this.importe = importe;
        this.pagado = pagado;
    }

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    /**
     * Metodo que formatea los boolean
     * @param pagado
     * @return 
     */
    private String formatoBoolean(boolean pagado) {
        return pagado ? "Si" : "No";
    }

    @Override
    public String toString() {
        return "Factura{" + "nFactura=" + nFactura + ", nombreCliente=" + nombreCliente + ", importe=" + String.format("%.2f€", importe) + ", pagado=" + formatoBoolean(pagado) + '}';
    }

}
