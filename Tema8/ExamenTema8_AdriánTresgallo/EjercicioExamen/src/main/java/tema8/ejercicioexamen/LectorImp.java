/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que no implementa la interfaz Repositorio y gestiona la tabla Lector
 *
 * @author Adrian Tresgallo Arozamena
 */
public class LectorImp {

    /**
     * Metodo que conecta con la bd
     * @return 
     */
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    /**
     * Metodo que lista los lectores
     *
     * @return
     */
    public List<Lector> listar() {
        List<Lector> listaLectores = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT lectores.ID,lectores.NOMBRE,lectores.COD_LIBRO,lectores.FECHA_PRESTAMO FROM lectores INNER JOIN libros on lectores.COD_LIBRO = libros.COD_LIBRO;")) {
            while (rs.next()) {
                Lector l = crearLector(rs);
                if (!listaLectores.add(l)) {
                    throw new Exception("Error, no se pudo mostrar el lector");
                }
            }

        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaLectores;
    }

    /**
     * Metodo que inserta un lector
     * @param l 
     */
    public void insertar(Lector l) {
        String sql = "INSERT INTO lectores(NOMBRE,COD_LIBRO,FECHA_PRESTAMO)VALUES(?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, l.getNombre());
            stmt.setString(2, l.getLibro().getCodLibro());
            stmt.setDate(3, Date.valueOf(l.getFecha_prestamo()));
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception("Error ,no se añadió el lector " + l.getNombre());
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que busca un lector por nombre
     * @param cadena
     * @return 
     */
    public Lector porNombre(String cadena) {
        Lector lectorEncontrado = null;
        String sql = "SELECT ID,NOMBRE,COD_LIBRO,FECHA_PRESTAMO FROM LECTORES WHERE NOMBRE=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, cadena);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    lectorEncontrado = crearLector(rs);
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return lectorEncontrado;
    }

    /**
     * Metodo que modifica el libro que tenga prestado un lector
     * @param cadena 
     */
    public void modificar(String cadena) {
        Lector lectorEncontrado = porNombre(cadena);
        String sql = "UPDATE LECTORES SET COD_LIBRO=? WHERE NOMBRE=?;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            if (lectorEncontrado != null) {
                lectorEncontrado.setLibro(null);
                stmt.setString(1, "");
                stmt.setString(2, cadena);
                int salida = stmt.executeUpdate();
                if (salida != 1) {
                    throw new Exception("Error, no se pudo modificar el lector " + lectorEncontrado.getNombre());
                } else {
                    System.out.println("Se ha modificado correctamente");
                }
            } else {
                throw new NullPointerException("Error, el lector " + cadena + " no existe");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Metodo que lista los lectores de un libro
     * @param codigoLibro
     * @return 
     */
    public List<Lector> listarLectores(String codigoLibro) {
        String sql = "SELECT lectores.ID,lectores.NOMBRE,lectores.COD_LIBRO,lectores.FECHA_PRESTAMO FROM lectores INNER JOIN libros on lectores.COD_LIBRO = libros.COD_LIBRO WHERE libros.COD_LIBRO=?;";
        List<Lector> listaLectores = new ArrayList<>();
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, codigoLibro);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Lector l = crearLector(rs);
                    if (!listaLectores.add(l)) {
                        throw new Exception("Error, no se pudo mostrar el lector");
                    }
                }

            }

        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaLectores;
    }

    /**
     * Metodo que lista los lectores ordenados por fecha_prestamo
     * @return 
     */
    public List<Lector> listarFechaPrestamo() {
        List<Lector> listaLectores = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT lectores.ID,lectores.NOMBRE,lectores.COD_LIBRO,lectores.FECHA_PRESTAMO FROM lectores INNER JOIN libros on lectores.COD_LIBRO = libros.COD_LIBRO ORDER BY lectores.FECHA_PRESTAMO;")) {
            while (rs.next()) {
                Lector l = crearLector(rs);
                if (!listaLectores.add(l)) {
                    throw new Exception("Error, no se pudo mostrar el lector");
                }
            }

        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaLectores;
    }

    /**
     * Metodo que elimina un lector
     * @param cadena
     * @return 
     */
    public boolean eliminar(String cadena) {
        boolean eliminado = false;
        Lector aux = porNombre(cadena);
        String sql = "DELETE FROM LECTORES WHERE NOMBRE=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            if (aux != null) {
                stmt.setString(1, cadena);
                int salida = stmt.executeUpdate();
                if(salida==1){
                    eliminado=true;
                }
            } else {
                throw new NullPointerException("Error, el lector " + cadena + " no existe");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
        return eliminado;
    }

    /**
     * Metodo que recorre una lista de lectores y la muestra
     *
     * @param lista
     */
    public static void listarLector(List<Lector> lista) {
        for (Lector l : lista) {
            System.out.printf("\n%s", l.toString());
        }
    }

    /**
     * Metodi que crea un lector a partir de los resultset
     *
     * @param rs
     * @return
     * @throws SQLException
     */
    private Lector crearLector(ResultSet rs) throws SQLException {
        LibroDAOImp metodoLibro = new LibroDAOImp();
        Libro libroaux = metodoLibro.porCod(rs.getString("COD_LIBRO"));
        return new Lector(rs.getInt("ID"), rs.getString("NOMBRE"), libroaux, rs.getDate("FECHA_PRESTAMO").toLocalDate());
    }
}
