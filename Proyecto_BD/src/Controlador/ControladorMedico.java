/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoMedico;
import Logica.Medico;

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
        
        medico.setEspecialidad(especialidad);
        medico.setNumeroLicencia(numero_licencia);
        medico.setUniversidad(universidad);
        
        System.out.println("Se actualizara un registro de medico");
        
        int resultado = daoMedico.Update_medico(medico);
        
        System.out.println("Se actualizo un registro de medico");
        
        return resultado;
        
    }
    
}
