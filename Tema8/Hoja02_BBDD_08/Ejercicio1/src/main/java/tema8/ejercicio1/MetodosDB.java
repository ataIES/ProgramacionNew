/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
     * @param p Objeto de tipo Paciente
     */
    public static void insertarPaciente(String dni) {
        String sql = "INSERT into pacientes(dni,nombre,telefono)VALUES(?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, dni);
            stmt.setString(2, Teclado.introducirNombre("Introduce su nombre: "));
            stmt.setString(3,Teclado.introTelefono("Introduce su teléfono"));
            int salida=stmt.executeUpdate();
            if(salida!=1){
                 throw new Exception(" No se ha insertado el paciente con dni: "+dni);
            }
        }catch(SQLException s){
            System.out.println(s.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que busca un paciente por dni
     * @param dni
     * @return 
     */
    public static Paciente buscarPorDNI(String dni) {
        Paciente p = null;
        String sql = "SELECT dni,nombre,telefono from pacientes WHERE dni=?;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql); ResultSet rs = stmt.executeQuery();) {
            stmt.setString(1, dni);
            if (rs.next()) {
                p = crearPaciente(rs);
            }
            if(p==null){
                throw new NullPointerException("Error, no existe el paciente con dni "+dni);
            }
        }catch(SQLException s){
            System.out.println(s.getMessage());
        }catch(NullPointerException n){
            n.getMessage();
        }
        return p;
    }

    /**
     * Metodo que crea un Paciente
     * @param rs
     * @return
     * @throws SQLException 
     */
    private static Paciente crearPaciente(ResultSet rs) throws SQLException {
        return new Paciente(rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"));
    }
}
