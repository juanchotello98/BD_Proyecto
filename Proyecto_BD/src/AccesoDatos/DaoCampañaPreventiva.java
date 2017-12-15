/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.CampañaPreventiva;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoCampañaPreventiva {
    
    FachadaBD fachada;

    public DaoCampañaPreventiva() {
        fachada = new FachadaBD();
    }
    
    public int Insert_campaña(CampañaPreventiva campañaPreventiva){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO CampanaPreventiva"
                + "VALUES ('"
                + campañaPreventiva.getCodigo()+"', '"
                + campañaPreventiva.getNombre()+"', '"
                + campañaPreventiva.getObjetivo()+"', "
                + campañaPreventiva.getFecha()+"', "
                + campañaPreventiva.getIdMedico()+"', "
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


public int Update_campaña(CampañaPreventiva campañaPreventiva){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE CampanaPreventiva SET "
                + "codigo = '"+campañaPreventiva.getCodigo()+"',"
                + "nombre = '"+campañaPreventiva.getNombre()+"', "
                + "objetivo = '"+campañaPreventiva.getObjetivo()+"', "
                + "fecha = '"+campañaPreventiva.getFecha()+"', "
                + "id_medico = '"+campañaPreventiva.getIdMedico()+"'; ";
        
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