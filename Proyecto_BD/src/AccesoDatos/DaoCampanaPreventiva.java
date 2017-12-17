/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.CampanaPreventiva;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class DaoCampanaPreventiva {
    
    FachadaBD fachada;

    public DaoCampanaPreventiva() {
        fachada = new FachadaBD();
    }
    
    public int Insert_campaña(CampanaPreventiva campañaPreventiva){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO CampanaPreventiva "
                + " VALUES ('"
                + campañaPreventiva.getCodigo()+"', '"
                + campañaPreventiva.getNombre()+"', '"
                + campañaPreventiva.getObjetivo()+"', '"
                + campañaPreventiva.getFecha()+"', '"
                + campañaPreventiva.getIdMedico()+"' "
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


public int Update_campaña(CampanaPreventiva campañaPreventiva,String codigo){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE CampanaPreventiva SET "
                + "codigo = '"+campañaPreventiva.getCodigo()+"', "
                + "nombre = '"+campañaPreventiva.getNombre()+"', "
                + "objetivo = '"+campañaPreventiva.getObjetivo()+"', "
                + "fecha = '"+campañaPreventiva.getFecha()+"', "
                + "id_medico = '"+campañaPreventiva.getIdMedico()+"' "
                + "WHERE codigo ='"+codigo+"'";
        
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

    public boolean Select_codigoCampa(String id){
        String sql_select,codigo="";
        sql_select="SELECT codigo FROM campanapreventiva "
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
    
    public void Select_Campa(CampanaPreventiva campana, String id){
        String sql_select,codigo="";
        sql_select="SELECT * FROM campanapreventiva "
                +  "WHERE codigo = '"+id+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                campana.setCodigo(tabla.getString(1));
                campana.setNombre(tabla.getString(2));
                campana.setObjetivo(tabla.getString(3));
                campana.setFecha(tabla.getString(4));
                campana.setIdMedico(tabla.getString(5));
            }
         }
         catch(Exception e){ System.out.println(e);}
    }
    
      public void Select_tablacampana(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT codigo,campanapreventiva.nombre,objetivo,fecha,persona.nombre FROM campanapreventiva "
                +  "INNER JOIN persona ON persona.identificacion=campanapreventiva.id_medico ";
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