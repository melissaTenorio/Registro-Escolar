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
public class CalificacionBO {
    private String idCalificacion;
    private Inscripcion inscripcion; // Asociación al BOS
    private double valor; 
    private String tipo; // Ej: Parcial 1, Tarea, Final
    private LocalDate fechaRegistro;
    
   public Calificacion(String idCalificacion, Inscripcion inscripcion, double valor, String tipo) throws ReglaNegocioException {
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
}
