/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.HistoriaClinica;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoHistoriaClinica {
    FachadaBD fachada;
    
    public DaoHistoriaClinica() {
        fachada = new FachadaBD();
    }
    
     public int Insert_historiaClinica(HistoriaClinica historiaClinica){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO HistoriaClinica "
                + "VALUES ( nextval('historia_seq'), '"
                + historiaClinica.getFechaApertura()+"', '"
                + historiaClinica.getIdPaciente()+"' "
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
    
     public int Update_historiaClinica(HistoriaClinica historiaClinica){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE HistoriaClinica SET "
                + "numero_historia = '"+historiaClinica.getNumeroHistoria()+"', "
                + "fecha_apertura = '"+historiaClinica.getFechaApertura()+"', "
                + "id_paciente = '"+historiaClinica.getIdPaciente()+"' ";
        
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
