/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controlador.ControladorArea;
import Controlador.ControladorEmpleado;
import Controlador.ControladorEnfermera;
import Controlador.ControladorMedico;
import Controlador.ControladorPersona;
import Controlador.Validation;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Leydi
 */
public class RegistrarMedico extends javax.swing.JPanel {
    ControladorArea controlarea = new ControladorArea();
    ControladorEmpleado controlempleado = new ControladorEmpleado();
    ControladorPersona controlpersona = new ControladorPersona();
    ControladorMedico controlmedico = new ControladorMedico();
    Validation validar = new Validation();
    private String jefes;
    /**
     * Creates new form PerfilEnfermera
     */
    public RegistrarMedico() {
        initComponents();
        DefaultComboBoxModel Areas,Jefes;
        Areas = new DefaultComboBoxModel();
        Jefes = new DefaultComboBoxModel();
        controlarea.Select_nombrearea(Areas);
        controlempleado.Select_empleadocodigojefe(Jefes);
        this.Area.setModel(Areas);
        this.Jefe.setModel(Jefes);
        
        jefes = Jefes.getSelectedItem().toString();
        NombreJefe.setText(controlempleado.Select_empleadonombrejefe(jefes));
        this.NombreJefe.setEnabled(false);
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
        Guardar = new javax.swing.JButton();
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
        NombreJefe = new javax.swing.JTextField();

        jLabel1.setText("Nombre:");

        Identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdentificacionKeyTyped(evt);
            }
        });

        jLabel3.setText("Identificacion: ");

        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefono : ");

        jLabel5.setText("Direccion :");

        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        jLabel6.setText("Email : ");

        jLabel7.setText("Salario :");

        jLabel9.setText("Area a la que pertenece :");

        jLabel10.setText("Jefe a cargo :");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Registrar Medico");

        Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaActionPerformed(evt);
            }
        });

        Jefe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JefeItemStateChanged(evt);
            }
        });
        Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefeActionPerformed(evt);
            }
        });

        jLabel12.setText("Especialidad :");

        Especialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspecialidadKeyTyped(evt);
            }
        });

        jLabel13.setText("Numero Licencia :");

        NumeroLicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroLicenciaKeyTyped(evt);
            }
        });

        jLabel14.setText("Universidad :");

        Universidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UniversidadKeyTyped(evt);
            }
        });

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        NombreJefe.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(NombreJefe, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(Salario)
                                        .addComponent(Nombre)
                                        .addComponent(Identificacion)
                                        .addComponent(Direccion)
                                        .addComponent(Email))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Jefe, 0, 263, Short.MAX_VALUE)
                                        .addComponent(Especialidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Area, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NumeroLicencia))
                                    .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Atras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guardar)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(NumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
       String nombre,direccion,identificacion,email,telefono,salario,areas,especialidad,cargo,numerolicencia,universidad,contraseña;
        
        if(Nombre.getText().equals("")||Identificacion.getText().equals("")||Especialidad.getText().equals("")
           ||Salario.getText().equals("")||NumeroLicencia.getText().equals("")||Universidad.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Se encuentras campos vacios");
        }else{
            if(controlpersona.Comprobar_identificacion(Identificacion.getText().toString())){
                Identificacion.setText("");
                JOptionPane.showMessageDialog(null,"La identificacicon ya se encuentra registrada");
            }else{
                nombre =Nombre.getText();
                identificacion = Identificacion.getText();
                email = Email.getText();
                direccion = Direccion.getText();
                telefono = Telefono.getText();
                salario = Salario.getText();
                areas = controlarea.Select_codigoarea(Area.getSelectedItem().toString());
                especialidad = Especialidad.getText();
                numerolicencia = NumeroLicencia.getText();
                universidad = Universidad.getText();
                contraseña = Telefono.getText();
                
                controlpersona.Insert_persona(identificacion, nombre, direccion, telefono);
                controlempleado.Insert_empleado(identificacion,salario, "Medico", email,jefes, areas);
                JOptionPane.showMessageDialog(null,identificacion);
                controlmedico.Insert_medico(Identificacion.getText(), especialidad, numerolicencia, universidad);
                controlmedico.Insert_cuenta(identificacion, contraseña);
                
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

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

    private void JefeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JefeItemStateChanged
       jefes = Jefe.getSelectedItem().toString();
       NombreJefe.setText(controlempleado.Select_empleadonombrejefe(jefes));
    }//GEN-LAST:event_JefeItemStateChanged

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        if(validar.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void UniversidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UniversidadKeyTyped
       if(validar.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_UniversidadKeyTyped

    private void EspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspecialidadKeyTyped
        if(validar.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_EspecialidadKeyTyped

    private void IdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentificacionKeyTyped
         if(validar.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_IdentificacionKeyTyped

    private void NumeroLicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroLicenciaKeyTyped
         if(validar.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_NumeroLicenciaKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
       if(validar.isEmail(Email.getText())){
            Email.setToolTipText("");
            Email.setBackground(Color.white);
        }else{
            Email.setToolTipText("Email invalido");
            Email.setBackground(Color.pink);
        }
    }//GEN-LAST:event_EmailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Area;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Especialidad;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JComboBox<String> Jefe;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreJefe;
    private javax.swing.JTextField NumeroLicencia;
    private javax.swing.JTextField Salario;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Universidad;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
