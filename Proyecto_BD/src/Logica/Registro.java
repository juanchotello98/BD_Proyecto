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
public class Registro {
    private String idMedico;
    private String idHistoria;
    private String idCausa;
    private String fecha;
    private String descripcion;
    
    public Registro(){}
    
    public void setIdMedico(String idMedico){
        this.idMedico=idMedico;
    }
    
    public String getIdMedico(){
        return idMedico;
    }
    
    public void setIdHistoria(String idHistoria){
        this.idHistoria=idHistoria;
    }
    
    public String getIdHistoria(){
        return idHistoria;
    }   
    
    public void setIdCausa(String idCausa){
        this.idCausa=idCausa;
    }
    
    public String getIdCausa(){
        return idCausa;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
