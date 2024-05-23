/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz Repositorio y gestiona la tabla libros
 *
 * @author Adrián Tresgallo Arozamena
 */
public class LibroDAOImp implements Repositorio<Libro> {
    LectorImp metodosLector=new LectorImp();

    /**
     * Metodo que conecta con la base de datos
     * @return 
     */
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    /**
     * Metodo que lista los libros
     * @return 
     */
    @Override
    public List<Libro> listar() {
        List<Libro> listaLibros = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT COD_LIBRO,TITULO,AUTOR,COPIAS FROM libros;")) {
            while (rs.next()) {
                Libro l = crearLibro(rs);
                if (!listaLibros.add(l)) {
                    throw new Exception("Error, no se pudo mostrar el libro");
                }
            }

        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaLibros;
    }

    /**
     * Metodo que busca un libro por cod_libro
     * @param cadena
     * @return 
     */
    @Override
    public Libro porCod(String cadena) {
        Libro libroEncontrado = null;
        String sql = "SELECT COD_LIBRO,TITULO,AUTOR,COPIAS FROM libros WHERE COD_LIBRO=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, cadena);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    libroEncontrado = crearLibro(rs);
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return libroEncontrado;
    }

    /**
     * Metodo que inserta un libro a la bd
     * @param t 
     */
    @Override
    public void insertar(Libro t) {
        String sql = "INSERT INTO libros(COD_LIBRO,TITULO,AUTOR,COPIAS)VALUES(?,?,?,?);";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, t.getCodLibro());
            stmt.setString(2, t.getTitulo());
            stmt.setString(3, t.getAutor());
            stmt.setInt(4, t.getCopias());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception("Error ,no se añadió el libro " + t.getTitulo());
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que modifica las copias a la mitad
     * @param cadena 
     */
    @Override
    public void modificar(String cadena) {
        Libro libroEncontrado = porCod(cadena);
        int nCopias = libroEncontrado.getCopias();
        String sql = "UPDATE LIBROS SET COPIAS=? WHERE COD_LIBRO=?;";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            if (libroEncontrado != null) {
                libroEncontrado.setCopias(nCopias /= 2);
                stmt.setInt(1, libroEncontrado.getCopias());
                stmt.setString(2, cadena);
                int salida = stmt.executeUpdate();
                if (salida != 1) {
                    throw new Exception("Error, no se pudo modificar el libro " + libroEncontrado.getTitulo());
                }else{
                    System.out.println("Se ha modificado correctamente");
                }
            } else {
                throw new NullPointerException("Error, el libro " + cadena + " no existe");
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
     * Metodo que elimina el libro
     * @param cadena
     * @return 
     */
    @Override
    public boolean eliminar(String cadena) {
        boolean eliminado = false;
        Libro aux=porCod(cadena);
        String sql = "DELETE FROM LIBROS WHERE COD_LIBRO=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            if (aux != null) {
                stmt.setString(1, cadena);
                int salida = stmt.executeUpdate();
                if(salida==1){
                    eliminado=true;
                }
            } else {
                throw new NullPointerException("Error, el libro " + cadena + " no existe");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
        return eliminado;
    }

    /**
     * Metodo que busca por titulo
     * @param titulo
     * @return 
     */
    public Libro porTitulo(String titulo) {
        Libro libroEncontrado = null;
        String sql = "SELECT COD_LIBRO,TITULO,AUTOR,COPIAS FROM libros WHERE TITULO=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, titulo);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    libroEncontrado = crearLibro(rs);
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return libroEncontrado;
    }

    /**
     * Metodo que crea un libro mediante el resultset
     * @param rs
     * @return
     * @throws SQLException 
     */
    private Libro crearLibro(ResultSet rs) throws SQLException {
        return new Libro(rs.getString("COD_LIBRO"), rs.getString("TITULO"), rs.getString("AUTOR"), rs.getInt("COPIAS"));
    }

    /**
     * Metodo estatico que muestra los datso de la lista
     * @param lista 
     */
    public static void listarLibro(List<Libro> lista) {
        for (Libro l : lista) {
            System.out.printf("\n%s", l.toString());
        }
    }
}
