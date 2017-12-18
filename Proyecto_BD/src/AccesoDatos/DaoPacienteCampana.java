/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.PacienteCampana;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DaoPacienteCampana {
    
    FachadaBD fachada;
    
    public DaoPacienteCampana() {
        fachada = new FachadaBD();
    }
    
     public int Insert_pacienteCampana(PacienteCampana pacienteCampana){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO Paciente_Campana "
                + "VALUES ('"
                + pacienteCampana.getId_paciente()+"', '"
                + pacienteCampana.getId_campana()+"' "
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
            JOptionPane.showMessageDialog(null,"Ya estas registrado");
        }
        return -1;
    }
    
     public int Update_pacienteCampana(PacienteCampana pacienteCampana){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE Paciente_Campana SET "
                + "id_paciente = '"+pacienteCampana.getId_paciente()+"', "
                + "id_campana = '"+pacienteCampana.getId_campana()+"', ";
        
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
     
     public void select_codigo(DefaultComboBoxModel modelo){
        String sql_select;
        sql_select="SELECT codigo FROM campanapreventiva";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
     
     public boolean select_asistencia(String modelo){
        String sql_select,correcto="";
        sql_select="SELECT id_paciente FROM paciente_campana";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
               correcto= tabla.getString(1);
            }
            tabla.close();
            sentencia.close();
            return correcto.equals(modelo);
          
         }
         catch(Exception e){ System.out.println(e);}
         return false;
    }
}
