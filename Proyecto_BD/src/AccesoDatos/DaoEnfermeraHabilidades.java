/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.EnfermeraHabilidades;
import Logica.HistoriaClinica;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoEnfermeraHabilidades {
    FachadaBD fachada;
    
    public DaoEnfermeraHabilidades() {
        
        fachada = new FachadaBD();
        
    }
    
     public int Insert_enfermerahabilidades(EnfermeraHabilidades enfermerahabilidades){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO enfermera_habilidades"
                + "VALUES ('"
                + enfermerahabilidades.getIdentificacion()+"', '"
                + enfermerahabilidades.getHabilidad()+"' '"
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
    
     public int Update_enfermerahabilidades(EnfermeraHabilidades enfermerahabilidades){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE enfermera_habilidades SET "
                + "identificacion = '"+enfermerahabilidades.getIdentificacion()+"', "
                + "habilidad = '"+enfermerahabilidades.getIdentificacion()+"' ";
        
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
