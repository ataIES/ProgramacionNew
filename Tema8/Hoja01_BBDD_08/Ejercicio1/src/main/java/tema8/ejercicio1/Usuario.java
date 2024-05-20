/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    private String email;

    
    public Usuario(){
        this.id=0;
        this.username=Teclado.introUsername("Introduce el username: ");
        this.password=Teclado.introPassword("Introduce la contraseña: ");
        this.email=Teclado.introCorreoElectronico("Introduce el correo electrónico: ");
    }
    public Usuario(int id,String username, String password, String email) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.username, other.username);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + '}';
    }
    

    

  

    
    
    
    
}
