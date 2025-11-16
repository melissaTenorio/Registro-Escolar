/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;

/**
 *
 * @author melis
 */
public class AdministradorBO extends UsuarioBO {
    private String carreraAsignada; /*saber a que carrera o departamento pertenece*/
    
    public AdministradorBO(String carreraAsignada, String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.carreraAsignada = carreraAsignada;
    }
    
    /*solo define a que tiene permiso el administrador*/
    public boolean soloGestiona(){
    return "direccion".equalsIgnoreCase(carreraAsignada);
    }
    
}
