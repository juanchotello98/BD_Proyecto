/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.PacienteCampana;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPacienteCampana {
    
    FachadaBD fachada;
    
    public DaoPacienteCampana() {
        fachada = new FachadaBD();
    }
    
     public int Insert_pacienteCampana(PacienteCampana pacienteCampana){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO Paciente_Campana"
                + "VALUES ('"
                + pacienteCampana.getId_paciente()+"', '"
                + pacienteCampana.getId_campana()+"', '"
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
    
     public int Update_pacienteCampana(PacienteCampana pacienteCampana){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE Paciente_Campana SET "
                + "id_paciente = '"+pacienteCampana.getId_paciente()+"', "
                + "id_campana = '"+pacienteCampana.getId_campana()+"', ";
        
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
