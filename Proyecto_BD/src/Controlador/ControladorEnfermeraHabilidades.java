/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoEnfermeraHabilidades;
import Logica.EnfermeraHabilidades;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

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
        
        
        
        enfermerahabilidades.setIdentificacion(identificacion);
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
    
    public void Select_habilidades(DefaultComboBoxModel model,String identificacion){
        daoEnfermeraHabilidades.Select_habilidades(model, identificacion);
        
    }
    
    public void Delete_habilidades(String identificacion,String habilidad){
        daoEnfermeraHabilidades.Delete_habilidad(identificacion,habilidad);
        
    }
    
}
