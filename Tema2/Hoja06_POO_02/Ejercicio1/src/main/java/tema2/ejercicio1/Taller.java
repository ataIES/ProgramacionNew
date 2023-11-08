/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author atres
 */
public class Taller {
    private int aceite;
    private int ruedas;
    private int contCambiosTotales;
    private int contCambiosParciales;

    //Constructor con parametros de número de bidones de aceite y número de ruedas 
    public Taller(int aceite, int ruedas) {
        //Convierto los bidones en litros
        this.aceite = aceite*5;
        this.ruedas = ruedas;
        contCambiosTotales=0;
        contCambiosParciales=0;
    }
    
    //Creo un constructor copia
    public Taller(Taller t){
        this.aceite=t.aceite;
        this.ruedas=t.ruedas;
        this.contCambiosParciales=t.contCambiosParciales;
        this.contCambiosTotales=t.contCambiosTotales;
    }
    //Paso por parámetros número de bidones de aceite y los convierto en litros
    public void addAceite(int nuevoAceite){
        aceite+=(nuevoAceite*5);
    }
    public void addRuedas(int nuevaRuedas){
        ruedas+=nuevaRuedas;
    }

    public int getCambiosParciales() {
        return contCambiosParciales;
    }

    public int getCambiosTotales() {
        return contCambiosTotales;
    }
    public void cambioCompleto(){
        if(aceite>=3 && ruedas>=4){
            aceite-=3;
            ruedas-=4;
            contCambiosTotales++;
        }else{
            System.out.println("Ya no puedes realizar más cambios completos");
        }
    }
    
    public void cambioParcial(){
        if(aceite>=3 && ruedas>=2){
            aceite-=3;
            ruedas-=2;
            contCambiosParciales++;
        }else{
            System.out.println("Ya no puedes hacer más cambios parciales");
        }
    }

    public int getAceite() {
        return aceite;
    }

    public int getRuedas() {
        return ruedas;
    }
    
     public double ingresos() {
        int parciales = (5 * aceite) + (60 * ruedas);
        double totales = (4.5 * aceite) + (50 * ruedas);

        return parciales + totales;
    }
    @Override
    public String toString() {
        return "Taller{" + "aceite=" + aceite + ", ruedas=" + ruedas + ", contCambiosTotales=" + contCambiosTotales + ", contCambiosParciales=" + contCambiosParciales + '}';
    }
    
    
    
}
