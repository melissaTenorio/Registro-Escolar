/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.util.ArrayList;
import java.util.List;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
public class GrupoBO {
private String idGrupo;
    private MateriaBO asignatura;
    private ProfesorBO profesorAsignado;
    private HorarioBO horario;
    private int maxCapacidad = 30;
    // Lista de inscripciones para controlar el cupo????
    private List<InscripcionBO> inscripciones ;

    public GrupoBO(String idGrupo, MateriaBO asignatura, ProfesorBO profesorAsignado, HorarioBO horario) {
        this.idGrupo = idGrupo;
        this.asignatura = asignatura;
        this.profesorAsignado = profesorAsignado;
        this.horario = horario;
        this.inscripciones = new ArrayList<>();
    }

   public int getEspaciosDisponibles(){
            return maxCapacidad-inscripciones.size();
        }
    

    
    public String getIdGrupo() {
        return idGrupo;
    }

    public MateriaBO getAsignatura() {
        return asignatura;
    }

    public ProfesorBO getProfesorAsignado() {
        return profesorAsignado;
    }

    public int getMaxCapacidad() {
        return maxCapacidad;
    }

    public void agregarAlumno(InscripcionBO inscripcion)throws ReglaExcepcion{
        if (getMaxCapacidad()<=0) {
            throw new ReglaExcepcion("el grupo esta lleno");
        }
        this.inscripciones.add(inscripcion);
    }
    
//    public void AgregarAlumno(alumnoBO alumno){
//    if(maxCapacidad<30){
//    maxCapacidad++;
//    } se puede cambiar por in cupo de max-inscripciones
    }
    
    

