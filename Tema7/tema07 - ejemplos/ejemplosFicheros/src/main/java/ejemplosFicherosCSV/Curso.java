/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFicherosCSV;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Curso implements Serializable{
    private int idcurso;
    private String codcurso;
    private String descurso;
    private String etapa;
    private int activo;

    public Curso(int idcurso, String codcurso, String descurso, String etapa, int activo) {
        this.idcurso = idcurso;
        this.codcurso = codcurso;
        this.descurso = descurso;
        this.etapa = etapa;
        this.activo = activo;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getCodcurso() {
        return codcurso;
    }

    public void setCodcurso(String codcurso) {
        this.codcurso = codcurso;
    }

    public String getDescurso() {
        return descurso;
    }

    public void setDescurso(String descurso) {
        this.descurso = descurso;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Curso{" + "idcurso=" + idcurso + ", codcurso=" + codcurso + ", descurso=" + descurso + ", etapa=" + etapa + ", activo=" + activo + '}';
    }
    
    
    
    
}
