/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author atres
 */
public class JugadoresDAO {

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public List<Jugador> listar() {
        List<Jugador> listaJugador = new ArrayList<>();
        String sql = "SELECT idjugador,nombre_jugador,apellidos,goles,idequipo FROM jugadores;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Jugador jugador = crearJugador(rs);
                    if (!listaJugador.add(jugador)) {
                        throw new Exception("Error, no se pudo añadir a la lista");
                    }
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaJugador;
    }

    public Jugador porId(int id) {
        Jugador e = null;
        String sql = "SELECT idjugador,nombre_jugador,apellidos,goles,idequipo FROM jugadores WHERE idequipo=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    e = crearJugador(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return e;
    }

    public void insertar(Jugador j) {
        String sql = "INSERT into jugadores(idjugador,nombre_jugador,apellidos,goles,idequipo)VALUES(?,?,?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setInt(1, j.getIdJugador());
            stmt.setString(2, j.getNombre());
            stmt.setString(3, j.getApellidos());
            stmt.setInt(4, j.getGoles());
            stmt.setInt(5, j.getEquipo().getIdEquipo());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el jugador con id " + j.getIdJugador());
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> listarEquiposConJugadores() {
        List<String> lista = new ArrayList<>();
        String[]listar=new String[3];
        String sql = "SELECT equipos.nombre_equipo,jugadores.nombre_jugador,jugadores.apellidos from equipos INNER JOIN jugadores on equipos.idequipo =jugadores.idequipo;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    listar[0]=rs.getString("equipos.nombre_equipo");
                    listar[1]=rs.getString("jugadores.nombre_jugador");
                    listar[2]=rs.getString("jugadores.apellidos");
                    for(int a=0;a<3;a++){
                        lista.add(listar[a]);
                    }
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    private Jugador crearJugador(ResultSet rs) throws SQLException {
        EquipoDAO metodosequipo = new EquipoDAO();
        Equipo e = metodosequipo.porId(rs.getInt("idequipo"));
        return new Jugador(rs.getInt("idjugador"), rs.getString("nombre_jugador"), rs.getString("apellidos"), rs.getInt("goles"), e);
    }
}
