/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Agenda;
import Logica.Area;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoAgenda {
    FachadaBD fachada;
    
    public DaoAgenda() {
        fachada = new FachadaBD();
    }
    
    public int Insert_agenda(Agenda agenda){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO agenda (dia, mes, fecha, horario, estado, id_medico)"
                + "VALUES ('"
                + agenda.getDia()+"', '"
                + agenda.getMes()+"', "
                + agenda.getFecha()+"', "
                + agenda.getHorario()+"', "
                + agenda.getEstado()+"', "
                + agenda.getId_medico()+"' "
                + ")";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement();
            
            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    }
    
     public int Update_agenda(Agenda agenda){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE agenda SET "
                + "id_secuencia = '"+agenda.getId_secuencia()+"', "
                + "dia = '"+agenda.getDia()+"', "
                + "mes = '"+agenda.getMes()+"', "
                + "fecha = '"+agenda.getFecha()+"', "
                + "horario = '"+agenda.getHorario()+"', "
                + "estado = '"+agenda.getEstado()+"', "
                + "id_medico = '"+agenda.getId_medico()+"' ";
        
         try{
          
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);
            
            return numFilas;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return -1;
         
    }
     
     
     
    
}
