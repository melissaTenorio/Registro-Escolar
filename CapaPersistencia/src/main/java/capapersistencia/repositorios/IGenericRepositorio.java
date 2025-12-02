/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package capapersistencia.repositorios;
import java.util.List;
/**
 *@param <T>
 * @return
 * @author melis
 */
public interface IGenericRepositorio {
    /**
     * @param dato
     */
    void guardar(T dato);
    
    T buscarPorId();
    List<T> buscaTodo();
    void actualiza();
    void eliminar();
}
