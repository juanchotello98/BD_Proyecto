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
    private int numeroCama;
    private String estado;
    private String descripcion;
    private int codigoArea;
    
    public Camas(){}


    public void setNumeroCama (int numeroCama){
        this.numeroCama=numeroCama;
    }
    
    public int getNumeroCama(){
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
    
     public void setCodigoArea (int codigoArea){
        this.codigoArea=codigoArea;
    }
    
    public int getCodigoArea(){
        return codigoArea;
    }
}
