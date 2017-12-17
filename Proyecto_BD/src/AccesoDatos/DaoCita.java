/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import Logica.Cita;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Kevin
 */
public class DaoCita {
    FachadaBD fachada;

    public DaoCita() {
        fachada = new FachadaBD();
    }
    
    public int Insert_cita(Cita cita){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO cita "
                + "VALUES ('"
                + cita.getIdPaciente()+"', '"
                + cita.getIdMedico()+"', '"
                + cita.getHora()+"', '"
                + cita.getFecha()+"', '"
                + cita.getEstado()+"', '"
                + cita.getValorConsulta()+"' "
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
    
     public int Update_cita(Cita cita){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE cita SET "
                + "id_paciente = '"+cita.getIdPaciente()+"', "
                + "id_medico = '"+cita.getIdMedico()+"', "
                + "hora = '"+cita.getHora()+"', "
                + "fecha = '"+cita.getFecha()+"', "
                + "estado = '"+cita.getEstado()+"', "
                + "valor_consulta = '"+cita.getValorConsulta()+"' ";
        
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
     
     public boolean Coprobar_Cita(String idPaciente, String idMedico, String hora, String fecha){
        
        String sql_select,idpaciente="", idmedico="", Hora="", Fecha="";
        int numFilas=0;

        sql_select="SELECT id_paciente, id_medico, hora, fecha FROM cita"
                +  "WHERE id_paciente = '"+idPaciente+" ' " 
                +  "AND id_medico = ' " + idMedico + "'" 
                +  "AND hora = '" + hora + "'" 
                +  "AND fecha = '" + fecha + "' ";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement(); 
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("up " + numFilas);
            
            while(tabla.next()){
                idpaciente = tabla.getString(1);
                idmedico = tabla.getString(2);
                Hora = tabla.getString(3);
                Fecha = tabla.getString(4);
            }
            return idPaciente.equals(idpaciente) && idMedico.equals(idmedico) && hora.equals(Hora) && fecha.equals(Fecha);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return false;
    }
     
     
}
