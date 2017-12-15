/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoEmpleado;
import Logica.Empleado;

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
    
}
