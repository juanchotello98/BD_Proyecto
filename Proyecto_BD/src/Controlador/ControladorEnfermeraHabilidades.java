/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoEnfermeraHabilidades;
import Logica.EnfermeraHabilidades;

/**
 *
 * @author Kevin
 */
public class ControladorEnfermeraHabilidades {
    DaoEnfermeraHabilidades daoEnfermeraHabilidades;

    public ControladorEnfermeraHabilidades() {
        daoEnfermeraHabilidades = new DaoEnfermeraHabilidades();
    }
    
     public int Insert_enfermerahabilidades(String identificacion,String habilidad){
        
        EnfermeraHabilidades enfermerahabilidades = new EnfermeraHabilidades(identificacion);
        
        enfermerahabilidades.setHabilidad(habilidad);
        
        System.out.println("Se insertara un registro a enfermera habilidades");
        
        int resultado = daoEnfermeraHabilidades.Insert_enfermerahabilidades(enfermerahabilidades);
        
        System.out.println("Se inserto un registro a enfermera habilidades");
        
        return resultado;
        
    }
    
    public int Update_enfermerahabilidades(String identificacion,String habilidad){
        
        EnfermeraHabilidades enfermerahabilidades = new EnfermeraHabilidades(identificacion);
        
        enfermerahabilidades.setHabilidad(habilidad);
        
        System.out.println("Se actualizara un registro de enfermera habilidades");
        
        int resultado = daoEnfermeraHabilidades.Update_enfermerahabilidades(enfermerahabilidades);
        
        System.out.println("Se actualizo un registro de enfermera habilidades");
        
        return resultado;
        
    }
    
}
