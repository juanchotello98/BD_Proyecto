/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Area;
import AccesoDatos.DaoArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Juan David
 */
public class ControladorArea {
    
    DaoArea daoArea;
    
    public ControladorArea (){
        
        daoArea = new DaoArea();
    }
    
    
    public int Insert_area(String cdigoArea, String nombre, String descripcion){
        
        Area area = new Area(); 
        
        area.setCodigoArea(cdigoArea);
        area.setNombre(nombre);
        area.setDescripcion(descripcion);
        
        System.out.println("Se insertara un registro de area");
        
        int resultado = daoArea.Insert_area(area);
        
        System.out.println("Se inserto un registro de area");
        
        return resultado;
        
    }
    
    
    public int Update_area(String codigoArea, String nombre, String descripcion){
        
        Area area = new Area(); 
        
        area.setCodigoArea(codigoArea);
        area.setNombre(nombre);
        area.setDescripcion(descripcion);
        
        System.out.println("Se actualizara un registro de area");
        
        int resultado = daoArea.Update_area(area,codigoArea);
        
        System.out.println("Se actualizo un registro de area");
        
        return resultado;
        
    }
    
    public void Select_nombrearea(DefaultComboBoxModel model){
        daoArea.Select_nombrearea(model);
    }
    
    public String Select_codigoarea(String nombre){
        return daoArea.Select_codigoarea(nombre);
    }
    
    public boolean Comprobar_codigo(String id){
        return daoArea.Comprobar_codigo(id);
    }
    
     public void Select_area(Area area,String id){
        daoArea.Select_area(area, id);
    }
     
    public void Select_areatabla(DefaultTableModel model){
        daoArea.Select_areatabla(model);
    } 

}
