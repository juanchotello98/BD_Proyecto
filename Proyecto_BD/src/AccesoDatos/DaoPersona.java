/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import Logica.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoPersona {
    FachadaBD fachada;

    public DaoPersona() {
        fachada = new FachadaBD();
    }
    
    public int Insert_persona(Persona persona){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO persona "
                + "VALUES ('"
                + persona.getIdentificacion()+"', '"
                + persona.getNombre()+"', '"
                + persona.getDireccion()+"', '"
                + persona.getTelefono()+"' "
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
    
     public int Update_camas(Persona persona){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE persona SET "
                + "identificacion = '"+persona.getIdentificacion()+"', "
                + "nombre = '"+persona.getNombre()+"', "
                + "direccion = '"+persona.getDireccion()+"', "
                + "telefono = '"+persona.getTelefono()+"' ";
        
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
