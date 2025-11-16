/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOS;

/**
 *
 * @author melis
 */
public class HorarioBO {
    private String idHorario;
    private String dias;
    private String horaInicio;
    private String horaFin;
    private String aula;

    public HorarioBO(String idHorario, String dias, String horaInicio, String horaFin, String aula) {
        this.idHorario = idHorario;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.aula = aula;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public String getDias() {
        return dias;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getAula() {
        return aula;
    }
    
    /*metodo para saber si se empalman dias*/
    
    
}
