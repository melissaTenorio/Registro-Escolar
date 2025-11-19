/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
public class AdministradorBO extends UsuarioBO {
    private String idAdministrador;
    private List<String> carrerasGestionadas; /*saber a que carrera o departamento pertenece*/

   

    public AdministradorBO(String idAdministrador, List<String> carrerasGestionadas, String idUsuario, String contraseñaHASH, RolUsuario rol, String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String genero, String CURP, String Correo) {
        super(idUsuario, contraseñaHASH, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, genero, CURP, Correo);
        this.idAdministrador = idAdministrador;
        this.carrerasGestionadas = carrerasGestionadas;
        if (carrerasGestionadas != null) {
            this.carrerasGestionadas.addAll(carrerasGestionadas);
        }
    }
    
    

    
    public String getIdAdministrador() {
        return idAdministrador;
    }

    public List<String> getCarreraAsignada() {
        return carrerasGestionadas;
    }    
    
    public void agregarCarreraAGestion(String nombreCarrera) throws ReglaExcepcion {
        if (nombreCarrera == null || nombreCarrera.isEmpty()) {
            throw new ReglaExcepcion("El nombre de la carrera no puede ser vacío.");
        }
        if (carrerasGestionadas.contains(nombreCarrera.toUpperCase())) {
            throw new ReglaExcepcion("Esta carrera ya está asignada para la gestión.");
        }
        this.carrerasGestionadas.add(nombreCarrera.toUpperCase());
    }
    
        /*solo define a que tiene permiso el administrador*/
    public boolean puedeGestionarCarrera(String carreraDeLaEntidad){
        if (carrerasGestionadas.isEmpty()) {
            return false;
        }
        // Verifica si la lista de carreras asignadas contiene la carrera de la entidad
        return carrerasGestionadas.contains(carreraDeLaEntidad.toUpperCase());
    }
}
