/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio2;

/**
 *
 * @author daw1
 */
public class Ticket {

    private float kilos_naranjas;

    public Ticket(float kilos_naranjas) {
        this.kilos_naranjas = kilos_naranjas;
    }
    //Metodo que calcula el importe total de la venta de naranjas
    public float importeTotal() {
        float importeTotal = 0;
        if (kilos_naranjas >= 10) {
            importeTotal = kilos_naranjas * 1.2f;
        } else {
            importeTotal = kilos_naranjas * 1.5f;
        }
        return importeTotal;

    }

    public float getKilos_naranjas() {
        return kilos_naranjas;
    }
    

    public String imprimir() {
<<<<<<< HEAD
        return "Número de Kilos de Naranjas Vendidos: "+kilos_naranjas+"\nImporte Total: "+importeTotal();
=======
        return "Número de Kilos de Naranjas Vendidos: "+kilos_naranjas+"\nImporte Total: "+String.format("%.2f", importeTotal());
>>>>>>> dd64dbd6e6e4d3ccc5858bc73aa2969f81037c5f
    }

}
