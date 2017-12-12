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
   private int codigo;
   private String nombre;
   private String objetivo;
   private String fecha;
   private int idMedico;
   
   public CampañaPreventiva(){}
   
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public int getCodigo(){
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
    
    public void setIdMedico(int idMedico){
        this.idMedico=idMedico;
    }
    
    public int getIdMedico(){
        return idMedico;
    }
}
