/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoPacienteCamas;
import Logica.PacienteCamas;

/**
 *
 * @author Kevin
 */
public class ControladorPacienteCamas {
    DaoPacienteCamas daoPacienteCamas;

    public ControladorPacienteCamas() {
        daoPacienteCamas = new DaoPacienteCamas();
    }
    
     public int Insert_pacientecamas(String Idpaciente,String numero_cama,String fecha_ingreso,
            String fecha_salida){
        
        PacienteCamas pacientecamas = new PacienteCamas();
        
        pacientecamas.setId_paciente(Idpaciente);
        pacientecamas.setNumero_cama(numero_cama);
        pacientecamas.setFecha_ingreso(fecha_ingreso);
        pacientecamas.setFecha_salida(fecha_salida);
        
        System.out.println("Se insertara un registro a paciente cama");
        
        int resultado = daoPacienteCamas.Insert_pacienteCamas(pacientecamas);
        
        System.out.println("Se inserto un registro a paciente cama");
        
        return resultado;
        
    }
    
    public int Update_pacientecamas(String Idpaciente,String numero_cama,String fecha_ingreso,
            String fecha_salida){
        
        PacienteCamas pacientecamas = new PacienteCamas();
        
        pacientecamas.setId_paciente(Idpaciente);
        pacientecamas.setNumero_cama(numero_cama);
        pacientecamas.setFecha_ingreso(fecha_ingreso);
        pacientecamas.setFecha_salida(fecha_salida);
        
        System.out.println("Se actualizara un registro de pacientes camas");
        
        int resultado = daoPacienteCamas.Insert_pacienteCamas(pacientecamas);
        
        System.out.println("Se actualizo un registro de paciente camas");
        
        return resultado;
        
    }
    
}
