/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import enumRoles.RolUsuario;
import java.time.LocalDate;
import java.util.Objects;
import negocioExcepciones.ReglaExcepcion;

/**
 *
 * @author melis
 */
public class UsuarioBO extends PersonaBO {

    private String idUsuario;
    private String contraseña; /*esto es un hash, guarda en HASH*/
    private RolUsuario rol;// alumno, profesor o administrador

    public UsuarioBO(String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String domicilio, String genero, String CURP, String Correo) {
        super(nombre, Apellido, fechaNacimiento, direccion, telefono, domicilio, genero, CURP, Correo);
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        this.rol = Objects.requireNonNull(rol);
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
    public void cambiarContraseña(String nuevaContra) throws ReglaExcepcion{
        if (nuevaContra==null||nuevaContra.length()<8) {
            throw new IllegalArgumentException("La contraseña debe tener almenos 8 caracteres");
        }
        if (nuevaContra.equals(contraseña)) {
            throw new ReglaExcepcion("la nueva contraseña no puede ser igual ala anterior");
        }
        this.contraseña= "hashed_"+nuevaContra;
    }

    

}
