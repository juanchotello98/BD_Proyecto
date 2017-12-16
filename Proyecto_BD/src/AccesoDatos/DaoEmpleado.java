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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

        sql_guardar="INSERT INTO empleado "
                + "VALUES ('"
                + empleado.getIdentificacion()+"', '"
                + empleado.getSalario()+"', '"
                + empleado.getCargo()+"', '"
                + empleado.getEmail()+"', '"
                + empleado.getCodigoJefe()+"', '"
                + empleado.getCodigoArea()+"' "
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
                + "identificacion = '"+empleado.getIdentificacion()+"', "
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
    public void Select_empleado(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT empleado.identificacion,nombre,cargo FROM empleado "
                +  "INNER JOIN persona ON persona.identificacion=empleado.identificacion";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[3];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 3; i++)
                    fila[i] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
    public void Select_empleadoarea(DefaultTableModel model,String area){
      String sql_select;
        sql_select="SELECT empleado.identificacion,persona.nombre,cargo FROM empleado "
                +  "INNER JOIN persona ON persona.identificacion=empleado.identificacion "
                +  "INNER JOIN area ON area.codigo_area=empleado.codigo_area "
                +  "WHERE area.nombre='"+area+"'";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[3];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 3; i++)
                    fila[i] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
    public void Select_empleadocodigojefe(DefaultComboBoxModel modelo){ 
      String sql_select;
        sql_select="SELECT identificacion FROM empleado ";
       
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
    
    public String Select_empleadonombrejefe(String identificacion){ 
      String sql_select,nombre = "";
        sql_select="SELECT nombre FROM empleado "
                +  "INNER JOIN persona ON persona.identificacion=empleado.identificacion "
                +  "WHERE empleado.identificacion = '"+identificacion+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                nombre = tabla.getString(1);
            }
            
            tabla.close();
            sentencia.close();
            return nombre;
          
         }
         catch(Exception e){ System.out.println(e);}
         return nombre;
    }
   
}
