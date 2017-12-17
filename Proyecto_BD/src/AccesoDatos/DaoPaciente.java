/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Logica.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DaoPaciente {
    
    FachadaBD fachada;
    
    public DaoPaciente() {
        fachada = new FachadaBD();
    }
    
     public int Insert_paciente(Paciente paciente){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO paciente "
                + "VALUES ('"
                + paciente.getIdentificacion()+"', '"
                + paciente.getActividadEconomica()+"', '"
                + paciente.getNumeroSeguroSocial()+"', '"
                + paciente.getFechaNacimiento()+"' "
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
    
     public int Update_paciente(Paciente paciente){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE paciente SET "
                + "actividad_economica = '"+paciente.getActividadEconomica()+"', "
                + "numero_seguro_social = '"+paciente.getNumeroSeguroSocial()+"', "
                + "fecha_nacimiento = '"+paciente.getFechaNacimiento()+"' "
                + "WHERE identificacion = '"+paciente.getIdentificacion()+"' ";
        
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
     
      public void Select_paciente(Paciente paciente,String identificacion){
      String sql_select;
        sql_select="SELECT * FROM paciente "
                +  "INNER JOIN persona ON persona.identificacion=paciente.identificacion "
                +  "WHERE paciente.identificacion = '"+identificacion+"' " ;// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
               paciente.setIDentificacion(tabla.getString(1));
               paciente.setActividadEconomica(tabla.getString(2));
               paciente.setNumeroSeguroSocial(tabla.getString(3));
               paciente.setFechaNacimiento(tabla.getString(4));
               paciente.setNombre(tabla.getString(6));
               paciente.setDireccion(tabla.getString(7));
               paciente.setTelefono(tabla.getString(8));
               
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
      
    public void Select_pacientetabla(DefaultTableModel model){
      String sql_select;
        sql_select="SELECT paciente.identificacion,nombre,direccion,telefono,actividad_economica,"
                + "numero_seguro_social,fecha_nacimiento FROM paciente "
                +  "INNER JOIN persona ON persona.identificacion=paciente.identificacion ";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[7];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 7; i++)
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
    
     public void Select_idpaciente(DefaultComboBoxModel modelo){
        String sql_select;
        sql_select="SELECT identificacion FROM paciente";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
}
