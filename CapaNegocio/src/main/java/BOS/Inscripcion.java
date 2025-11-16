/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author melis
 */
class Inscripcion {
    private String idInscripcion;
    private alumnoBO alumno; // Asociación a un BOS
    private GrupoBO grupo;    // Asociación a un BOS
    private LocalDate fechaInscripcion;
    private EstadoInscripcion estatus; // Usa el ENUM

    public Inscripcion(String idInscripcion, alumnoBO alumno, Grupo grupo) {
        this.idInscripcion = Objects.requireNonNull(idInscripcion);
        this.alumno = Objects.requireNonNull(alumno);
        this.grupo = Objects.requireNonNull(grupo);
        this.fechaInscripcion = LocalDate.now();
        this.estatus = EstadoInscripcion.CURSANTE;
    }

    public String getIdInscripcion() {
        return idInscripcion;
    }

    public alumnoBO getAlumno() {
        return alumno;
    }

    public GrupoBO getGrupo() {
        return grupo;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public EstadoInscripcion getEstatus() {
        return estatus;
    }
    
    
}
