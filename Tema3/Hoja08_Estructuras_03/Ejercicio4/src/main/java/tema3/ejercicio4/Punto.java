/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Punto {

    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
//Método que devuelve un String y nos diga en que cuadrante está un punto

    public String cuadrante() {
        String nCuadrante = "";
        if (x < 0 && y > 0) {
            nCuadrante = "Cuadrante II";
        } else if (x < 0 && y < 0) {
            nCuadrante = "Cuandrante III";
        } else if (x > 0 && y > 0) {
            nCuadrante = "Cuadrante I";
        } else if (x > 0 && y < 0) {
            nCuadrante = "Cuadrante IV";
        } else {
            nCuadrante = "Este es el origen de las coordenadas";
        }
        return nCuadrante;
    }

    //Método que devuelve un double que nos diga la distancia entre los dos puntos
    public double distancia(Punto P1, Punto P2) {
        return Math.sqrt((Math.pow((P2.x - P1.x), 2)) + (Math.pow(P2.y, P1.y)));
    }

    //Método que devuelve un objeto del tipo Punto que nos dé el punto medio entre las dos coordenadas
    public Punto puntoMedio(Punto P1, Punto P2) {
        Punto aux = new Punto();
        aux.x = (P1.x + P2.x) / 2;
        aux.y = (P1.y + P2.y) / 2;

        return aux;
    }
//Método para mostrar información del punto
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

}
