/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoEnfermera;
import Logica.Enfermera;

/**
 *
 * @author Kevin
 */
public class ControladorEnfermera {
    DaoEnfermera daoEnfermera;

    public ControladorEnfermera() {
        daoEnfermera = new DaoEnfermera();
    }
    
     public int Insert_enfermera(String identificacion,String tiempo_experiencia){
        
        Enfermera enfermera = new Enfermera(identificacion);
       
        enfermera.setTiempoExperiencia(tiempo_experiencia);
        
        System.out.println("Se insertara un registro a enfermera");
        
        int resultado = daoEnfermera.Insert_enfermera(enfermera);
        
        System.out.println("Se inserto un registro a enfermera");
        
        return resultado;
        
    }
    
    public int Update_enfermera(String identificacion,String tiempo_experiencia){
        
        Enfermera enfermera = new Enfermera(identificacion);
       
        enfermera.setTiempoExperiencia(tiempo_experiencia);
        
        System.out.println("Se actualizara un registro de enfermera");
        
        int resultado = daoEnfermera.Update_enfermera(enfermera,identificacion);
        
        System.out.println("Se actualizo un registro de enfermera");
        
        return resultado;
        
    }
    
    public void Select_enfermera(Enfermera enfermera,String identificacion){
        daoEnfermera.Select_enfemera(enfermera, identificacion);
    }
    
}
