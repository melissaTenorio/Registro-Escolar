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
public class calificacionDAO {
 private String _id;
         private String inscripcionId;
         private double valor; //deria ayudar a mapear el bsonType
         private String tipo;
         private Date fechaRegistro;
         
         //getters and setters

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getInscripcionId() {
        return inscripcionId;
    }

    public void setInscripcionId(String inscripcionId) {
        this.inscripcionId = inscripcionId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
         
         
         
}
