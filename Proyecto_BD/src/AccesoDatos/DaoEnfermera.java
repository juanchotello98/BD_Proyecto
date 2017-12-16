/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Enfermera;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoEnfermera {
    
    FachadaBD fachada;
    
    public DaoEnfermera() {
        fachada = new FachadaBD();
    }
    
     public int Insert_enfermera(Enfermera enfermera){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO enfermera "
                + "VALUES ('"
                + enfermera.getIdentificacion()+"', '"
                + enfermera.getTiempoExperiencia()+"', "
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
    
     public int Update_enfermera(Enfermera enfermera){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE enfermera SET "
                + "identificacion = '"+enfermera.getIdentificacion()+"', "
                + "tiempo_experiencia = '"+enfermera.getTiempoExperiencia()+"', ";
        
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
