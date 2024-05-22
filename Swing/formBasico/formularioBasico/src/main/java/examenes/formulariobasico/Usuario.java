/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes.formulariobasico;

/**
 *
 * @author Admin
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    private String email;

    public Usuario(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    
    
    public int getId() {
        return id;
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
    
    
    
           
}
