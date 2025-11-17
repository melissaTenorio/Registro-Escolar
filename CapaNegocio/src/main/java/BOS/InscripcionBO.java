/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.EstadoInscripcion;
import java.time.LocalDate;
import java.util.Objects;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
class InscripcionBO {

    private String idInscripcion;
    private AlumnoBO alumno; // Asociación a un BOS
    private GrupoBO grupo;    // Asociación a un BOS
    private LocalDate fechaInscripcion;
    private EstadoInscripcion estatus; // Usa el ENUM

    public InscripcionBO(String idInscripcion, AlumnoBO alumno, GrupoBO grupo) {
        this.idInscripcion = Objects.requireNonNull(idInscripcion);
        this.alumno = Objects.requireNonNull(alumno);
        this.grupo = Objects.requireNonNull(grupo);
        this.fechaInscripcion = LocalDate.now();
  }

 
    public String getIdInscripcion() {
        return idInscripcion;
    }

    public AlumnoBO getAlumno() {
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

    public void actualizarEstatus(EstadoInscripcion nuevoEstatus) throws ReglaExcepcion {
        // Regla 1: No se puede cambiar el estado si ya está finalizado (APROBADA o REPROBADA)
        if (this.estatus == EstadoInscripcion.APROBADA || this.estatus == EstadoInscripcion.REPROBADA) {
            throw new ReglaExcepcion("El estatus de una inscripción finalizada no puede ser modificado.");
        }

        // Regla 2: Lógica de transición específica (ej: de BAJA_TEMPORAL solo puede volver a CURSANDO)
        if (this.estatus == EstadoInscripcion.BAJA && nuevoEstatus != EstadoInscripcion.CURSANTE) {
            throw new ReglaExcepcion("Una baja temporal debe volver a 'CURSANDO' para ser reactivada.");
        }

        // Si pasa todas las validaciones, actualiza el estado interno
        this.estatus = nuevoEstatus;
    }
    
    public void darDeBaja() throws ReglaExcepcion {
        if (this.estatus == EstadoInscripcion.APROBADA || this.estatus == EstadoInscripcion.REPROBADA) {
            throw new ReglaExcepcion("No se puede dar de baja una materia que ya ha sido calificada.");
        }
        this.estatus = EstadoInscripcion.BAJA;
    }
    
    public boolean puedeInscribirse(){
        return !"Condicional".equalsIgnoreCase(estatus) && 
               !"Baja".equalsIgnoreCase(estatus
               );
    }
}
