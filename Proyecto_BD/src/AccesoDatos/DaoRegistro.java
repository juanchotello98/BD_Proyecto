/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.EnfermeraHabilidades;
import Logica.Registro;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoRegistro {
    FachadaBD fachada;
    
    public DaoRegistro() {
        fachada = new FachadaBD();
    }
    
    public int Insert_registro(Registro registro){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO registro "
                + "VALUES ('"
                + registro.getIdMedico()+"', '"
                + registro.getIdHistoria()+"', '"
                + registro.getIdCausa()+"', '"
                + registro.getFecha()+"', '"
                + registro.getDescripcion()+"' "
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
    
     public int Update_registro(Registro registro){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE registro SET "
                + "id_medico = '"+registro.getIdMedico()+"', "
                + "id_historia = '"+registro.getIdHistoria()+"', "
                + "id_causa = '"+registro.getIdCausa()+"', "
                + "id_fecha = '"+registro.getFecha()+"', "
                + "descripcion = '"+registro.getDescripcion()+"' ";
        
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
