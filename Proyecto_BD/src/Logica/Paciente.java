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
    private int numeroSeguroSocial;
    private String fechaNacimiento;
    
    public Paciente(int identificacion, String actividadEconomica, int numeroSeguroSocial, 
            String fechaNacimiento){
        super(identificacion);
        this.actividadEconomica=actividadEconomica;
        this.numeroSeguroSocial=numeroSeguroSocial;
        this.fechaNacimiento=fechaNacimiento;
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
    
    public void setNumeroSeguroSocial (int numeroSeguroSocial){
        this.numeroSeguroSocial=numeroSeguroSocial;
    }
    
    public int getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
}
