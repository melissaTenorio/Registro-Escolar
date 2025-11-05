/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BOS;

/**
 *
 * @author melis
 */
public class alumnoBO extends UsuarioBO {
    private String idAlu;
private String contactoEmergencia;
private boolean estado;// activo/inactivo

    public alumnoBO(String idAlu, String contactoEmergencia, boolean estado, String idUsuario, String contraseña, String tipo, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, tipo, nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.idAlu = idAlu;
        this.contactoEmergencia = contactoEmergencia;
        this.estado = estado;
    }



}
