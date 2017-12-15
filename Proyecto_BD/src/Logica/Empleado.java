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

    private int salario;
    private String cargo;
    private String email;
    private int codigoJefe;
    private int codigoArea;
    
    public Empleado(int identificacion){super(identificacion);}
    
    public Empleado(int identificacion, int salario, String cargo, String email, int codigoJefe,
       int codigoArea){
        super(identificacion);
        this.salario=salario;
        this.cargo=cargo;
        this.email=email;
        this.codigoJefe=codigoJefe;
        this.codigoArea=codigoArea;
    }
	
    public void setSalario (int salario){
        this.salario=salario;
    }
    
    public int getSalario(){
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
    
    public void setCodigoJefe (int codigoJefe){
        this.codigoJefe=codigoJefe;
    }
    
    public int getCodigoJefe(){
        return codigoJefe;
    }
    
    public void setCodigoArea (int codigoArea){
        this.codigoArea=codigoArea;
    }
    
    public int getCodigoArea(){
        return codigoArea;
    }
}
