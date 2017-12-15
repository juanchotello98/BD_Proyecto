/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Medico;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoMedico {
    
    FachadaBD fachada;
    
    public DaoMedico() {
        fachada = new FachadaBD();
    }
    
     public int Insert_medico(Medico medico){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO medico"
                + "VALUES ('"
                + medico.getIdentificacion()+"', '"
                + medico.getEspecialidad()+"', '"
                + medico.getNumeroLicencia()+"', "
                + medico.getUniversidad()+"', "
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
    
     public int Update_medico(Medico medico){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE medico SET "
                + "identificacion = '"+medico.getIdentificacion()+"', "
                + "especialidad = '"+medico.getEspecialidad()+"', "
                + "numero_licencia = '"+medico.getNumeroLicencia()+"', "
                + "universidad = '"+medico.getUniversidad()+"', ";
        
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
