/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Causas;
import AccesoDatos.DaoCausas;
/**
 *
 * @author Juan David
 */
public class ControladorCausas {
    
    DaoCausas daoCausas;
    
    public ControladorCausas (){
        
        daoCausas = new DaoCausas();
    }
    
    
    public int Insert_causas(String codigo, String nombre, String descripcion){
        
        Causas causas = new Causas(); 
        
        causas.setCodigo(codigo);
        causas.setNombre(nombre);
        causas.setDescripcion(descripcion);
        
        System.out.println("Se insertara un registro de causas");
        
        int resultado = daoCausas.Insert_causas(causas);
        
        System.out.println("Se inserto un registro de causas");
        
        return resultado;
        
    }
    
    public int Update_causas(String codigo, String nombre, String descripcion){
        
        Causas causas = new Causas(); 
        
        causas.setCodigo(codigo);
        causas.setNombre(nombre);
        causas.setDescripcion(descripcion);
        
        System.out.println("Se actualizara un registro de causas");
        
        int resultado = daoCausas.Update_causas(causas);
        
        System.out.println("Se actualizo un registro de causas");
        
        return resultado;
        
    }    
    
}
