/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoFormulaMedicamento;
import Logica.FormulaMedicamento;

/**
 *
 * @author Kevin
 */
public class ControladorFormulaMedicamento {
    DaoFormulaMedicamento daoFormulaMedicamento;

    public ControladorFormulaMedicamento() {
        daoFormulaMedicamento = new DaoFormulaMedicamento();
    }
    
     public int Insert_formulamedicamento(String Id_formula,String codigo_medicamento,String cantidad){
        
        FormulaMedicamento formulamedicamento = new FormulaMedicamento();
        
        formulamedicamento.setId_formula(Id_formula);
        formulamedicamento.setCodigo_medicamento(codigo_medicamento);
        formulamedicamento.setCantidad(cantidad);
        
        System.out.println("Se insertara un registro a formula medicamento");
        
        int resultado = daoFormulaMedicamento.Insert_formulamedicamento(formulamedicamento);
        
        System.out.println("Se inserto un registro a formula medicamento");
        
        return resultado;
        
    }
    
    public int Update_formulamedicamento(String Id_formula,String codigo_medicamento,String cantidad){
        
        FormulaMedicamento formulamedicamento = new FormulaMedicamento();
        
        formulamedicamento.setId_formula(Id_formula);
        formulamedicamento.setCodigo_medicamento(codigo_medicamento);
        formulamedicamento.setCantidad(cantidad);
        
        System.out.println("Se actualizara un registro de formula medicamento");
        
        int resultado = daoFormulaMedicamento.Update_formulamedicamento(formulamedicamento);
        
        System.out.println("Se actualizo un registro de formula medicamento");
        
        return resultado;
        
    }
    
}
