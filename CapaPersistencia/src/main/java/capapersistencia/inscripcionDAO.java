/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia;

import java.util.Date;

/**
 *
 * @author melis
 */
public class inscripcionDAO {

    private String _id;
    private String alumnoId;
    private String grupoId;
    private Date fechaInscripcion;
    private String estatus;

    public inscripcionDAO(String _id, String alumnoId, String grupoId, Date fechaInscripcion, String estatus) {
        this._id = _id;
        this.alumnoId = alumnoId;
        this.grupoId = grupoId;
        this.fechaInscripcion = fechaInscripcion;
        this.estatus = estatus;
    }

    
    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(String alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
}
