/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Causas;
import Logica.Empleado;
import Logica.Enfermera;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class DaoEmpleado {
    FachadaBD fachada;
    
    public DaoEmpleado() {
        fachada = new FachadaBD();
    }
    
     public int Insert_empleado(Empleado empleado){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO empleado"
                + "VALUES ('"
                + empleado.getIdentificacion()+"', '"
                + empleado.getSalario()+"', '"
                + empleado.getCargo()+"', "
                + empleado.getEmail()+"', "
                + empleado.getCodigoJefe()+"', "
                + empleado.getCodigoArea()+"', "
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
    
     public int Update_empleado(Empleado empleado){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE empleado SET "
                + "identificacion = '"+empleado.getIdentificacion()+"',"
                + "salario = '"+empleado.getSalario()+"', "
                + "cargo = '"+empleado.getCargo()+"', "
                + "email = '"+empleado.getEmail()+"', "
                + "codigo_jefe = '"+empleado.getCodigoJefe()+"', "
                + "codigo_area = '"+empleado.getCodigoArea()+"' ";
        
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
