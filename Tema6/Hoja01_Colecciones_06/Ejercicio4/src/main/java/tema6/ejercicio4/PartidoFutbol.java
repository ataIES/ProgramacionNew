/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4;

/**
 *
 * @author DAW125
 */
public class PartidoFutbol {
  
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public PartidoFutbol() {
        this.equipoLocal = Teclado.validarCadena("Introduce el nombre del equipo Local: ");
        this.golesLocal = Teclado.validarEntero("Introduce sus goles: ");
        this.equipoVisitante = Teclado.validarCadena("Introduce el nombre del equipo Visitante: ");
        this.golesVisitante = Teclado.validarEntero("Introduce sus goles: ");
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

  

  

    public String mostrarPartido() {
        String cadena = "\n---Partido---\n" + getEquipoLocal() + " vs" + getEquipoVisitante()
                + "\n" + getGolesLocal() + "\t " + getGolesVisitante();

        return cadena;
    }
}
