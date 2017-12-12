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
public class Enfermera {
    public int identificacion;
    public String tiempoExperiencia;
    
    public Enfermera(){
    }
    
    public void setIdentificacion(int identificacion){
        this.identificacion=identificacion;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setTiempoExperiencia(String tiempoExperiencia){
        this.tiempoExperiencia=tiempoExperiencia;
    }
    
    public String getTiempoExperiencia(){
        return tiempoExperiencia;
    }
}
