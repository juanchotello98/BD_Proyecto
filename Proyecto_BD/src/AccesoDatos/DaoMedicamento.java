/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Medicamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class DaoMedicamento {
    
    FachadaBD fachada;
    
    public DaoMedicamento() {
        fachada = new FachadaBD();
    }
    
     public int Insert_medicamento(Medicamento medicamento){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO medicamento"
                + " VALUES ('"
                + medicamento.getCodigo()+"', '"
                + medicamento.getNombre()+"', '"
                + medicamento.getCosto()+"', '"
                + medicamento.getDescripcion()+"' "
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
    
     public int Update_medicamento(Medicamento medicamento, String codigo){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE medicamento SET "
                + "codigo = '"+medicamento.getCodigo()+"', "
                + "nombre = '"+medicamento.getNombre()+"', "
                + "costo = '"+medicamento.getCosto()+"', "
                + "descripcion = '"+medicamento.getDescripcion()+"' "
                + "WHERE medicamento.codigo = '"+codigo+"'";
        
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
     
    public boolean Comprobar_Medicamento(String codigo){
        
        String sql_select, Codigo="";
        int numFilas=0;

        sql_select="SELECT codigo FROM medicamento "
                +  "WHERE codigo = '"+codigo+"' ";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement(); 
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("up " + numFilas);
            
            while(tabla.next()){
                Codigo = tabla.getString(1);
            }
            return codigo.equals(Codigo);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return false;
    }
    
    public void Select_medicamento(Medicamento medicamento,String codigo){
        String sql_select;
        sql_select="SELECT * FROM medicamento "
                +  "WHERE medicamento.codigo = '"+codigo+"'" ;//
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
               medicamento.setCodigo(tabla.getString(1));
               medicamento.setNombre(tabla.getString(2));
               medicamento.setCosto(tabla.getString(3));
               medicamento.setDescripcion(tabla.getString(4));               
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
    public void Select_medicamentoTabla(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT * FROM medicamento ";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[4];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 4; i++)
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
