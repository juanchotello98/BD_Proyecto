/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoAgenda;
import Logica.Agenda;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Juan David
 */
public class ControladorAgenda {
    
    DaoAgenda daoAgenda;
    
    
    
    public ControladorAgenda(){
        
        daoAgenda = new DaoAgenda();
    }
   
    
    public void Insert_agenda(String id,int año){
        Agenda agenda = new Agenda();
        int total;
        String estado,codigo;
        String[] time={"8:00","8:30","9:00","9:30","10:00","10:30","11:00","11:30","12:00","12:30",
                   "13:00","13:30","14:00","14:30","15:00","15:30","16:00","16:30","17:00","17:30","18:00",
                   "18:30","19:00","19:30","20:00","20:30","21:00","21:30"};
        estado="Libre";
        
        
        for(int mes=1;mes<=12;mes++){
            total=diasdelmes(mes,año);
            for(int dia=1;dia<=total;dia++){
                for(int hora=0;hora<=27;hora++){
                    agenda.setDia(Integer.toString(dia));
                    agenda.setMes(Integer.toString(mes));
                    agenda.setHorario(time[hora]);
                    agenda.setEstado(estado);
                    agenda.setId_medico(id);
                    daoAgenda.Insert_agenda(agenda);  
                }
            }
        }
        
    }
    private void horario(){
        
       
    }
    
      private int diasdelmes(int month,int year){
       
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
               if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                   return 29;
               }else{
                   return 28;
                } 
            default:
                return 0;
                
        }
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
    
    public void Select_agenda(DefaultTableModel model,String id){
        daoAgenda.Select_agenda(model,id);
    }
    
    public void Update_agendaestado(String estado,String id,String mes,String dia,String hora){
       daoAgenda.Update_agendaestado(estado,id,mes,dia,hora);
    }
    
    public boolean comprobarfecha(String id,String mes,String dia,String hora){
       return daoAgenda.Comprobarfecha(id,mes,dia,hora);
    }
    
    public void Select_mesagenda(DefaultTableModel model,String id,String mes){
        daoAgenda.Select_mesesagenda(model,id,mes);
    }
    
}
