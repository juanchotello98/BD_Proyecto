/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoCita;
import Logica.Cita;

/**
 *
 * @author Kevin
 */
public class ControladorCita {
    DaoCita daoCita;
    public ControladorCita() {
        daoCita = new DaoCita();
    }
    
    public int Insert_cita(String Idpaciente,String Idmedico,String hora,String fecha,String estado,
            String valor_consulta){
        
        Cita cita = new Cita();
        
        cita.setIdPaciente(Idpaciente);
        cita.setIdMedico(Idmedico);
        cita.setHora(hora);
        cita.setFecha(fecha);
        cita.setEstado(estado);
        cita.setValorConsulta(valor_consulta);
        
        System.out.println("Se insertara un registro a cita");
        
        int resultado = daoCita.Insert_cita(cita);
        
        System.out.println("Se inserto un registro a cita");
        
        return resultado;
        
    }
    
    public int Update_cita(String Idpaciente,String Idmedico,String hora,String fecha,String estado,
            String valor_consulta){
        
        Cita cita = new Cita();
        
        cita.setIdPaciente(Idpaciente);
        cita.setIdMedico(Idmedico);
        cita.setHora(hora);
        cita.setFecha(fecha);
        cita.setEstado(estado);
        cita.setValorConsulta(valor_consulta);
        
        System.out.println("Se actualizara un registro de cita");
        
        int resultado = daoCita.Update_cita(cita);
        
        System.out.println("Se actualizo un registro de cita");
        
        return resultado;
        
    }
}
