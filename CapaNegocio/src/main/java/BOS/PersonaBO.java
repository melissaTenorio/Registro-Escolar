/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.time.*;

/**
 *
 * @author melis
 */
public abstract class PersonaBO {
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
   // private int edad; quitaremos la edad para que el sistema la calcule por si solo con la fecha de nacimiento
    private String genero;
    private String CURP;
   private String Correo;

    public PersonaBO(String nombre, String Apellido, LocalDate fechaNacimiento, String direccion, String telefono, String genero, String CURP, String Correo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.CURP = CURP;
        this.Correo = Correo;
    }

    /*getters solo de lectura*/
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

   

    public String getGenero() {
        return genero;
    }

    public String getCURP() {
        return CURP;
    }

    public String getCorreo() {
        return Correo;
    }
   
   
   public int calcularEdadPersona(){
   return Period.between(fechaNacimiento, LocalDate.now()).getYears();
   }
}
