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
public class Enfermera extends Empleado{
    public int identificacion;
    public String tiempoExperiencia;

    public Enfermera(int identificacion) {
        super(identificacion);
    }

    public void setIdentificacion(int identificacion){
        this.identificacion=identificacion;
    }
    
    @Override
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
