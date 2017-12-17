/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoMedico;
import Logica.Medico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class ControladorMedico {
    DaoMedico daoMedico;

    public ControladorMedico() {
        daoMedico = new DaoMedico();
    }
    
     public int Insert_medico(String identificacion,String especialidad,String numero_licencia,String universidad){

        Medico medico = new Medico(identificacion);
        
        medico.setEspecialidad(especialidad);
        medico.setNumeroLicencia(numero_licencia);
        medico.setUniversidad(universidad);
        
        System.out.println("Se insertara un registro a medico");
        
        int resultado = daoMedico.Insert_medico(medico);
        
        System.out.println("Se inserto un registro a medico");
        
        return resultado;
        
    }
    
    public int Update_medico(String identificacion,String especialidad,String numero_licencia,String universidad){
        
        Medico medico = new Medico(identificacion);
        medico.setIDentificacion(identificacion);
        medico.setEspecialidad(especialidad);
        medico.setNumeroLicencia(numero_licencia);
        medico.setUniversidad(universidad);
        
        System.out.println("Se actualizara un registro de medico");
        
        int resultado = daoMedico.Update_medico(medico,identificacion);
        
        System.out.println("Se actualizo un registro de medico");
        
        return resultado;
        
    }
    
     public void Select_medico(Medico medico,String identificacion){
        daoMedico.Select_medico(medico, identificacion);
    }
     
     public boolean Select_contrasena(String identificacion,String contrasenavieja){
        return daoMedico.Comprobar_cuenta(identificacion, contrasenavieja);
    }
     
    public int Insert_cuenta(String identificacion,String contraseña){

        Medico medico = new Medico(identificacion);
        
        medico.setContrasena(contraseña);
        
        System.out.println("Se insertara un registro a medico");
        
        int resultado = daoMedico.Insert_cuenta(medico);
        
        System.out.println("Se inserto un registro a medico");
        
        return resultado;
        
    }
    
    public int Update_cuenta(String identificacion,String nuevacontrasena,String ViejaContrasena){
        
        Medico medico = new Medico(identificacion);
        
        medico.setContrasena(ViejaContrasena);
        
        System.out.println("Se actualizara un registro de medico");
        
        int resultado = daoMedico.Update_cuenta(medico,identificacion,nuevacontrasena);
        
        System.out.println("Se actualizo un registro de medico");
        
        return resultado;
        
    }
    public void Select_idmedios(DefaultComboBoxModel model){
        daoMedico.Select_idmedico(model);
    }
    
}
