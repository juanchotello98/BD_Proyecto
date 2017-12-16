/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoEmpleado;
import Logica.Empleado;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ControladorEmpleado {
    DaoEmpleado daoEmpleado;
    
    public ControladorEmpleado() {
        daoEmpleado = new DaoEmpleado();
    }
    
     public int Insert_empleado(String identificacion,String salario,String cargo,String email,String codigo_jefe,
            String codigo_area){
        
        Empleado empleado = new Empleado(identificacion);
        empleado.setIDentificacion(identificacion);
        empleado.setSalario(salario);
        empleado.setCargo(cargo);
        empleado.setEmail(email);
        empleado.setCodigoJefe(codigo_jefe);
        empleado.setCodigoArea(codigo_area);
        
        
        System.out.println("Se insertara un registro a empleado");
        
        int resultado = daoEmpleado.Insert_empleado(empleado);
        
        System.out.println("Se inserto un registro a empleado");
        
        return resultado;
        
    }
    
    public int Update_empleado(String identificacion,String salario,String cargo,String email,String codigo_jefe,
            String codigo_area){
        
        
        Empleado empleado = new Empleado(identificacion);
        empleado.setSalario(salario);
        empleado.setCargo(cargo);
        empleado.setEmail(email);
        empleado.setCodigoJefe(codigo_jefe);
        empleado.setCodigoArea(codigo_area);
        
        
        System.out.println("Se actualizara un registro de empleado");
        
        int resultado = daoEmpleado.Update_empleado(empleado);
        
        System.out.println("Se actualizo un registro de empleado");
        
        return resultado;
        
    }
    
    public void Select_empleado(DefaultTableModel model){
        daoEmpleado.Select_empleado(model);
    }
    
    public void Select_empleadoarea(DefaultTableModel model,String area){
        daoEmpleado.Select_empleadoarea(model,area);
    }
    
    public void Select_empleadocodigojefe(DefaultComboBoxModel model){
        daoEmpleado.Select_empleadocodigojefe(model);
    }
    
    public String Select_empleadonombrejefe(String identificacion){
       return daoEmpleado.Select_empleadonombrejefe(identificacion);
    }
   
}
