/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Logica.HistoriaClinica;
import AccesoDatos.DaoHistoriaClinica;


/**
 *
 * @author Juan David
 */
public class ControladorHistoriaClinica {
    
    DaoHistoriaClinica daoHistoriaClinica;
    
    
    public ControladorHistoriaClinica(){
        
        daoHistoriaClinica = new DaoHistoriaClinica();
    }
    
    public int Insert_historiaClinica(String fechaApertura, String idPaciente){
        
        HistoriaClinica historiaClinica = new HistoriaClinica(); 
        
        historiaClinica.setFechaApertura(fechaApertura);
        historiaClinica.setIdPaciente(idPaciente);
        
        System.out.println("Se insertara un registro de HistoriaClinica");
        
        int resultado = daoHistoriaClinica.Insert_historiaClinica(historiaClinica);
        
        System.out.println("Se inserto un registro de HistoriaClinica");
        
        return resultado;
        
    }

    public int Update_historiaClinica(String numeroHistoria, String fechaApertura, String idPaciente){
        
        HistoriaClinica historiaClinica = new HistoriaClinica(); 
        
        historiaClinica.setNumeroHistoria(numeroHistoria);
        historiaClinica.setFechaApertura(fechaApertura);
        historiaClinica.setIdPaciente(idPaciente);
        
        System.out.println("Se actualizara un registro de HistoriaClinica");
        
        int resultado = daoHistoriaClinica.Update_historiaClinica(historiaClinica);
        
        System.out.println("Se actualizo un registro de HistoriaClinica");
        
        return resultado;
        
    }    
    
}
