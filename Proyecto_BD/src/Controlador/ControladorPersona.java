/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoPersona;
import Logica.Persona;

/**
 *
 * @author Kevin
 */
public class ControladorPersona {
    DaoPersona daoPersona;

    public ControladorPersona() {
        daoPersona = new DaoPersona();
    }
    
    public int Insert_persona(String identificacion,String nombre,String direccion,String telefono){
        
        Persona persona = new Persona(identificacion);
        
        persona.setIDentificacion(identificacion);
        persona.setNombre(nombre);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        
        System.out.println("Se insertara un registro a persona");
        
        int resultado = daoPersona.Insert_persona(persona);
        
        
        System.out.println("Se inserto un registro a persona");
        
        return resultado;
        
    }
    
    public int Update_persona(String identificacion,String nombre,String direccion,String telefono){
        
        Persona persona = new Persona(identificacion);
        
        persona.setIDentificacion(identificacion);
        persona.setNombre(nombre);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        
        System.out.println("Se actualizara un registro de persona");
        
        int resultado = daoPersona.Update_camas(persona);
        
        System.out.println("Se actualizo un registro de persona");
        
        return resultado;
        
    }
    
}
