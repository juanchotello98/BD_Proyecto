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
    
     public int guardarUsuario(Camas camas){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO usuario "
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
        return -2;
    }
    
     public int SaveAccount() {
        String sql;
        int numFilas = 0;

 
        try {
            Connection conx = fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            conx.close();
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public void consultarMiembro(DefaultTableModel model){
        String sql_select;
        sql_select="SELECT codigo, nombre_usuario, apellido FROM  usuario";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
    
    public void consultarMiembro2(){
        String sql_select;
        
       
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
     
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
     
}
