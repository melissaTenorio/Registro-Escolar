/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.time.LocalDate;
import java.util.Objects;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
public class CalificacionBO {
    private String idCalificacion;
    private InscripcionBO inscripcion; // Asociación al BOS
    private double valor; 
    private String tipo; // Ej: Parcial 1, Tarea, Final
    private LocalDate fechaRegistro;
    
   public CalificacionBO (String idCalificacion, InscripcionBO inscripcion, double valor, String tipo) throws ReglaExcepcion {
        this.idCalificacion = Objects.requireNonNull(idCalificacion);
        this.inscripcion = Objects.requireNonNull(inscripcion);
        this.fechaRegistro = LocalDate.now();
        this.tipo = Objects.requireNonNull(tipo);
        // Llama al método de lógica para inicializar el estado
        this.actualizarValor(valor); 
    }

    public String getIdCalificacion() {
        return idCalificacion;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    
    public boolean PasaOno(){
    return this.valor>=70;
    }
    
    public void actualizarValor(double nuevoValor) throws ReglaExcepcion {
        if (nuevoValor < 0.0 || nuevoValor > 100.0) {
            throw new ReglaExcepcion("La calificación debe estar en el rango de 0 a 100.");
        }
        this.valor = nuevoValor;
    }

    /**
     * Método de Lógica: Regla de aprobación
     */
    public boolean esAprobatoria() {
        return this.valor >= 70.0;
    }
}
