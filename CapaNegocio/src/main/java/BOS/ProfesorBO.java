/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;
import java.time.LocalDate;
import java.util.List;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
public class ProfesorBO extends UsuarioBO {
private String idProfesor;
    private String departamento;
    private List<String> gruposAsignadosIDs;

    public ProfesorBO(String idProfesor, String departamento, List<String> gruposAsignadosIDS, String idUsuario, String contraseñaHASH, RolUsuario rol, String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String genero, String CURP, String Correo) {
        super(idUsuario, contraseñaHASH, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, genero, CURP, Correo);
        this.idProfesor = idProfesor;
        this.departamento = departamento;
        this.gruposAsignadosIDs = gruposAsignadosIDS;
    }

    public List<String> getGruposAsignadosIDs() {
        return gruposAsignadosIDs;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public String getDepartamento() {
        return departamento;
    }

public void asignarGrupo(String idGrupo) throws ReglaExcepcion {
        // Regla: Define la carga académica máxima (ejemplo: no más de 5 grupos por ciclo)
        final int CARGA_MAXIMA = 5; 
        
        if (gruposAsignadosIDs.size() >= CARGA_MAXIMA) {
            throw new ReglaExcepcion("El profesor ha alcanzado el límite máximo de " + CARGA_MAXIMA + " grupos asignados.");
        }
        if (gruposAsignadosIDs.contains(idGrupo)) {
            throw new ReglaExcepcion("El grupo " + idGrupo + " ya está asignado a este profesor.");
        }
        
        this.gruposAsignadosIDs.add(idGrupo);
    }    
 
    public boolean tieneCarga(){
    return !gruposAsignadosIDs.isEmpty();
    }

    public boolean es(String depaMateria){
    return this.departamento.equalsIgnoreCase(depaMateria);
    }
}
