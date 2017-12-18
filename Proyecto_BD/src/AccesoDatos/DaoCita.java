/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Camas;
import Logica.Cita;
import Logica.Paciente;
import Logica.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kevin
 */
public class DaoCita {
    FachadaBD fachada;

    public DaoCita() {
        fachada = new FachadaBD();
    }
    
    public int Insert_cita(Cita cita){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO cita "
                + "VALUES (nextval('cita_seq'), '"
                + cita.getIdPaciente()+"', '"
                + cita.getIdMedico()+"', '"
                + cita.getHora()+"', '"
                + cita.getFecha()+"', '"
                + cita.getEstado()+"', '"
                + cita.getValorConsulta()+"' "
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
    
     public int Update_cita(Cita cita,String id ){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE cita SET "
                + "id_paciente = '"+cita.getIdPaciente()+"', "
                + "id_medico = '"+cita.getIdMedico()+"', "
                + "hora = '"+cita.getHora()+"', "
                + "fecha = '"+cita.getFecha()+"', "
                + "estado = '"+cita.getEstado()+"', "
                + "valor_consulta = '"+cita.getValorConsulta()+"' "
                + "WHERE id_cita= '"+id+"' ";
        
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
     
     public boolean Coprobar_Cita(String idPaciente, String idMedico, String hora, String fecha){
        
        String sql_select,idpaciente="", idmedico="", Hora="", Fecha="";
        int numFilas=0;
        sql_select="SELECT id_paciente, id_medico, hora, fecha FROM cita "
                +  "WHERE id_paciente = '"+idPaciente+"' " 
                +  "AND id_medico = '" + idMedico + "' " 
                +  "AND hora = '" + hora + "' " 
                +  "AND fecha = '" + fecha + "' ";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement(); 
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("up " + numFilas);
            
            while(tabla.next()){
                idpaciente = tabla.getString(1);
                idmedico = tabla.getString(2);
                Hora = tabla.getString(3);
                Fecha = tabla.getString(4);
            }
            return idPaciente.equals(idpaciente) && idMedico.equals(idmedico) && Hora.equals(hora+":00") && fecha.equals(Fecha);
               
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return false;
    }
     
     public void Select_cita(Cita cita,String id){
        
        String sql_select;
        int numFilas=0;
         sql_select="SELECT * FROM cita "
                +  "WHERE id_cita= '"+id+"' ";
        
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement(); 
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("up " + numFilas);
            
            while(tabla.next()){
                cita.setId(tabla.getString(1));
                cita.setIdPaciente(tabla.getString(2));
                cita.setIdMedico(tabla.getString(3));
                cita.setHora(tabla.getString(4));
                cita.setFecha(tabla.getString(5));
                cita.setEstado(tabla.getString(6));
                cita.setValorConsulta(tabla.getString(7));
            }
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
     
     }
     public void Select_tablacita(DefaultTableModel model){
        String sql_select;
        sql_select="SELECT id_paciente,id_medico,hora,fecha,nombre,valor_consulta FROM cita "
                +  "INNER JOIN persona ON persona.identificacion=cita.id_medico";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[6];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 6; i++)
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
     
    public void Buscar(Persona persona,String id,String fecha,String Hora){
        String sql_select,paciente="";
        int numFilas=0;
         sql_select="SELECT persona.nombre,persona.identificacion FROM cita "
                 + "INNER JOIN persona on persona.identificacion=cita.id_paciente "
                +  "WHERE id_medico= '"+id+"' "
                 + "AND fecha = '"+fecha+"' "
                 + "AND hora ='"+Hora+"' ";
        try{
            Connection con= fachada.getConnetion();
            Statement sentencia = con.createStatement(); 
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("up " + numFilas);
            
            while(tabla.next()){
                persona.setNombre(tabla.getString(1));
                persona.setIDentificacion(tabla.getString(2));
                
            }
        }catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
}
