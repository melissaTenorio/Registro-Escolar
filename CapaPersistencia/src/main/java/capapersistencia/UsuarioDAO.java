/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia;

/**
 *
 * @author melis
 */
public class UsuarioDAO {
    /*esta clase usuarioDAO buscara rastrear los campos de la bd que pertencen al usuario*/
    private String id;//ratsrea el _id de la bd
    private String rol;//rastrea el rol dela bd
    private String contraseñaHash;// busca el campo de la contra
    
    
    /*constructor*/

    public UsuarioDAO(String id, String rol, String contraseñaHash) {
        this.id = id;
        this.rol = rol;
        this.contraseñaHash = contraseñaHash;
    }

    /*getter y setters*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
}
