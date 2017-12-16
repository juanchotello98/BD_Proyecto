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
public class Medico extends Empleado {
    
    private String especialidad;
    private String numeroLicencia;
    private String universidad;
    private String contraseña;

    public String getContrasena() {
        return contraseña;
    }

    public void setContrasena(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Medico(String identificacion) {
        super(identificacion);
    }
    
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setNumeroLicencia(String numeroLicencia){
        this.numeroLicencia=numeroLicencia;
    }
    
    public String getNumeroLicencia(){
        return numeroLicencia;
    }
    
    public void setUniversidad(String universidad){
        this.universidad=universidad;
    }
    
    public String getUniversidad(){
        return universidad;
    }
    
}
