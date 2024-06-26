/*
 * Las prepared statements, también llamadas consultas, comandos o sentencias preparadas, 
son plantillas para consultas a sistemas de bases de datos en lenguaje SQL cuyos parámetros están desprovistos de valores. 
Para reemplazar dichos valores, estas plantillas trabajan con variables o marcadores de posición, 
que no son sustituidos por los valores reales hasta estar dentro del sistema. 
Cuando las consultas se introducen a mano, en cambio, los valores se asignan en el mismo momento de ejecutarlas.

La principal razón para utilizar sentencias preparadas cuando se trabaja con sistemas de gestión de bases de datos como MySQL 
no es otra que la seguridad.
 */
package bd.ejemplo02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pe
 */
public class FuncionesBD {

    // ejecuta una consulta preparada con el paramétro cantidad
    public static void getProductosCantidad(int cantidad) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        String sql = "SELECT id,nombre,cantidad from productos where cantidad > ? ";
        try {
            //Consulta preparada
            ps = conn.prepareStatement(sql);
            // indico que para el primer parámetro el valor pasado por parámetro
            ps.setInt(1, cantidad);
            rs = ps.executeQuery();
            System.out.println("Productos con cantidad > que : "
                    + cantidad + "\n");
            while (rs.next()) {
                System.out.println(rs.getString("nombre")
                        + " con cantidad: "
                        + rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("error en la ejecución getProductosCantidad " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    rs.close();
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar sentencia ");
            }
        }

    }

    // si queremos utilizar que el try realice el cierre automático no permite acciones de sustitución
    //así que solo puede cerrar PreparedStatement y hay que realizar el cierre del resultset
    public static void getProductosCantidad2(int cantidad) {

        String sql = "SELECT id,nombre,cantidad from productos where cantidad > ? ";
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            //Consulta preparada
            // indico que para el primer parámetro el valor pasado por parámetro
            ps.setInt(1, cantidad);
            try ( ResultSet rs = ps.executeQuery();) {
                System.out.println("Productos con cantidad > que : " + cantidad + "\n");
                while (rs.next()) {
                    System.out.println(rs.getString("nombre")
                            + " con cantidad: "
                            + rs.getInt(3));
                }
            }
        } catch (SQLException ex) {
            System.out.println("error en la ejecución de getProductoCantidad2 " + ex.getMessage());
        } 

    }

    // insertar productos sin cierre automatico
    public static void insertarProductosBD(String nombre, int cantidad) {

        PreparedStatement ps = null;
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        // insert preparada
        String sql = "INSERT INTO productos (nombre,cantidad) VALUES (?,?)";
        try {

            ps = conn.prepareStatement(sql);
            // indico que para el primer parámetro el valor pasado por parámetro String nombre
            ps.setString(1, nombre);
            // indico que para el segundo parámetro el valor pasado por parámetro int cantidad
            ps.setInt(2, cantidad);
            int salida = ps.executeUpdate();
            if (salida == 1) {
                System.out.println("Ha sido insertado el producto");
            } else {
                throw new Exception("Error no se ha realizado la inserción");
            }
        } catch (SQLException ex) {
            System.out.println("error en la ejecución de insertarProductoBD " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la sentencia ");
            }
        }
    }

    // insertar información en la tabla con cierre automático
    public static void insertarProductos2BD(String nombre, int cantidad) {
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        // insert preparada
        String sql = "INSERT INTO productos (nombre,cantidad) VALUES (?,?)";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            // indico que para el primer parámetro el valor pasado por parámetro String nombre
            ps.setString(1, nombre);
            // indico que para el segundo parámetro el valor pasado por parámetro int cantidad
            ps.setInt(2, cantidad);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("Ha sido insertado el producto");
            } else {
                throw new Exception("Error no se ha realizado la inserción");
            }

        } catch (SQLException ex) {
            System.out.println("error en la ejecución de la sentencia " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
