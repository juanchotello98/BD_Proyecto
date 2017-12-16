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
public class Empleado extends Persona {

    private String salario;
    private String cargo;
    private String email;
    private String codigoJefe;
    private String codigoArea;
    
    public Empleado(String identificacion){
        super(identificacion);
    }

    public void setSalario (String salario){
        this.salario=salario;
    }
    
    public String getSalario(){
        return salario;
    }
    
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCodigoJefe (String codigoJefe){
        this.codigoJefe=codigoJefe;
    }
    
    public String getCodigoJefe(){
        return codigoJefe;
    }
    
    public void setCodigoArea ( String codigoArea){
        this.codigoArea=codigoArea;
    }
    
    public String getCodigoArea(){
        return codigoArea;
    }
}
