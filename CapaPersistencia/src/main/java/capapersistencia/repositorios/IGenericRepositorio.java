/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package capapersistencia.repositorios;
import java.util.List;
/**
 * @param <T>
 * @author melis
 */
public interface IGenericRepositorio<T> {
    /**
     * @param dato
     */
    void guardar(T dato);
    /**
     * @param id
     * @return 
     */
    T buscarPorId(String id);
    /**
     * @return 
     */
    List<T> buscaTodo();
    /**
     * @param dato
     */
    void actualiza(T dato);
    /**
     * @param id
     */
    void eliminar(String id);
}
