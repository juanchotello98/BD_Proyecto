/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Medicamento;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoMedicamento {
    
    FachadaBD fachada;
    
    public DaoMedicamento() {
        fachada = new FachadaBD();
    }
    
     public int Insert_medicamento(Medicamento medicamento){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO medicamento"
                + "VALUES ('"
                + medicamento.getCodigo()+"', '"
                + medicamento.getNombre()+"', '"
                + medicamento.getCosto()+"', "
                + medicamento.getDescripcion()+"', "
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
    
     public int Update_medicamento(Medicamento medicamento){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE medicamento SET "
                + "codigo = '"+medicamento.getCodigo()+"', "
                + "nombre = '"+medicamento.getNombre()+"', "
                + "costo = '"+medicamento.getCosto()+"', "
                + "descripcion = '"+medicamento.getDescripcion()+"', ";
        
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
