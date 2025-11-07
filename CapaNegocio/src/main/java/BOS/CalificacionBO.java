/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class CalificacionBO {
    private String idCalificacion;
    private double valor;
    private String tipo;

    public CalificacionBO(String idCalificacion, double valor, String tipo) {
        this.idCalificacion = idCalificacion;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getIdCalificacion() {
        return idCalificacion;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    
    public boolean PasaOno(){
    return this.valor>=70;
    }
}
