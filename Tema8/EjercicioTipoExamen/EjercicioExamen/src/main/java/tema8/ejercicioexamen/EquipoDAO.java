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
public class EquipoDAO implements Repositorio<Equipo> {

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Equipo> listar() {
        List<Equipo> listaEquipo = new ArrayList<>();
        String sql = "SELECT idequipo,nombre_equipo,categoria,ciudad,estadio,aforo FROM equipos;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Equipo equipo = crearEquipo(rs);
                    if (!listaEquipo.add(equipo)) {
                        throw new Exception("Error, no se pudo añadir a la lista");
                    }
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaEquipo;
    }

    @Override
    public Equipo porId(int id) {
        Equipo e = null;
        String sql = "SELECT idequipo,nombre_equipo,categoria,ciudad,estadio,aforo FROM equipos WHERE idequipo=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    e = crearEquipo(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return e;
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar(Equipo t) {
         String sql = "INSERT into equipos(idequipo,nombre_equipo,categoria,ciudad,estadio,aforo)VALUES(?,?,?,?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setInt(1, t.getIdEquipo());
            stmt.setString(2, t.getNombre());
            stmt.setString(3, t.getCategoria());
            stmt.setString(4,t.getCiudad());
            stmt.setString(5, t.getEstadio());
            stmt.setInt(6, t.getAforo());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el equipo con id: " + t.getIdEquipo());
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Equipo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Equipo crearEquipo(ResultSet rs) throws SQLException {
        return new Equipo(rs.getInt("idequipo"), rs.getString("nombre_equipo"), rs.getString("categoria"), rs.getString("ciudad"), rs.getString("estadio"), rs.getInt("aforo"));
    }

}
