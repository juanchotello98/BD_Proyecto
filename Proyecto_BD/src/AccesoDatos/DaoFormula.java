/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;


import Logica.Formula;
import java.sql.Connection;
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
}
