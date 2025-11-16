/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;
import negocioExcepciones.reglaExcepcion;

/**
 *
 * @author melis
 */
public class UsuarioBO extends PersonaBO {

    private String idUsuario;
    private String contraseña; /*esto es un hash, guarda en HASH*/
    private RolUsuario rol;// alumno, profesor o administrador

    public UsuarioBO(String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public RolUsuario getRol() {
        return rol;
    }

    
    

    //METODO PARA CAMBIAR LA CONTRASEÑA
    public void cambiarContraseña(String nuevaContra) throws reglaExcepcion{
        if (nuevaContra==null||nuevaContra.length()<8) {
            throw new IllegalArgumentException("La contraseña debe tener almenos 8 caracteres");
        }
        if (nuevaContra.equals(contraseña)) {
            throw new reglaExcepcion("la nueva contraseña no puede ser igual ala anterior");
        }
        this.contraseña= "hashed_"+nuevaContra;
    }

    

}
