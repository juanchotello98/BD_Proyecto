/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Area;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

public class DaoArea {
    
    FachadaBD fachada;
    
    public DaoArea() {
        fachada = new FachadaBD();
    }
    
    
    
    
    
    public int Insert_area(Area area){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO empleado"
                + "VALUES ('"
                + area.getCodigoArea()+"', '"
                + area.getNombre()+"', '"
                + area.getDescripcion()+"' "
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
    
     public int Update_area(Area area){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE area SET "
                + "codigo_area = '"+area.getCodigoArea()+"', "
                + "nombre = '"+area.getNombre()+"', "
                + "descripcion = '"+area.getDescripcion()+"' ";
        
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
    public void Select_nombrearea(DefaultComboBoxModel modelo){ 
      String sql_select;
        sql_select="SELECT nombre FROM area";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
    
    public String Select_codigoarea(String nombre){ 
      String sql_select,codigo="";
        sql_select="SELECT codigo_area FROM area "
                +  "WHERE nombre = '"+nombre+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                codigo = tabla.getString(1);
            }
            tabla.close();
            sentencia.close();
            return codigo;
         }
         catch(Exception e){ System.out.println(e);}
         return codigo;
    }
}
