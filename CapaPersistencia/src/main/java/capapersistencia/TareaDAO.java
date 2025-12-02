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
public class TareaDAO {
    private String _id;
            private String grupoId;
            private String nombreTarea;
            private String descripcion;
            private Date fechaEntrega;

    public TareaDAO(String _id, String grupoId, String nombreTarea, String descripcion, Date fechaEntrega) {
        this._id = _id;
        this.grupoId = grupoId;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
            
            
            
}
