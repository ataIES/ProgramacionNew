/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que contiene metodos de manipular BD
 *
 * @author DAW125
 */
public class MetodosDB {

    private static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    /**
     * Metodo que inserta un Paciente a la BD
     *
     * @param dni
     */
    public static void insertarPaciente(String dni) {
        String sql = "INSERT into pacientes(dni,nombre,telefono)VALUES(?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, dni);
            stmt.setString(2, Teclado.introducirNombre("Introduce su nombre: "));
            stmt.setString(3, Teclado.introTelefono("Introduce su teléfono"));
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado el paciente con dni: " + dni);
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que busca un paciente por dni
     *
     * @param dni
     * @return
     */
    public static Paciente buscarPorDNI(String dni) {
        Paciente p = null;
        String sql = "SELECT dni,nombre,telefono from pacientes WHERE dni=?;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
            try (ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    p = crearPaciente(rs);
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (NullPointerException n) {
            n.getMessage();
        }
        return p;
    }

    /**
     * Metodo que inserta una visita a la bd
     *
     * @param dni
     */
    public static void insertarVisita(String dni) {
        String sql = "INSERT into visitas(dni,fecha,tratamiento,observaciones)VALUES(?,?,?,?);";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, dni);
            stmt.setDate(2, Date.valueOf(Teclado.introFecha()));
            stmt.setString(3, String.valueOf(Teclado.pedirTratamiento()));
            System.out.println("Introduce las observaciones: ");
            stmt.setString(4, new Scanner(System.in).nextLine());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado la visita");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que muestra la agenda de un dia específico
     *
     * @param fecha
     * @return
     */
    public static List<Visita> listarVisitaPorFecha(LocalDate fecha) {
        List<Visita> visitas = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT id,dni,fecha,tratamiento,observaciones from visitas");) {
            LocalDate hoy = LocalDate.now();
            while (rs.next()) {
                Visita visita = crearVisita(rs);
                if (visita.getFecha().isEqual(fecha)) {
                    if (!visitas.add(visita)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return visitas;
    }

    /**
     * Metodo que lista las visitas de un paciente ordenado por DESC
     * @param dni
     * @return 
     */
    public static List<Visita> listarVisitasPaciente(String dni) {
        List<Visita> listaVisitaPaciente = new ArrayList<>();
        String sql = "SELECT id,dni,fecha,tratamiento,observaciones from visitas WHERE dni=? ORDER BY 'DESC'";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Visita visita = crearVisita(rs);
                    if (!listaVisitaPaciente.add(visita)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }

                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return listaVisitaPaciente;
    }

    /**
     * Metodo que crea un Paciente
     *
     * @param rs
     * @return
     * @throws SQLException
     */
    private static Paciente crearPaciente(ResultSet rs) throws SQLException {
        return new Paciente(rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"));
    }

    /**
     * Metodo que crea una visita
     *
     * @param rs
     * @return
     * @throws SQLException
     */
    private static Visita crearVisita(ResultSet rs) throws SQLException {
        Paciente p = buscarPorDNI(rs.getString("dni"));
        return new Visita(rs.getInt("id"), p, rs.getDate("fecha").toLocalDate(), Tratamientos.valueOf(rs.getString("tratamiento")), rs.getString("observaciones"));
    }
}
