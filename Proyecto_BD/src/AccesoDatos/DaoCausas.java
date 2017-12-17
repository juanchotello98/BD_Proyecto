/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import Logica.Causas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class DaoCausas {
    FachadaBD fachada;

    public DaoCausas() {
        fachada = new FachadaBD();
    }
    
    public int Insert_causas(Causas causas){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO Causas "
                + "VALUES ('"
                + causas.getCodigo()+"', '"
                + causas.getNombre()+"', '"
                + causas.getDescripcion()+"' "
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
    
     public int Update_causas(Causas causas,String codigo){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE causas SET "
                + "codigo = '"+causas.getCodigo()+"', "
                + "nombre = '"+causas.getNombre()+"', "
                + "descripcion = '"+causas.getDescripcion()+"' "
                + "WHERE codigo='"+codigo+"'";
        
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
     
     public boolean Select_codigocausa(String id){
         String sql_select,codigo="";
        sql_select="SELECT codigo FROM causas "
                +  "WHERE codigo = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
     
      public void Select_causa(Causas causa,String id){
         String sql_select,codigo="";
        sql_select="SELECT * FROM causas "
                +  "WHERE codigo = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                causa.setCodigo(tabla.getString(1));
                causa.setNombre(tabla.getString(2));
                causa.setDescripcion(tabla.getString(3));
            }
         }
         catch(Exception e){ System.out.println(e);}
     }
      
    public void Select_tablacausa(DefaultTableModel model){
        String sql_select;
        sql_select="SELECT * FROM causas ";
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
}
