/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author DAW125
 */
public class Profesor {
    
    private int idProfesor;
    private String nombre;
    private String apellidos;
    private String dni;
    private TipoProfesor tipoUsuario;
    private int departamento;
    private String mail;
    private String contraseña;
    private boolean activo;

    public Profesor(int idProfesor, String nombre, String apellidos, String dni, TipoProfesor tipoUsuario, int departamento, String mail, String contraseña, boolean activo) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipoUsuario = tipoUsuario;
        this.departamento = departamento;
        this.mail = mail;
        this.contraseña = contraseña;
        this.activo = activo;
    }

    public Profesor(String nombre, String apellidos, String dni, TipoProfesor tipoUsuario, int departamento, String mail, String contraseña, boolean activo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipoUsuario = tipoUsuario;
        this.departamento = departamento;
        this.mail = mail;
        this.contraseña = contraseña;
        this.activo = activo;
    }

   

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoProfesor getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoProfesor tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
    
}
