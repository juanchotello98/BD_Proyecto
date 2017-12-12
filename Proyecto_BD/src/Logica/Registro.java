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
    private int idMedico;
    private int idHistoria;
    private int idCausa;
    private String fecha;
    private String descripcion;
    
    public Registro(){}
    
    public void setIdMedico(int idMedico){
        this.idMedico=idMedico;
    }
    
    public int getIdMedico(){
        return idMedico;
    }
    
    public void setIdHistoria(int idHistoria){
        this.idHistoria=idHistoria;
    }
    
    public int getIdHistoria(){
        return idHistoria;
    }   
    
    public void setIdCausa(int idCausa){
        this.idCausa=idCausa;
    }
    
    public int getIdCausa(){
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
