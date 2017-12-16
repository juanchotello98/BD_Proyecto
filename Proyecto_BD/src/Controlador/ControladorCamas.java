/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoCama;
import Logica.Camas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ControladorCamas {
    
    DaoCama daoCama;

    public ControladorCamas() {
        daoCama = new DaoCama();
    }
    
     public int Insert_camas(String numero_cama, String estado, String descripcion, String codigo_area){
        
        Camas camas = new Camas();
        
        camas.setNumeroCama(numero_cama);
        camas.setEstado(estado);
        camas.setDescripcion(descripcion);
        camas.setCodigoArea(codigo_area);
        
        System.out.println("Se insertara un registro de camas");
        
        int resultado = daoCama.Insert_camas(camas);
        
        System.out.println("Se inserto un registro de camas");
        
        return resultado;
        
    }
    
    public int Update_camas(String numero_cama, String estado, String descripcion, String codigo_area){
        
       Camas camas = new Camas();
        
        camas.setNumeroCama(numero_cama);
        camas.setEstado(estado);
        camas.setDescripcion(descripcion);
        camas.setCodigoArea(codigo_area);
        
        System.out.println("Se actualizara un registro de agenda");
        
        int resultado = daoCama.Update_camas(camas,numero_cama);
        
        System.out.println("Se actualizo un registro de agenda");
        
        return resultado;
        
    }
    
    public boolean Comprobar_codigo(String id){
        return daoCama.Comprobar_codigo(id);
    }
    
    public void Select_cama(Camas cama,String id){
        daoCama.Select_cama(cama, id);
    }
    
    public void Select_tablacamas(DefaultTableModel model){
        daoCama.Select_tablacamas(model);
    }
    
}
