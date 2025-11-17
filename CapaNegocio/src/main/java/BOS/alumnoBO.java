/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package BOS;

import enumRoles.EstadoInscripcion;
import enumRoles.RolUsuario;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author melis
 */
public class AlumnoBO extends UsuarioBO {
private String matricula; /*el id del usuario aluno*/
    private String carrera;
    private byte semestreCursando;
    private String contactoEmergencia;
    private EstadoInscripcion estado;// activo/inactivo

    public AlumnoBO(String matricula, String carrera, byte semestreCursando, String contactoEmergencia, EstadoInscripcion estado, String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, domicilio, genero, CURP, Correo);
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestreCursando = semestreCursando;
        this.contactoEmergencia = contactoEmergencia;
        this.estado = estado;
    }

    
    
    public String getMatricula() {
        return matricula;
    }


    public String getCarrera() {
        return carrera;
    }

    public byte getSemestreCursando() {
        return semestreCursando;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public EstadoInscripcion getEstado() {
        return estado;
    }

    /**
     * @param calificaciones
     * @return
     *
     */
    public double calcularPromFinal(List<CalificacionBO> calificaciones) {
        if (calificaciones == null || calificaciones.isEmpty()) {
            return 0.0;
        }
double suma = calificaciones.stream()
            .mapToDouble(CalificacionBO::getValor)
            .sum();
        
        return Math.round((suma / calificaciones.size()) * 100.0) / 100.0;
    }
    
    
}
