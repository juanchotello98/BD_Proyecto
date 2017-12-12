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
public class Persona {
    public int identificacion;
    private String nombre;
    private String direccion;
    private int telefono;
    
    public Persona(int identificacion){
        this.identificacion=identificacion;
    }
    public Persona(int identificacion, String nombre, String direccion, int telefono){
    this.identificacion=identificacion;
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    }
    
    public void setIDentificacion (int identificacion){
        this.identificacion=identificacion;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setTelefono (int telefono){
        this.telefono=telefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
}
