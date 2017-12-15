/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Logica.Paciente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPaciente {
    
    FachadaBD fachada;
    
    public DaoPaciente() {
        fachada = new FachadaBD();
    }
    
     public int Insert_paciente(Paciente paciente){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO paciente"
                + "VALUES ('"
                + paciente.getIdentificacion()+"', '"
                + paciente.getActividadEconomica()+"', '"
                + paciente.getNumeroSeguroSocial()+"', "
                + paciente.getFechaNacimiento()+"', "
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
    
     public int Update_paciente(Paciente paciente){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE paciente SET "
                + "identificacion = '"+paciente.getIdentificacion()+"',"
                + "actividad_economica = '"+paciente.getActividadEconomica()+"', "
                + "numero_seguro_social = '"+paciente.getNumeroSeguroSocial()+"', "
                + "fecha_nacimiento = '"+paciente.getFechaNacimiento()+"', ";
        
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
