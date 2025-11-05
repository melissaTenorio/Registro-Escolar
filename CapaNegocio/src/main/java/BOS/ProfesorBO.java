/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class ProfesorBO extends UsuarioBO {
    private String idProfesor;
    private String departamento;

    public ProfesorBO(String idProfesor, String departamento, String idUsuario, String contraseña, String tipo, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, tipo, nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.idProfesor = idProfesor;
        this.departamento = departamento;
    }

    public String getIdProfesor() {
        return idProfesor;
    }
    
    
}
