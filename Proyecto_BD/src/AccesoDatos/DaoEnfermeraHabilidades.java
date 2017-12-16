/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.EnfermeraHabilidades;
import Logica.HistoriaClinica;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

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

        sql_guardar="INSERT INTO enfermera_habilidades "
                + "VALUES ('"
                + enfermerahabilidades.getIdentificacion()+"', '"
                + enfermerahabilidades.getHabilidad()+"' "
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
     
     public void Select_habilidades(DefaultComboBoxModel modelo,String identificacion){ 
      String sql_select;
        sql_select="SELECT habilidad FROM enfermera_habilidades "
                +  "WHERE identificacion ='"+identificacion+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                modelo.addElement(tabla.getString(1));
            }
            tabla.close();
            sentencia.close();
          
         }
         catch(Exception e){ System.out.println(e);}
    }
     
    public void Delete_habilidad(String Identificacion,String habilidad){
        String sql_select;
        int numFilas=0;
        sql_select=" DELETE FROM enfermera_habilidades "
                +  " WHERE identificacion = '" + Identificacion + "' "
                +  " AND habilidad = '"+habilidad+"' ";
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);         
            System.out.println("up " + numFilas);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
    
}
