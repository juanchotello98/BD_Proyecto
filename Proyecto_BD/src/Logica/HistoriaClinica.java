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
public class HistoriaClinica {
    private String numeroHistoria;
    private String fechaApertura;
    private String idPaciente;
    
    public HistoriaClinica(){}
    
    public void setNumeroHistoria (String numeroHistoria){
        this.numeroHistoria=numeroHistoria;
    }
    
    public String getNumeroHistoria(){
        return numeroHistoria;
    }
    
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura=fechaApertura;
    }
    
    public String getFechaApertura(){
        return fechaApertura;
    }
    
     public void setIdPaciente (String idPaciente){
        this.idPaciente=idPaciente;
    }
    
    public String getIdPaciente(){
        return idPaciente;
    }   
    
}
