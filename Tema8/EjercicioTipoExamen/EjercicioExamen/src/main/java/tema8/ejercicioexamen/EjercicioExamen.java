/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema8.ejercicioexamen;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author atres
 */
public class EjercicioExamen {

    public static void main(String[] args) {
        EquipoDAO mEquipo = new EquipoDAO();
        JugadoresDAO mJugador = new JugadoresDAO();
        System.out.println("---Mostrar todos los equipos---");
        List<Equipo> listaEquipo = mEquipo.listar();
        for (Equipo e : listaEquipo) {
            e.mostrarEquipo();
        }
        System.out.println("---Mostrar todos los jugadores---");
        List<Jugador> listaJugadores = mJugador.listar();
        for (Jugador j : listaJugadores) {
            j.mostrarJugador();
        }
        System.out.println("");
        /*
        System.out.println("---Crear un nuevo equipo---");
        Equipo e=new Equipo(10,"Arenteiro","1 RFEF","O Carballiño","Espiñedo",4500);
        mEquipo.insertar(e);
        System.out.println("");
        System.out.println("---Crear un nuevo jugador---");
        Equipo eq=mEquipo.porId(1);
        Jugador j=new Jugador(12,"Juanito","Serrano",0,eq);
        mJugador.insertar(j); 
         */
        System.out.println("");
        System.out.println("---Mostrar equipos con sus jugadores---");
        List<String>listar=mJugador.listarEquiposConJugadores();
        Iterator<String>it=listar.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.printf("\n%s\n",s.toString());
        }
    }
}
