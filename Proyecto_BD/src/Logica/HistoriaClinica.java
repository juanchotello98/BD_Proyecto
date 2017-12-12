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
    private int numeroHistoria;
    private String fechaApertura;
    private int idPaciente;
    
    public HistoriaClinica(){}
    
    public void setNumeroHistoria (int numeroHistoria){
        this.numeroHistoria=numeroHistoria;
    }
    
    public int getNumeroHistoria(){
        return numeroHistoria;
    }
    
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura=fechaApertura;
    }
    
    public String getFechaApertura(){
        return fechaApertura;
    }
    
     public void setIdPaciente (int idPaciente){
        this.idPaciente=idPaciente;
    }
    
    public int getIdPaciente(){
        return idPaciente;
    }   
    
}
