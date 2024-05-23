/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

/**
 *
 * @author atres
 */
public class Jugador {
    private int idJugador;
    private String nombre;
    private String apellidos;
    private int goles;
    private Equipo equipo;

    /**
     * Constructor sin parámetros
     */
    public Jugador() {
    }

    /**
     * Constructor con parámetros
     * @param idJugador
     * @param nombre
     * @param apellidos
     * @param goles
     * @param equipo 
     */
    public Jugador(int idJugador, String nombre, String apellidos, int goles, Equipo equipo) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.goles = goles;
        this.equipo = equipo;
    }

    /**
     * Get y Set
     * @return 
     */
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    /**
     * Metodo que muestra los datos de un jugador
     */
    public void mostrarJugador(){
        System.out.printf("\nNombre: %s\nApellido: %s\nGoles: %d\nEquipo: %s\n",nombre,apellidos,goles,equipo.getNombre());
    }
}
