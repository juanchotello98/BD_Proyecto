/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Juan David
 */
public class FormulaMedicamento {
    
    private String id_formula;
    private String codigo_medicamento;
    private String cantidad;
    
    public FormulaMedicamento(){
    }

    public String getId_formula() {
        return id_formula;
    }

    public void setId_formula(String id_formula) {
        this.id_formula = id_formula;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
        
}
