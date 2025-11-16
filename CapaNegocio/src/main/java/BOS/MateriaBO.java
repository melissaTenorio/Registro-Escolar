/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

import java.util.List;

/**
 *
 * @author melis
 */
public class MateriaBO {
    private String codigoMateria;
    private String nombreMateria;
    private String cantCreditos;

    public MateriaBO(String codigoMateria, String nombreMateria, String cantCreditos) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.cantCreditos = cantCreditos;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getCantCreditos() {
        return cantCreditos;
    }
    
    public boolean validarRequisitos(List<MateriaBO>cursadas){
    if(codigoMateria.equals("POO")&&!cursadas.contains("fundamentos"))return false;
return true;
    }
    
}
