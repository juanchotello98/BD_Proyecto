/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoCampanaPreventiva;
import Logica.CampanaPreventiva;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ControladorCampanaPreventiva {
    
    DaoCampanaPreventiva daoCampanaPreventiva;
    
    public ControladorCampanaPreventiva() {
        daoCampanaPreventiva = new DaoCampanaPreventiva();
    }
    
     public int Insert_campanapreventiva(String codigo, String nombre, String objetivo, String fecha, String id_medico){
        
        CampanaPreventiva campanapreventiva = new CampanaPreventiva();
        
        campanapreventiva.setCodigo(codigo);
        campanapreventiva.setNombre(nombre);
        campanapreventiva.setObjetivo(objetivo);
        campanapreventiva.setFecha(fecha);
        campanapreventiva.setIdMedico(id_medico);
        
        System.out.println("Se insertara un registro de campaña preventiva");
        
        int resultado = daoCampanaPreventiva.Insert_campaña(campanapreventiva);
        
        System.out.println("Se inserto un registro de campaña preventiva");
        
        return resultado;
        
    }
    
    public int Update_campanapreventiva(String codigo, String nombre, String objetivo, String fecha, String id_medico){
        
       CampanaPreventiva campanapreventiva = new CampanaPreventiva();
        
        campanapreventiva.setCodigo(codigo);
        campanapreventiva.setNombre(nombre);
        campanapreventiva.setObjetivo(objetivo);
        campanapreventiva.setFecha(fecha);
        campanapreventiva.setIdMedico(id_medico);
        
        System.out.println("Se actualizara un campaña preventiva");
        
        int resultado = daoCampanaPreventiva.Update_campaña(campanapreventiva, codigo);
        
        System.out.println("Se actualizo un campaña preventiva");
        
        return resultado;
        
    }
    public boolean Select_codigoCampa(String id){
        return daoCampanaPreventiva.Select_codigoCampa(id);
    }
    
    public void Select_Campa(CampanaPreventiva campana, String id){
        daoCampanaPreventiva.Select_Campa(campana,id);
    }
    
    public void Select_tablacampana(DefaultTableModel modelo){
        daoCampanaPreventiva.Select_tablacampana(modelo);
    }
}
