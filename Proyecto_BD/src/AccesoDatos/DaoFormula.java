/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;


import Logica.Formula;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoFormula {
    FachadaBD fachada;
    
    public DaoFormula() {
        fachada = new FachadaBD();
    }
    
     public int Insert_formula(Formula formula){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO formula "
                + "VALUES ('"
                + formula.getId_formula()+"', '"
                + formula.getId_medico()+"', '"
                + formula.getId_paciente()+"', '"
                + formula.getFecha()+"' "
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
    
     public int Update_formula(Formula formula){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE formula SET "
                + "id_formula = '"+formula.getId_formula()+"', "
                + "id_medico = '"+formula.getId_medico()+"', "
                + "id_paciente = '"+formula.getId_paciente()+"', "
                + "fecha = '"+formula.getFecha()+"', ";
        
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
     
      public boolean Comprobar_id(String id){ 
      String sql_select,codigo="";
        sql_select="SELECT id_formula FROM formula "
                +  "WHERE id_formula = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                codigo = tabla.getString(1);
            }
            if(codigo.equals(id)){
                tabla.close();
                sentencia.close();
                return true;
            }else{
                tabla.close();
                sentencia.close();
                return false;
            }
         }
         catch(Exception e){ System.out.println(e);}
         return false;
    }
      
    public void Select_cama(Formula formula,String id){ 
      String sql_select;
        sql_select="SELECT * FROM formula "
                +  "WHERE id_formula = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                formula.setId_formula(tabla.getString(1));
                formula.setId_medico(tabla.getString(2));
                formula.setId_paciente(tabla.getString(3));
                formula.setFecha(tabla.getString(4));
            }
         }
         catch(Exception e){ System.out.println(e);}
      }
}
