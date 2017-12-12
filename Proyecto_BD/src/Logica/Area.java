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
public class Area {
    private int codigoArea;
    private String nombre;
    private String descripcion;
    
    
    public Area(){}


    public void setCodigoArea (int codigoArea){
        this.codigoArea=codigoArea;
    }
    
    public int getCodigoArea(){
        return codigoArea;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
