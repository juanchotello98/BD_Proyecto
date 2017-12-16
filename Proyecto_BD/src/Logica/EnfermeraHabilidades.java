/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Juan David
 */
public class EnfermeraHabilidades extends Enfermera {
    
    
    private String habilidad;
    
    public EnfermeraHabilidades(String identificacion) {
        super(identificacion);
    }


    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    } 
  
}
