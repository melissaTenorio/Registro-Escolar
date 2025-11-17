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
public class TareaBO {
    private String idTarea;
    private MateriaBO materia; // Asociación al BOS
    private String titulo;
    private LocalDate fechaLimite;

    public TareaBO(String idTarea, MateriaBO materia, String titulo, LocalDate fechaLimite) {
        this.idTarea = Objects.requireNonNull(idTarea);
        this.materia = Objects.requireNonNull(materia);
        this.titulo = Objects.requireNonNull(titulo);
        this.fechaLimite = Objects.requireNonNull(fechaLimite);
    }

    public String getIdTarea() {
        return idTarea;
    }

    public MateriaBO getMateria() {
        return materia;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    
    public boolean tareaVencida(){
    return LocalDate.now().isAfter(fechaLimite);
    }
    
}
