/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;
import java.time.LocalDate;

/**
 *
 * @author melis
 */
public class ProfesorBO extends UsuarioBO {
private String idProfesor;
    private String departamento;

    public ProfesorBO(String idProfesor, String departamento, String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, domicilio, genero, CURP, Correo);
        this.idProfesor = idProfesor;
        this.departamento = departamento;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public String getDepartamento() {
        return departamento;
    }

}
