/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BOS;

import enumRoles.EstadoIncripcion;
import enumRoles.RolUsuario;
import java.util.List;

/**
 *
 * @author melis
 */
public class alumnoBO extends UsuarioBO {
    private String idAlu;
    private String carrera;
    private byte semestreCursando;
private String contactoEmergencia;
private EstadoIncripcion estado;// activo/inactivo

    public alumnoBO(String idAlu, String carrera, byte semestreCursando, String contactoEmergencia, EstadoIncripcion estado, String idUsuario, String contraseña, RolUsuario rol, String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        super(idUsuario, contraseña, rol, nombre, Apellido, fechaNacimiento, direccion, telefono, edad, domicilio, genero, CURP, Correo);
        this.idAlu = idAlu;
        this.carrera = carrera;
        this.semestreCursando = semestreCursando;
        this.contactoEmergencia = contactoEmergencia;
        this.estado = estado;
    }

    public String getIdAlu() {
        return idAlu;
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

    public EstadoIncripcion getEstado() {
        return estado;
    }

   public double calcularPromFinal(List<calificacion>calificacoines){
       if (calificacoines == null || calificaciones.isEmpty) {
           return 0.0;
       } double suma=0.0;
       for (calificacion c : calificaciones ) {
           suma+=c.getValor();
       }
   return Math.round((suma/calificaciones));
           }



    


}
