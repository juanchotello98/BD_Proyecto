/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class DaoCama {
    
    FachadaBD fachada;

    public DaoCama() {
        fachada = new FachadaBD();
    }
    
    public int Insert_camas(Camas camas){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO camas "
                + "VALUES ('"
                + camas.getNumeroCama()+"', '"
                + camas.getEstado()+"', '"
                + camas.getDescripcion()+"', '"
                + camas.getCodigoArea()+"' "
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
    
     public int Update_camas(Camas camas,String id){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE camas SET "
                + "estado = '"+camas.getEstado()+"', "
                + "descripcion = '"+camas.getDescripcion()+"', "
                + "codigo_area = '"+camas.getCodigoArea()+"' "
                + "WHERE numero_cama ='"+id+"' ";
        
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
     
      public boolean Comprobar_codigo(String id){ 
      String sql_select,codigo="";
        sql_select="SELECT numero_cama FROM camas "
                +  "WHERE numero_cama = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
      
      public void Select_cama(Camas cama,String id){ 
      String sql_select;
        sql_select="SELECT * FROM camas "
                +  "WHERE numero_cama = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                cama.setNumeroCama(tabla.getString(1));
                cama.setEstado(tabla.getString(2));
                cama.setDescripcion(tabla.getString(3));
                cama.setCodigoArea(tabla.getString(4));
            }
         }
         catch(Exception e){ System.out.println(e);}
      }
      
        public void Select_tablacamas(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT numero_cama,estado,camas.descripcion,nombre FROM camas "
                +  "INNER JOIN area ON area.codigo_area=camas.codigo_area ";
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
