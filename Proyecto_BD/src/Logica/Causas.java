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
public class Causas {
    private int codigo;
    private String nombre;
    private String descripcion;
    
    public Causas(){}
    
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
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
