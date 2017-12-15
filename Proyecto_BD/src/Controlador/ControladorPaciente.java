/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Logica.Paciente;
import AccesoDatos.DaoPaciente;
/**
 *
 * @author Juan David
 */
public class ControladorPaciente {
    
    DaoPaciente daoPaciente;
    
    public ControladorPaciente(){
        
        daoPaciente = new DaoPaciente();
    }
    
    
    public int Insert_paciente(String identificacion, String actividadEconomica, String numeroSeguroSocial, String fechaNacimiento){
        
        Paciente paciente = new Paciente(identificacion); 
        
        paciente.setActividadEconomica(actividadEconomica);
        paciente.setNumeroSeguroSocial(numeroSeguroSocial);
        paciente.setFechaNacimiento(fechaNacimiento);
        
        System.out.println("Se insertara un registro de paciente");
        
        int resultado = daoPaciente.Insert_paciente(paciente);
        
        System.out.println("Se inserto un registro de paciente");
        
        return resultado;
        
    }
    
    
        public int Update_paciente(String identificacion, String actividadEconomica, String numeroSeguroSocial, String fechaNacimiento){
        
        Paciente paciente = new Paciente(identificacion); 
        
        paciente.setActividadEconomica(actividadEconomica);
        paciente.setNumeroSeguroSocial(numeroSeguroSocial);
        paciente.setFechaNacimiento(fechaNacimiento);
        
        System.out.println("Se actualizara un registro de paciente");
        
        int resultado = daoPaciente.Update_paciente(paciente);
        
        System.out.println("Se actualizo un registro de paciente");
        
        return resultado;
        
    }
    
}
