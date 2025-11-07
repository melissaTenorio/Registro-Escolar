/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class GrupoBO {
private String idGrupo;
    private MateriaBO asignatura;
    private ProfesorBO profesorAsignado;
    private int maxCapacidad = 30;
    // Lista de inscripciones para controlar el cupo????

    public GrupoBO(String idGrupo, MateriaBO asignatura, ProfesorBO profesorAsignado) {
        this.idGrupo = idGrupo;
        this.asignatura = asignatura;
        this.profesorAsignado = profesorAsignado;
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

//    public void AgregarAlumno(alumnoBO alumno){
//    if(maxCapacidad<30){
//    maxCapacidad++;
//    } se puede cambiar por in cupo de max-inscripciones
    }
    
    
}
