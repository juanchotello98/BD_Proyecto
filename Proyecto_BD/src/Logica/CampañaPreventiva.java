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
public class CampañaPreventiva {
   private String codigo;
   private String nombre;
   private String objetivo;
   private String fecha;
   private String idMedico;
   
   public CampañaPreventiva(){}
   
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setObjetivo(String objetivo){
        this.objetivo=objetivo;
    }
    
    public String getObjetivo(){
        return objetivo;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setIdMedico(String idMedico){
        this.idMedico=idMedico;
    }
    
    public String getIdMedico(){
        return idMedico;
    }
}
