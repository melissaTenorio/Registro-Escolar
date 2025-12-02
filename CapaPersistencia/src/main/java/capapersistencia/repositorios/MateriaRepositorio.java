/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia.repositorios;

import capapersistencia.MateriaDAO;
import com.mongodb.client.MongoCollection;
import com.google.gson.Gson;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author melis
 */
public class MateriaRepositorio implements IGenericRepositorio<MateriaDAO>{
private final MongoCollection<Document> collection;
private final Gson gson; //mapea un bsonType
    @Override
    public void guardar(MateriaDAO dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MateriaDAO buscarPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MateriaDAO> buscaTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualiza(MateriaDAO dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
