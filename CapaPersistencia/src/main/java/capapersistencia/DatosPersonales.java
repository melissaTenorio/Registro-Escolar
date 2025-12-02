/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia;

/**
 *
 * @author melis
 */
public class DatosPersonales {

    //atributos de la clase datos personales
    private String nombre;
    private String apellido;
    private String curp;
    private String correo;
    private String telefono;
    private String telefonoEmergencia;

    public DatosPersonales(String nombre, String apellido, String curp, String correo, String telefono, String telefonoEmergencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.correo = correo;
        this.telefono = telefono;
        this.telefonoEmergencia = telefonoEmergencia;
    }

    
    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }
    //clase anidada

    public class DatosRolDAO {

        private String matricula;
        private String idProfesor;
        private String puesto;
        private String departamento;

        public DatosRolDAO(String matricula, String idProfesor, String puesto, String departamento) {
            this.matricula = matricula;
            this.idProfesor = idProfesor;
            this.puesto = puesto;
            this.departamento = departamento;
        }

        
        
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getIdProfesor() {
            return idProfesor;
        }

        public void setIdProfesor(String idProfesor) {
            this.idProfesor = idProfesor;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

    }

    //clase anidada
    public class UsuarioDAO {

        /*esta clase usuarioDAO buscara rastrear los campos de la bd que pertencen al usuario*/
        private String _id;//ratsrea el _id de la bd
        private String rol;//rastrea el rol dela bd
        private String contraseñaHash;// busca el campo de la contra
        private DatosPersonales datosPersonales;
        private DatosRolDAO datosRol;

        /*constructor*/
        public UsuarioDAO(String _id, String rol, String contraseñaHash, DatosPersonales datosPersonales, DatosRolDAO datosRol) {
            this._id = _id;
            this.rol = rol;
            this.contraseñaHash = contraseñaHash;
            this.datosPersonales = datosPersonales;
            this.datosRol = datosRol;
        }

        public String getId() {
            return _id;
        }

        public void setId(String _id) {
            this._id = _id;
        }

        public String getRol() {
            return rol;
        }

        public void setRol(String rol) {
            this.rol = rol;
        }

        public String getContraseñaHash() {
            return contraseñaHash;
        }

        public void setContraseñaHash(String contraseñaHash) {
            this.contraseñaHash = contraseñaHash;
        }

        public DatosPersonales getDatosPersonales() {
            return datosPersonales;
        }

        public void setDatosPersonales(DatosPersonales datosPersonales) {
            this.datosPersonales = datosPersonales;
        }

        public DatosRolDAO getDatosRol() {
            return datosRol;
        }

        public void setDatosRol(DatosRolDAO datosRol) {
            this.datosRol = datosRol;
        }

    }
}
