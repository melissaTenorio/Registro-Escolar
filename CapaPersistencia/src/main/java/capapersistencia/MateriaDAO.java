/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia;

/**
 *
 * @author melis
 */
public class MateriaDAO {
    /*mappers de la colecion materias*/
    private String _id;
    private String nombreMateria;
    private int cantCreditos;

    public MateriaDAO(String _id, String nombreMateria, int cantCreditos) {
        this._id = _id;
        this.nombreMateria = nombreMateria;
        this.cantCreditos = cantCreditos;
    }
    
    
    
    
    /*getters y setters aqui si van ambos*/

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCantCreditos() {
        return cantCreditos;
    }

    public void setCantCreditos(int cantCreditos) {
        this.cantCreditos = cantCreditos;
    }
    
    
    
}
