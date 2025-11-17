/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.util.Objects;
import negocioExcepciones.ReglaExcepcion;
import enumRoles.*;
import java.time.LocalDate;

/**
 *
 * @author melis
 */
public class RegistraAsistenciaBO {
    private String idRegistro;
    private InscripcionBO inscripcion; // Asociación al BOS
    private LocalDate fechaClase;
    private EstadoAsistencia estado; // Usa el ENUM
    private boolean justificada;

    public RegistraAsistenciaBO(String idRegistro, InscripcionBO inscripcion, LocalDate fechaClase, EstadoAsistencia estado) {
        this.idRegistro = Objects.requireNonNull(idRegistro);
        this.inscripcion = Objects.requireNonNull(inscripcion);
        this.fechaClase = Objects.requireNonNull(fechaClase);
        this.estado = Objects.requireNonNull(estado);
        this.justificada = false;
    }
    
    public void justificarFalta() throws ReglaExcepcion {
        if (this.estado != EstadoAsistencia.AUSENTE) {
            throw new ReglaExcepcion("Solo se pueden justificar las ausencias.");
        }
        this.justificada = true;
    }
}
