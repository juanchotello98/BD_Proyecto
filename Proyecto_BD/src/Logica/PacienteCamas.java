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
public class PacienteCamas {
    
    private String id_paciente;
    private String numero_cama;
    private String fecha_ingreso;
    private String fecha_salida;
    
   
    
    public PacienteCamas(){
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNumero_cama() {
        return numero_cama;
    }

    public void setNumero_cama(String numero_cama) {
        this.numero_cama = numero_cama;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
}
