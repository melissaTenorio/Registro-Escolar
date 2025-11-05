/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class AdministradorBO extends UsuarioBO{
    private String idAdmin;

    public AdministradorBO(String idUsuario, String contraseña, String tipo, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, tipo, nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
    }

    public String getIdAdmin() {
        return idAdmin;
    }


}
