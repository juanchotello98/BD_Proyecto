/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoAgenda;
import Logica.Agenda;
/**
 *
 * @author Juan David
 */
public class ControladorAgenda {
    
    DaoAgenda daoAgenda;
    
    public ControladorAgenda(){
        
        daoAgenda = new DaoAgenda();
    }
    
    public int Insert_agenda(String dia, String mes, String fecha, String horario, String estado, String id_medico){
        
        Agenda agenda = new Agenda(); 
        
        agenda.setDia(dia);
        agenda.setMes(mes);
        agenda.setFecha(fecha);
        agenda.setHorario(horario);
        agenda.setEstado(estado);
        agenda.setId_medico(id_medico);
        
        System.out.println("Se insertara un registro de agenda");
        
        int resultado = daoAgenda.Insert_agenda(agenda);
        
        System.out.println("Se inserto un registro de agenda");
        
        return resultado;
        
    }
    
    public int Update_agenda(String dia, String mes, String fecha, String horario, String estado, String id_medico){
        
        Agenda agenda = new Agenda(); 
        
        agenda.setDia(dia);
        agenda.setMes(mes);
        agenda.setFecha(fecha);
        agenda.setHorario(horario);
        agenda.setEstado(estado);
        agenda.setId_medico(id_medico);
        
        System.out.println("Se actualizara un registro de agenda");
        
        int resultado = daoAgenda.Update_agenda(agenda);
        
        System.out.println("Se actualizo un registro de agenda");
        
        return resultado;
        
    }
    
    
    
    
}
