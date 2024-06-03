/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ventanas.Departamento;
import ventanas.Profesor;
import ventanas.Solicitud;
import ventanas.TipoProfesor;
import ventanas.TipoSolicitud;

/**
 *
 * @author Admin
 */
public class MetodosBD {

    private static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public List<Profesor> listarProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT id,nombre,cantidad FROM productos");) {
            while (rs.next()) {
                Profesor profesor = crearProfesor(rs);
                if (!profesores.add(profesor)) {

                    throw new Exception("error no se ha insertado el objeto en la Colección");
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return profesores;
    }

    public List<Departamento> listarDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT id,nombre,cantidad FROM productos");) {
            while (rs.next()) {
                Departamento d = crearDepartamento(rs);
                if (!departamentos.add(d)) {

                    throw new Exception("error no se ha insertado el objeto en la Colección");
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return departamentos;
    }

    public static void insertarDepartamentos(File fichero) {
        List<Departamento> listaDepartamento = MetodosFicheros.importarFicheroDepartamento(fichero);
        Departamento d = null;
        String sql = "INSERT into departamento(codDepartamento,nombre,idJefe)VALUES(?,?,?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            Iterator<Departamento> it = listaDepartamento.iterator();
            while (it.hasNext()) {
                d = it.next();
                stmt.setString(1, d.getCodDepartamento());
                stmt.setString(2, d.getNombre());
                stmt.setInt(3, d.getIdJefe());
            }
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el registro");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertarProfesor(File fichero) {
        List<Profesor> listaProfesor = MetodosFicheros.importarFicheroProfesores(fichero);
        Profesor p = null;
        String sql = "INSERT into Profesor(nombre,apellidos,DNI,perfilAcceso,fk_departamento,correo,activo,contraseña)VALUES(?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            Iterator<Profesor> it = listaProfesor.iterator();
            while (it.hasNext()) {
                p = it.next();
                stmt.setString(1, p.getNombre());
                stmt.setString(2, p.getApellidos());
                stmt.setString(3, p.getDni());
                stmt.setString(4, p.getTipoUsuario().name());
                stmt.setInt(5, p.getDepartamento());
                stmt.setString(6, p.getMail());
                stmt.setBoolean(7, p.isActivo());
                stmt.setString(8, p.getContraseña());
            }
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el registro");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertarSolicitud(Solicitud so) {
        Profesor p = null;
        String sql = "INSERT into Solicitud(horaInicio,horaFin,comentarios,prevista,Departamento,titulo,tipo,medioTransporte,profesor,alojamiento,fechaInicio,fechaFinal,totalParticipantes,comenAlojamiento,estado)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setTime(1, Time.valueOf(so.getHoraInicio()));
            stmt.setTime(2, Time.valueOf(so.getHoraFin()));
            stmt.setString(3, so.getComentario());
            stmt.setBoolean(4, so.isPrevista());
            stmt.setInt(5, so.getDepartamento());
            stmt.setString(6, so.getTitulo());
            stmt.setString(7, so.getTipo().name());
            stmt.setBoolean(8, so.isMedioTransporte());
            stmt.setInt(9, so.getProfesor());
            stmt.setBoolean(10, so.isAlojamiento());
            stmt.setDate(11, Date.valueOf(so.getFechaInicio()));
            stmt.setDate(12, Date.valueOf(so.getFechaFin()));
            stmt.setInt(13, so.getTotalParticipantes());
            stmt.setString(14, so.getComenAlojamiento());
            stmt.setString(15, so.getEstado().name());

            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el registro");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Profesor crearProfesor(ResultSet rs) throws SQLException {
        return new Profesor(rs.getInt("idProfesor"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("DNI"), TipoProfesor.valueOf(rs.getString("perfilAcceso")), rs.getInt("fk_departamento"), rs.getString("correo"), rs.getString("contraseña"), rs.getBoolean("activo"));
    }

    private Departamento crearDepartamento(ResultSet rs) throws SQLException {
        return new Departamento(rs.getInt("iddepartamento"), rs.getString("codDepartamento"), rs.getString("nombre"), rs.getInt("idJefe"));
    }
}
