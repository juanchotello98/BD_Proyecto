/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Logica.Formula;
import AccesoDatos.DaoFormula;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan David
 */
public class ControladorFormula {
    
    DaoFormula daoFormula;
    
    public ControladorFormula(){
        
        daoFormula = new DaoFormula();
        
    }
    
    public int Insert_formula(String id_formula, String id_medico, String id_paciente,String fecha){
        
        Formula formula = new Formula(); 
        
        formula.setId_formula(id_formula);
        formula.setId_medico(id_medico);
        formula.setId_paciente(id_paciente);
        formula.setFecha(fecha);
        
        
        System.out.println("Se insertara un registro de formula");
        
        int resultado = daoFormula.Insert_formula(formula);
        
        System.out.println("Se inserto un registro de formula");
        
        return resultado;
        
    }
    
        public int Update_formula(String id_formula, String id_medico, String id_paciente){
        
        Formula formula = new Formula(); 
        
        formula.setId_formula(id_formula);
        formula.setId_medico(id_medico);
        formula.setId_paciente(id_paciente);
        
        
        System.out.println("Se actualizara un registro de formula");
        
        int resultado = daoFormula.Update_formula(formula);
        
        System.out.println("Se actualizo un registro de formula");
        
        return resultado;
        
    }
        
    public boolean Comprobar_id(String id){
        return daoFormula.Comprobar_id(id);
    }
    
    public void Select_formula(Formula formula,String id){
        daoFormula.Select_cama(formula, id);
    }
    
    public void Select_formulatabla(DefaultTableModel model){
        daoFormula.Select_formulatabla(model);
        
    }
    
}
