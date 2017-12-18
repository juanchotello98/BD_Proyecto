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
public class Paciente extends Persona {
    
    private String actividadEconomica;
    private String numeroSeguroSocial;
    private String fechaNacimiento;
    
    
    public Paciente(String identificacion){
        super(identificacion);
    }
    public void setActividadEconomica(String actividadEconomica){
        this.actividadEconomica=actividadEconomica;
    }
    
    public String getActividadEconomica(){
        return actividadEconomica;
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setNumeroSeguroSocial (String numeroSeguroSocial){
        this.numeroSeguroSocial=numeroSeguroSocial;
    }
    
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
}
