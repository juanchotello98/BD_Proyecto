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
public class Medico {
    private int identificacion;
    private String especialidad;
    private int numeroLicencia;
    private String universidad;
    
    public Medico(){}
    
    public void setIdentificacion(int identificacion){
        this.identificacion=identificacion;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia=numeroLicencia;
    }
    
    public int getNumeroLicencia(){
        return numeroLicencia;
    }
    
    public void setUniversidad(String universidad){
        this.universidad=universidad;
    }
    
    public String getUniversidad(){
        return universidad;
    }
    
}
