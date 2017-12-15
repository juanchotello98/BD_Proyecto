/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Admin
 */
public class Cita {
    private String idPaciente;
    private String idMedico;
    private String hora;
    private String fecha;
    private String estado;
    private String valorConsulta;
    
    public Cita(){}
    
    public void setIdPaciente(String idPaciente){
        this.idPaciente=idPaciente;
    }
    
    public String getIdPaciente(){
        return idPaciente;
    }
    
    public void setIdMedico(String idMedico){
        this.idMedico=idMedico;
    }
    
    public String getIdMedico(){
        return idMedico;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setHora(String hora){
        this.hora=hora;
    }
    
    public String getHora(){
        return hora;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setValorConsulta(String valorConsulta){
        this.valorConsulta=valorConsulta;
    }
    
    public String getValorConsulta(){
        return valorConsulta;
    }
}
