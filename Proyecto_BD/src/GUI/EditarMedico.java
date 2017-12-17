/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controlador.ControladorArea;
import Controlador.ControladorEmpleado;
import Controlador.ControladorEnfermera;
import Controlador.ControladorEnfermeraHabilidades;
import Controlador.ControladorMedico;
import Controlador.ControladorPersona;
import Logica.Enfermera;
import Logica.Medico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
/**
 *
 * @author Leydi
 */
public class EditarMedico extends javax.swing.JPanel {
    
    ControladorMedico controlmedico = new ControladorMedico();
    ControladorEmpleado controlempleado =  new ControladorEmpleado();
    ControladorPersona controlpersona = new ControladorPersona();
    ControladorArea controlarea = new ControladorArea();
    ControladorEnfermeraHabilidades controlhabilidades = new ControladorEnfermeraHabilidades();
    
    DefaultComboBoxModel Areas,Jefes;
    /**
     * Creates new form PerfilEnfermera
     */
    public EditarMedico() {
        initComponents();
        Areas = new DefaultComboBoxModel();
        Jefes = new DefaultComboBoxModel();
        controlarea.Select_nombrearea(Areas);
        controlempleado.Select_empleadocodigojefe(Jefes);
        this.Area.setModel(Areas);
        this.Jefe.setModel(Jefes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Modificacr = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Area = new javax.swing.JComboBox<>();
        Jefe = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Especialidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        NumeroLicencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Universidad = new javax.swing.JTextField();
        Atras = new javax.swing.JButton();
        Contraseñaold = new javax.swing.JLabel();
        contrasenaold = new javax.swing.JPasswordField();
        Contraseñanew = new javax.swing.JLabel();
        contrasenanew = new javax.swing.JPasswordField();
        Busqueda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NombreJefe = new javax.swing.JTextField();

        jLabel1.setText("Nombre:");

        Identificacion.setEditable(false);

        jLabel3.setText("Identificacion: ");

        jLabel4.setText("Telefono : ");

        jLabel5.setText("Direccion :");

        jLabel6.setText("Email : ");

        jLabel7.setText("Salario :");

        jLabel9.setText("Area a la que pertenece :");

        jLabel10.setText("Jefe a cargo :");

        Modificacr.setText("Modificar");
        Modificacr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificacrActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Editar Medico");

        Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaActionPerformed(evt);
            }
        });

        Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefeActionPerformed(evt);
            }
        });

        jLabel12.setText("Especialidad :");

        jLabel13.setText("Numero Licencia :");

        jLabel14.setText("Universidad :");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Contraseñaold.setText("Contraseña vieja:");

        Contraseñanew.setText("Contraseña nueva:");

        Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaKeyReleased(evt);
            }
        });

        jLabel8.setText("Buscar Medico : ");

        NombreJefe.setEnabled(false);
        NombreJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJefeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Atras)
                        .addGap(32, 32, 32)
                        .addComponent(Modificacr))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(NombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Nombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contraseñaold)
                                .addGap(18, 18, 18)
                                .addComponent(contrasenaold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(NumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contraseñanew)
                                .addGap(18, 18, 18)
                                .addComponent(contrasenanew)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(NombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(NumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseñaold)
                    .addComponent(contrasenaold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseñanew)
                    .addComponent(contrasenanew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(Modificacr)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModificacrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificacrActionPerformed
        String nombre,direccion,identificacion,email,telefono,salario,areas,especialidad,numerolicencia,universidad;
        
        if(Nombre.getText().equals("")||Identificacion.getText().equals("")||Especialidad.getText().equals("")
           ||Salario.getText().equals("")||Universidad.getText().equals("")||NumeroLicencia.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Se encuentras campos vacios");
        }else{
                if(controlmedico.Select_contrasena(Busqueda.getText(), contrasenaold.getText())){
                    nombre =Nombre.getText();
                    identificacion = Identificacion.getText();
                    email = Email.getText();
                    direccion = Direccion.getText();
                    telefono = Telefono.getText();
                    salario = Salario.getText();
                    areas = controlarea.Select_codigoarea(Areas.getSelectedItem().toString());
                    especialidad = Especialidad.getText();
                    numerolicencia =NumeroLicencia.getText();
                    universidad =  Universidad.getText();
                    controlpersona.Update_persona(identificacion, nombre, direccion, telefono);
                    controlempleado.Update_empleado(identificacion, salario, "Medico", email,
                    Jefe.getSelectedItem().toString(),controlarea.Select_codigoarea(Area.getSelectedItem().toString()));
                    controlmedico.Update_medico(identificacion, especialidad, numerolicencia, universidad);
                    controlmedico.Update_cuenta(identificacion, contrasenanew.getText(), contrasenaold.getText());
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña invalida");
                }
        }
    }//GEN-LAST:event_ModificacrActionPerformed

    private void AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaActionPerformed

    private void JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JefeActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
     FormEmpleados formempleados = new FormEmpleados();
       formempleados.setSize(600, 450);
       formempleados.setLocation(0,0);
       this.removeAll();
       this.add(formempleados, null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_AtrasActionPerformed


    private void BusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaKeyReleased
       Medico medico = new Medico(Busqueda.getText());
       DefaultComboBoxModel model;
       model = new DefaultComboBoxModel();
       
       controlmedico.Select_medico(medico,Busqueda.getText());
       Nombre.setText(medico.getNombre());
       Identificacion.setText(medico.getIdentificacion());
       Direccion.setText(medico.getDireccion());
       Telefono.setText(medico.getTelefono());
       Email.setText(medico.getEmail());
       Salario.setText(medico.getSalario());
       Especialidad.setText(medico.getEspecialidad());
       NumeroLicencia.setText(medico.getNumeroLicencia());
       Universidad.setText(medico.getUniversidad());
       
       for(int i=0;i<Jefe.getItemCount();i++){
                    if(Jefe.getItemAt(i).equals(medico.getCodigoJefe())){
                        Jefe.setSelectedIndex(i);
                    }
                }
                
        for(int i=0;i<Area.getItemCount();i++){
            try{
                    if(medico.getCodigoArea().equals(controlarea.Select_codigoarea(Area.getItemAt(i)))){
                        Area.setSelectedIndex(i);
                    }
            }catch(java.lang.NullPointerException e){}
        }
       
       controlhabilidades.Select_habilidades(model,Busqueda.getText());
       
       NombreJefe.setText(controlempleado.Select_empleadonombrejefe(Jefe.getSelectedItem().toString()));
    }//GEN-LAST:event_BusquedaKeyReleased

    private void NombreJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJefeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Area;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Busqueda;
    private javax.swing.JLabel Contraseñanew;
    private javax.swing.JLabel Contraseñaold;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Especialidad;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JComboBox<String> Jefe;
    private javax.swing.JButton Modificacr;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreJefe;
    private javax.swing.JTextField NumeroLicencia;
    private javax.swing.JTextField Salario;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Universidad;
    private javax.swing.JPasswordField contrasenanew;
    private javax.swing.JPasswordField contrasenaold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
