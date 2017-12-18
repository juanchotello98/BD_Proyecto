/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import AccesoDatos.DaoCausas;
import AccesoDatos.DaoHistoriaClinica;
import Logica.Registro;
import AccesoDatos.DaoRegistro;

/**
 *
 * @author Juan David
 */
public class ControladorRegistro {
    
    DaoRegistro daoRegistro;
    DaoCausas daoCausa;
    DaoHistoriaClinica daohistoria;
    
    
    public ControladorRegistro (){
        
        daoRegistro = new DaoRegistro();
        daoCausa = new DaoCausas();
        daohistoria = new DaoHistoriaClinica();
        
    }
    
    
    public int Insert_registro(String idMedico, String idpaciente, String idCausa, String fecha, String Descripcion){
        
        Registro registro = new Registro(); 

        
        registro.setIdMedico(idMedico);
        registro.setIdHistoria(daohistoria.Select_idhistoria(idpaciente));
        registro.setIdCausa(daoCausa.Select_idcausa(idCausa));
        registro.setFecha(fecha);
        registro.setDescripcion(Descripcion);
        
        System.out.println("Se insertara un registro de Registro");
        
        int resultado = daoRegistro.Insert_registro(registro);
        
        System.out.println("Se inserto un registro de Registro");
        
        return resultado;
        
    }
    
    
        public int Update_registro(String idMedico, String idHistoria, String idCausa, String fecha, String Descripcion){
        
        Registro registro = new Registro(); 
        
        registro.setIdMedico(idMedico);
        registro.setIdHistoria(idHistoria);
        registro.setIdCausa(idCausa);
        registro.setFecha(fecha);
        registro.setDescripcion(Descripcion);
        
        System.out.println("Se actualizara un registro de Registro");
        
        int resultado = daoRegistro.Update_registro(registro);
        
        System.out.println("Se actualizo un registro de Registro");
        
        return resultado;
        
    }
    
}
