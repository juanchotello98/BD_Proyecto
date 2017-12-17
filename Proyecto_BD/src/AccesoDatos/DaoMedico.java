/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Logica.Medico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DaoMedico {
    
    FachadaBD fachada;
    
    public DaoMedico() {
        fachada = new FachadaBD();
    }
    
     public int Insert_medico(Medico medico){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO medico "
                + "VALUES ('"
                + medico.getIdentificacion()+"', '"
                + medico.getEspecialidad()+"', '"
                + medico.getNumeroLicencia()+"', '"
                + medico.getUniversidad()+"' "
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
    
     public int Update_medico(Medico medico,String identificacion){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE medico SET "
                + "identificacion = '"+medico.getIdentificacion()+"', "
                + "especialidad = '"+medico.getEspecialidad()+"', "
                + "numero_licencia = '"+medico.getNumeroLicencia()+"', "
                + "universidad = '"+medico.getUniversidad()+"' "
                + "WHERE identificacion = '"+identificacion+"' ";
        
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
     
      public void Select_medico(Medico medico,String identificacion){
      String sql_select;
        sql_select="SELECT * FROM empleado "
                +  "INNER JOIN persona ON persona.identificacion=empleado.identificacion "
                +  "INNER JOIN medico ON medico.identificacion=empleado.identificacion "
                +  "WHERE empleado.identificacion = '"+identificacion+"' AND cargo='Medico'" ;// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
               medico.setIdentificacion(tabla.getString(1));
               medico.setSalario(tabla.getString(2));
               medico.setEmail(tabla.getString(4));
               medico.setCodigoJefe(tabla.getString(5));
               medico.setCodigoArea(tabla.getString(6));
               medico.setNombre(tabla.getString(8));
               medico.setDireccion(tabla.getString(9));
               medico.setTelefono(tabla.getString(10));
               medico.setEspecialidad(tabla.getString(12));
               medico.setNumeroLicencia(tabla.getString(13));
               medico.setUniversidad(tabla.getString(14));
               
               
               
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
      
    public int Insert_cuenta(Medico medico){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO usuario "
                + "VALUES ('"
                + medico.getIdentificacion()+"', '"
                + medico.getContrasena()+"' "
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
      
    public boolean Comprobar_cuenta(String identificacion,String viejo){
        Medico medico = new Medico(identificacion);
        String sql_select;
        int numFilas=0;
       
        sql_select="Select contrasena from usuario "
                + "WHERE identificacion = '"+identificacion+"' ";
        
         try{
          
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                medico.setContrasena(tabla.getString(1));
            }
            if(medico.getContrasena().equals(viejo)){
                return true;
            }else{
                return false;
            }
            
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return false;
         
    }
    public int Update_cuenta(Medico medico,String identificacion,String nuevacontrasena){
         
        String sql_select;
        int numFilas=0;
       
        sql_select="UPDATE usuario SET "
                + "contrasena = '"+nuevacontrasena+"' "
                + "WHERE identificacion = '"+identificacion+"' ";
        
         try{
          
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);
            JOptionPane.showMessageDialog(null,"Contraseña invalida"+identificacion+" "+nuevacontrasena);
            return numFilas;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return -1;
         
    }
    
    public void Select_idmedico(DefaultComboBoxModel modelo){
        String sql_select;
        sql_select="SELECT identificacion FROM medico";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
