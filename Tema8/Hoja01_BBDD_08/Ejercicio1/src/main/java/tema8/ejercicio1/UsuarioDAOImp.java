/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAW125
 */
public class UsuarioDAOImp implements Repositorio<Usuario> {

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try (Statement stm = getConnection().createStatement(); ResultSet rs = stm.executeQuery("SELECT * FROM usuarios;");) {
            while (rs.next()) {
                Usuario usu = crearUsuario(rs);
                if (!listaUsuarios.add(usu)) {
                    throw new Exception("Error, no se pudo insertar el usuario " + usu.getUsername() + "a la colección");
                }
            }
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaUsuarios;
    }

    @Override
    public Usuario porId(int id) {
        Usuario usu = null;
        String sql = "SELECT * FROM usuarios WHERE id=?";
        try (PreparedStatement pst = getConnection().prepareStatement(sql);) {
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    usu = crearUsuario(rs);
                }
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return usu;
    }

    @Override
    public void guardar(Usuario t) {
        String sql = null;
        if (t.getId() > 0) {
            sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
        } else {
            sql = "INSERT into usuarios(username,password,email)VALUES(?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            if (t.getId() > 0) {
                stmt.setInt(4, t.getId());
            }
            t.setUsername(Teclado.introUsername("Introduce el nuevo nombre de usuario: "));
            t.setPassword(Teclado.introPassword("Introduce la nueva contraseña: "));
            t.setEmail(Teclado.introCorreoElectronico("Introduce el nuevo correo electrónico: "));
            stmt.setString(1, t.getUsername());
            stmt.setString(2, encriptacionMD5(t.getPassword()));
            stmt.setString(3, t.getEmail());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            } else {
                System.out.println("Se ha eliminado el usuario con id " + id);
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertar(Usuario t) {
        String sql = "INSERT into usuarios(username,password,email)VALUES(?,?,?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, t.getUsername());
            stmt.setString(2, encriptacionMD5(t.getPassword()));
            stmt.setString(3, t.getEmail());
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

    @Override
    public void actualizar(Usuario t) {
        String sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            t.setUsername(Teclado.introUsername("Introduce el nuevo nombre de usuario: "));
            t.setPassword(Teclado.introPassword("Introduce la nueva contraseña: "));
            t.setEmail(Teclado.introCorreoElectronico("Introduce el nuevo correo electrónico: "));
            stmt.setInt(4, t.getId());
            stmt.setString(1, t.getUsername());
            stmt.setString(2, encriptacionMD5(t.getPassword()));
            stmt.setString(3, t.getEmail());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificadp el registro");
            }
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("email"));
    }

    private String encriptacionMD5(String pasw) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pasw.getBytes());
            BigInteger numero = new BigInteger(1, messageDigest);
            String hashText = numero.toString(16);

            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void listarUsuario(List<Usuario> lista) {
        for (Usuario usu : lista) {
            System.out.println(usu.toString() + "\n");
        }
    }

}
