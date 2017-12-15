/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import Logica.Causas;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoCausas {
    FachadaBD fachada;

    public DaoCausas() {
        fachada = new FachadaBD();
    }
    
    public int Insert_causas(Causas causas){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO Causas"
                + "VALUES ('"
                + causas.getCodigo()+"', '"
                + causas.getNombre()+"', '"
                + causas.getDescripcion()+"', "
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
    
     public int Update_causas(Causas causas){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE camas SET "
                + "codigo = '"+causas.getCodigo()+"',"
                + "nombre = '"+causas.getNombre()+"', "
                + "descripcion = '"+causas.getDescripcion()+"' ";
        
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
