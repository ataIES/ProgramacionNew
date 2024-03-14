/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Jornada jornada1=new Jornada();
        jornada1.setIdJornada(1);
        System.out.println("---Introducir partidos---");
        jornada1.insertarPartidos();
        jornada1.insertarPartidos();
        jornada1.insertarPartidos();
        jornada1.insertarPartidos();
        System.out.println("Número de partidos almacenados: "+jornada1.numeroPartidos());
        System.out.println("---Mostrar todos los partidos---");
        System.out.println(jornada1.mostrarJornada());
        System.out.println("");
        System.out.println("---Eliminar los partidos que no sean empates---");
        jornada1.eliminarPartidoEmpate();
        System.out.println("---Volver a mostrar todos los partidos que han quedado---");
        System.out.println(jornada1.mostrarJornada());
    }
}
