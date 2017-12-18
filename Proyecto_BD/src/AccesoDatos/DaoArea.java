/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Area;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DaoArea {
    
    FachadaBD fachada;
    
    public DaoArea() {
        fachada = new FachadaBD();
    }
    
    
    
    
    
    public int Insert_area(Area area){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO area "
                + "VALUES ('"
                + area.getCodigoArea()+"', '"
                + area.getNombre()+"', '"
                + area.getDescripcion()+"' "
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
    
     public int Update_area(Area area,String id){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE area SET "
                + "codigo_area = '"+area.getCodigoArea()+"', "
                + "nombre = '"+area.getNombre()+"', "
                + "descripcion = '"+area.getDescripcion()+"' "
                + "WHERE codigo_area = '"+id+"' ";
        
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
    public void Select_nombrearea(DefaultComboBoxModel modelo){ 
      String sql_select;
        sql_select="SELECT nombre FROM area";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
    
    public String Select_codigoarea(String nombre){ 
      String sql_select,codigo="";
        sql_select="SELECT codigo_area FROM area "
                +  "WHERE nombre = '"+nombre+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                codigo = tabla.getString(1);
            }
            tabla.close();
            sentencia.close();
            return codigo;
         }
         catch(Exception e){ System.out.println(e);}
         return codigo;
    }
    
    public boolean Comprobar_codigo(String id){ 
      String sql_select,codigo="";
        sql_select="SELECT codigo_area FROM area "
                +  "WHERE codigo_area = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
    public void Select_area(Area area,String id){ 
      String sql_select;
        sql_select="SELECT * FROM area "
                +  "WHERE codigo_area = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                area.setCodigoArea(tabla.getString(1));
                area.setNombre(tabla.getString(2));
                area.setDescripcion(tabla.getString(3));
            }
         }
         catch(Exception e){ System.out.println(e);}
    }
   public void Select_areatabla(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT * FROM area ";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[5];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 5; i++)
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
}
