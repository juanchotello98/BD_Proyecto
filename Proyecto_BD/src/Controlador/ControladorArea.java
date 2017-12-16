/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Area;
import AccesoDatos.DaoArea;
import javax.swing.DefaultComboBoxModel;
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
    
    
    public int Update_area(String cdigoArea, String nombre, String descripcion){
        
        Area area = new Area(); 
        
        area.setCodigoArea(cdigoArea);
        area.setNombre(nombre);
        area.setDescripcion(descripcion);
        
        System.out.println("Se actualizara un registro de area");
        
        int resultado = daoArea.Update_area(area);
        
        System.out.println("Se actualizo un registro de area");
        
        return resultado;
        
    }
    
    public void Select_nombrearea(DefaultComboBoxModel model){
        daoArea.Select_nombrearea(model);
    }

}
