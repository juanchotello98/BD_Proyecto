/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.PacienteCamas;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPacienteCamas {
    
    FachadaBD fachada;
    
    public DaoPacienteCamas() {
        fachada = new FachadaBD();
    }
    
     public int Insert_pacienteCamas(PacienteCamas pacienteCamas){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO paciente_camas"
                + "VALUES ('"
                + pacienteCamas.getId_paciente()+"', '"
                + pacienteCamas.getNumero_cama()+"', '"
                + pacienteCamas.getFecha_ingreso()+"', "
                + pacienteCamas.getFecha_salida()+"', "
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
    
     public int Update_pacienteCamas(PacienteCamas pacienteCamas){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE empleado SET "
                + "id_paciente = '"+pacienteCamas.getId_paciente()+"', "
                + "numero_cama = '"+pacienteCamas.getNumero_cama()+"', "
                + "fecha_ingreso = '"+pacienteCamas.getFecha_ingreso()+"', "
                + "fecha_salida = '"+pacienteCamas.getFecha_salida()+"' ";
        
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
