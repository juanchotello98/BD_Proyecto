/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoMedicamento;
import Logica.Medicamento;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ControladorMedicamento {
    DaoMedicamento daoMedicamento;

    public ControladorMedicamento() {
        daoMedicamento = new DaoMedicamento();
    }
    
     public int Insert_medicamento(String codigo,String nombre,String costo,String descripcion){
        
        Medicamento medicamento = new Medicamento();
        
       medicamento.setCodigo(codigo);
       medicamento.setNombre(nombre);
       medicamento.setCosto(costo);
       medicamento.setDescripcion(descripcion);
        
        System.out.println("Se insertara un registro a medicamento");
        
        int resultado = daoMedicamento.Insert_medicamento(medicamento);
        
        System.out.println("Se inserto un registro a medicamento");
        
        return resultado;
        
    }
    
    public int Update_medicamento(String codigo, String nombre, String costo,String descripcion){
        
       Medicamento medicamento = new Medicamento();
        
       medicamento.setCodigo(codigo);
       medicamento.setNombre(nombre);
       medicamento.setCosto(costo);
       medicamento.setDescripcion(descripcion);
        
        System.out.println("Se actualizara un registro de medicamento");
        
        int resultado = daoMedicamento.Update_medicamento(medicamento, codigo);
        
        System.out.println("Se actualizo un registro de medicamento");
        
        return resultado;
        
    }
    
    public boolean comprobar_medicamento(String codigo_medicamento){
        
        return daoMedicamento.Comprobar_Medicamento(codigo_medicamento);
    }
    
    public void select_medicamento(Medicamento medicamento, String codigo){
        
        daoMedicamento.Select_medicamento(medicamento, codigo);
    }
    
    public void Select_medicamentoTabla(DefaultTableModel model){
        daoMedicamento.Select_medicamentoTabla(model);
    }
    
    public void Select_medica(DefaultComboBoxModel model){
        daoMedicamento.Select_medica(model);
    }
    
    public String selec_nombre(String id){
        return daoMedicamento.Select_nombre(id);
    }
    
}
