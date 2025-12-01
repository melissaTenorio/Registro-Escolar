/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capapersistencia;

import com.mongodb.ConnectionString;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.awt.List;
import javax.swing.JOptionPane;


/**
 *
 * @author melis
 */
public class conexionBD {
    private static conexionBD instancia;
    private final MongoClient mongo;

    
    /*configuracion creo*/
    private final String baseDatos="RegistroEscolar";
    private final String cadenaConecta="mongodb://LocalHost:2701";
    
    private conexionBD(){
        try {
            this.mongo= MongoClients.create(cadenaConecta);
            
            this.mongo.getDatabase(baseDatos).listCollectionNames().first();
            System.out.println("conexion a mongo establecida");
        } catch (MongoException e) {
            System.err.println("error al conectar: "+ e.getMessage());
            throw new RuntimeException("no se puede conectar la bd",e);
        }
    
    }
    /*acceso al singleton*/
    public static conexionBD getInstancia(){
        if (instancia==null) {
            instancia = new conexionBD();
        }return instancia;
    }
    
    /*debe retornar a la bd*/
    public MongoDatabase getBaseDatos(){        
                return mongo.getDatabase(baseDatos);
    }
    
    
    public void cerrarConecta(){
        if (mongo != null) {
            mongo.close();
            System.out.println("la conexion se cerro, bais");
        }
}
//    public MongoClient crearConexion(){
//        
//        
//    MongoClient mongo=null;
//    String server="Localhost";
//    int puerto=27017;
//        try {
//            mongo=new MongoClient(server,puerto);
//            
//            List<String>RegistroEscolar = mongo.getDatabase(server);
//            JOptionPane.showMessageDialog(null,"Se concecto correctamente la base de datos Regostro Escoalr");
//        } catch (MongoException e) {
//            JOptionPane.showMessageDialog(null, "error en la base de datos");
//        }
//  return mongo;  }
    
}
