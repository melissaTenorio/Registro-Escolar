/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class UsuarioBO extends PersonaBO {

    private String idUsuario;

//            private String correo;//maybe tambien sea innecesario
    private String contraseña;
    private String tipo;// alumno, profesor o administrador

    public UsuarioBO(String idUsuario, String contraseña, String tipo, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    //METODO PARA CAMBIAR LA CONTRASEÑA
    public void cambiarContraseña(String nuevaContra){
        if (nuevaContra==null||nuevaContra.length()<0) {
            throw new IllegalArgumentException("La contraseña debe tener almenos 8 caracteres");
        }
        this.contraseña= "hashed_"+nuevaContra;
    }

    

}
