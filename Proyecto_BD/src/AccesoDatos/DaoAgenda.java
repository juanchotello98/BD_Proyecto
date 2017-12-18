/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Agenda;
import Logica.Area;
import Logica.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class DaoAgenda {
    FachadaBD fachada;
    
    public DaoAgenda() {
        fachada = new FachadaBD();
    }
    
    public int Insert_agenda(Agenda agenda){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO agenda (dia, mes, horario, estado, id_medico) "
                + "VALUES ('"
                + agenda.getDia()+"', '"
                + agenda.getMes()+"', '"
                + agenda.getHorario()+"', '"
                + agenda.getEstado()+"', '"
                + agenda.getId_medico()+"' "
                + ")";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement();
            
            numFilas = sentencia.executeUpdate(sql_guardar);
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
    
     public int Update_agenda(Agenda agenda){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE agenda SET "
                + "id_secuencia = '"+agenda.getId_secuencia()+"', "
                + "dia = '"+agenda.getDia()+"', "
                + "mes = '"+agenda.getMes()+"', "
                + "fecha = '"+agenda.getFecha()+"', "
                + "horario = '"+agenda.getHorario()+"', "
                + "estado = '"+agenda.getEstado()+"', "
                + "id_medico = '"+agenda.getId_medico()+"' ";
        
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
      public void Select_agenda(DefaultTableModel model,String id){
      String sql_select;
        sql_select="SELECT * FROM agenda "
                + "WHERE id_medico = '"+id+"' ORDER BY CAST(mes AS INT),CAST(dia AS INT),horario";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[5];
		//llenar cada columna con lo datos almacenados
		for (int i = 1; i < 5; i++)
                    fila[i-1] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
     
       public int Update_agendaestado(String estado,String id,String mes,String dia,String hora){
         
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE agenda SET "
                + "estado = '"+estado+"' "
                + "WHERE id_medico= '"+id+"' "
                + "AND dia ='"+dia+"' "
                + "AND mes ='"+mes+"' "
                + "AND horario ='"+hora+"' ";
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
    public boolean Comprobarfecha(String id,String mes,String dia,String hora){
      String sql_select,estado="";
        sql_select="SELECT estado FROM agenda "
                + "WHERE id_medico= '"+id+"' "
                + "AND dia ='"+dia+"' "
                + "AND mes ='"+mes+"' "
                + "AND horario ='"+hora+"' ";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                estado=tabla.getString(1);
            }
            
            tabla.close();
            sentencia.close();
            return estado.equals("Ocupado");
            
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return false;
    }
    
    public void Select_mesesagenda(DefaultTableModel model,String id,String mes){
      String sql_select;
        sql_select="SELECT * FROM agenda "
                + "WHERE id_medico = '"+id+"' "
                + "AND mes ='"+mes+"'  ORDER BY CAST(dia AS INT) asc,horario" ;
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[5];
		//llenar cada columna con lo datos almacenados
		for (int i = 1; i < 5; i++)
                    fila[i-1] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
    
    public boolean Buscar(String id,String mes,String dia,String hora){
      String sql_select,estado="";
        sql_select="SELECT estado FROM agenda "
                + "WHERE id_medico= '"+id+"' "
                + "AND dia ='"+dia+"' "
                + "AND mes ='"+mes+"' "
                + "AND horario ='"+hora+"' ";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            JOptionPane.showMessageDialog(null, sql_select);
            while(tabla.next()){
                estado=tabla.getString(1);
            }
            JOptionPane.showMessageDialog(null, estado);
            tabla.close();
            sentencia.close();
            return estado.equals("Ocupado");
            
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return false;
    }
    
    
}
