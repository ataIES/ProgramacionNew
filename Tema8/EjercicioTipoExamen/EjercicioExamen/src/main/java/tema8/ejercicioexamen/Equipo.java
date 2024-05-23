/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

/**
 *
 * @author atres
 */
public class Equipo {
    private int idEquipo;
    private String nombre;
    private String categoria;
    private String ciudad;
    private String estadio;
    private int aforo;

    /**
     * Constructor sin parámetros
     */
    public Equipo() {
    }

    /**
     * Constructor por parámetros
     * @param idEquipo
     * @param nombre
     * @param categoria
     * @param ciudad
     * @param aforo 
     */
    public Equipo(int idEquipo, String nombre, String categoria, String ciudad, String estadio, int aforo) {   
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.aforo = aforo;
    }

    /**
     * Get y Set
     * @return 
     */
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    /**
     * Metodo que muestra la informacion de un equipo
     */
    public void mostrarEquipo(){
        System.out.printf("\nNombreEquipo: %s\nCategoría: %s\nCiudad: %s\nAforo: %d\n",nombre,categoria,ciudad,aforo);
    }
}
