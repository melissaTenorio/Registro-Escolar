/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public abstract class PersonaBO {
    private String nombre;
    private String Apellido;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private int edad;
    private String domicilio;
    private String genero;
    private String CURP;
   private String Correo;

    public PersonaBO(String nombre, String Apellido, String fechaNacimiento, String direccion, String telefono, int edad, String domicilio, String genero, String CURP, String Correo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.domicilio = domicilio;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getDomicilio() {
        return domicilio;
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
   
   
   
}
