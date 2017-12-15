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
    public String identificacion;
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Persona(String identificacion){
        this.identificacion=identificacion;
    }
    public Persona(String identificacion, String nombre, String direccion, String telefono){
    this.identificacion=identificacion;
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    }
    
    public void setIDentificacion (String identificacion){
        this.identificacion=identificacion;
    }
    
    public String getIdentificacion(){
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
    
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }
}
