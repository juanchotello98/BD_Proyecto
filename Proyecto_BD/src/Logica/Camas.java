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
public class Camas {
    private String numeroCama;
    private String estado;
    private String descripcion;
    private String codigoArea;
    
    public Camas(){}


    public void setNumeroCama (String numeroCama){
        this.numeroCama=numeroCama;
    }
    
    public String getNumeroCama(){
        return numeroCama;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
     public void setCodigoArea (String codigoArea){
        this.codigoArea=codigoArea;
    }
    
    public String getCodigoArea(){
        return codigoArea;
    }
}
