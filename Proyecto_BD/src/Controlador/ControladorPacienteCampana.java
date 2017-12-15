/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoPacienteCampana;
import Logica.PacienteCampana;

/**
 *
 * @author Kevin
 */
public class ControladorPacienteCampana {
    DaoPacienteCampana daoPacienteCampana;

    public ControladorPacienteCampana() {
        daoPacienteCampana = new DaoPacienteCampana();
    }
    
    public int Insert_pacientecampana(String Idpaciente,String Idcampana){
        
        PacienteCampana pacientecampana = new PacienteCampana();
        
        pacientecampana.setId_paciente(Idpaciente);
        pacientecampana.setId_campana(Idcampana);
        
        System.out.println("Se insertara un registro a paciente campaña");
        
        int resultado = daoPacienteCampana.Insert_pacienteCampana(pacientecampana);
        
        System.out.println("Se inserto un registro a paciente campaña");
        
        return resultado;
        
    }
    
    public int Update__pacientecampana(String Idpaciente,String Idcampana){
        
        PacienteCampana pacientecampana = new PacienteCampana();
        
        pacientecampana.setId_paciente(Idpaciente);
        pacientecampana.setId_campana(Idcampana);
        
        System.out.println("Se actualizara un registro de paciente campaña");
        
        int resultado = daoPacienteCampana.Update_pacienteCampana(pacientecampana);
        
        System.out.println("Se actualizo un registro de paciente campaña");
        
        return resultado;
        
    }
    
}
