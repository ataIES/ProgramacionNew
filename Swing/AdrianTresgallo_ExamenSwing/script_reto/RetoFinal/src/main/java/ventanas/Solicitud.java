/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author DAW125
 */
public class Solicitud {
    
    private int idActividad;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String comentario;
    private boolean prevista;
    private int departamento;
    private String titulo;
    private TipoSolicitud tipo;
    private boolean medioTransporte;
    private int profesor;
    private boolean alojamiento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int totalParticipantes;
    private String comenAlojamiento;
    private Estado estado;

    public Solicitud(int idActividad, LocalTime horaInicio, LocalTime horaFin, String comentario, boolean prevista, int departamento, String titulo, TipoSolicitud tipo, boolean medioTransporte, int profesor, boolean alojamiento, LocalDate fechaInicio, LocalDate fechaFin, int totalParticipantes, String comenAlojamiento, Estado estado) {
        this.idActividad = idActividad;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.comentario = comentario;
        this.prevista = prevista;
        this.departamento = departamento;
        this.titulo = titulo;
        this.tipo = tipo;
        this.medioTransporte = medioTransporte;
        this.profesor = profesor;
        this.alojamiento = alojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalParticipantes = totalParticipantes;
        this.comenAlojamiento = comenAlojamiento;
        this.estado = estado;
    }

    public Solicitud(LocalTime horaInicio, LocalTime horaFin, String comentario, boolean prevista, int departamento, String titulo, TipoSolicitud tipo, boolean medioTransporte, int profesor, boolean alojamiento, LocalDate fechaInicio, LocalDate fechaFin, int totalParticipantes, String comenAlojamiento, Estado estado) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.comentario = comentario;
        this.prevista = prevista;
        this.departamento = departamento;
        this.titulo = titulo;
        this.tipo = tipo;
        this.medioTransporte = medioTransporte;
        this.profesor = profesor;
        this.alojamiento = alojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalParticipantes = totalParticipantes;
        this.comenAlojamiento = comenAlojamiento;
        this.estado = estado;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isPrevista() {
        return prevista;
    }

    public void setPrevista(boolean prevista) {
        this.prevista = prevista;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public void setTipo(TipoSolicitud tipo) {
        this.tipo = tipo;
    }

    public boolean isMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(boolean medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public boolean isAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(boolean alojamiento) {
        this.alojamiento = alojamiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getTotalParticipantes() {
        return totalParticipantes;
    }

    public void setTotalParticipantes(int totalParticipantes) {
        this.totalParticipantes = totalParticipantes;
    }

    public String getComenAlojamiento() {
        return comenAlojamiento;
    }

    public void setComenAlojamiento(String comenAlojamiento) {
        this.comenAlojamiento = comenAlojamiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "idActividad=" + idActividad + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", comentario=" + comentario + ", prevista=" + prevista + ", departamento=" + departamento + ", titulo=" + titulo + ", tipo=" + tipo + ", medioTransporte=" + medioTransporte + ", profesor=" + profesor + ", alojamiento=" + alojamiento + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", totalParticipantes=" + totalParticipantes + ", comenAlojamiento=" + comenAlojamiento + ", estado=" + estado + '}';
    }
    
    
}
