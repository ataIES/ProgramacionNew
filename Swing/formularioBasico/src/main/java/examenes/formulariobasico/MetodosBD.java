/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes.formulariobasico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class MetodosBD {
    // metodo privado que nos devuelve la conexión

    protected static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }


  
    // recuperamos objeto por clave primaria

    
    
    // insertar Usuario

    public static void guardar(Usuario usuario) {
        String sql = "INSERT INTO usuarios(username, password, email) VALUES (?,md5(?),?)";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado un solo registro de pacientes");
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    private static Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("ID"), rs.getString("username"), rs.getString ("password"), rs.getString("email"));
    }

   
}
