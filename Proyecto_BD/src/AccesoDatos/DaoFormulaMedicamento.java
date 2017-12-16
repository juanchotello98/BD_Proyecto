/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.FormulaMedicamento;
import Logica.Registro;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoFormulaMedicamento {
    FachadaBD fachada;
    public DaoFormulaMedicamento() {
        fachada = new FachadaBD();
    }
    
     public int Insert_formulamedicamento(FormulaMedicamento formulamedicamento){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO formula_medicamento"
                + "VALUES ('"
                + formulamedicamento.getId_formula()+"', '"
                + formulamedicamento.getCodigo_medicamento()+"', '"
                + formulamedicamento.getCantidad()+"' "
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
    
     public int Update_formulamedicamento(FormulaMedicamento formulamedicamento){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE formula_medicamento SET "
                + "id_formula = '"+formulamedicamento.getId_formula()+"', "
                + "codigo_medicamento = '"+formulamedicamento.getCodigo_medicamento()+"', "
                + "cantidad = '"+formulamedicamento.getCantidad()+"' ";
        
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
