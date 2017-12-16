/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Enfermera;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class DaoEnfermera {
    
    FachadaBD fachada;
    
    public DaoEnfermera() {
        fachada = new FachadaBD();
    }
    
     public int Insert_enfermera(Enfermera enfermera){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO enfermera "
                + "VALUES ('"
                + enfermera.getIdentificacion()+"', '"
                + enfermera.getTiempoExperiencia()+"' "
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
    
     public int Update_enfermera(Enfermera enfermera,String identificacion){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE enfermera SET "
                + "tiempo_experiencia = '"+enfermera.getTiempoExperiencia()+"' "
                + "WHERE identificacion = '"+identificacion+"' ";
        
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
     
     public void Select_enfemera(Enfermera enfermera,String identificacion){
      String sql_select;
        sql_select="SELECT * FROM empleado "
                +  "INNER JOIN persona ON persona.identificacion=empleado.identificacion "
                +  "INNER JOIN enfermera ON enfermera.identificacion=empleado.identificacion "
                +  "WHERE empleado.identificacion = '"+identificacion+"' AND cargo='Enfermera'" ;// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
               enfermera.setIdentificacion(tabla.getString(1));
               enfermera.setSalario(tabla.getString(2));
               enfermera.setEmail(tabla.getString(4));
               enfermera.setCodigoJefe(tabla.getString(5));
               enfermera.setCodigoArea(tabla.getString(6));
               enfermera.setNombre(tabla.getString(8));
               enfermera.setDireccion(tabla.getString(9));
               enfermera.setTelefono(tabla.getString(10));
               enfermera.setTiempoExperiencia(tabla.getString(12));
               
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
}
