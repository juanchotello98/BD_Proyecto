/*
 * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorArea;
import Controlador.ControladorEmpleado;
import Controlador.ControladorEnfermera;
import Controlador.ControladorPersona;
import Controlador.Validation;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Leydi
 */
public class RegistroEnfermera extends javax.swing.JPanel {
    
    ControladorArea controlarea = new ControladorArea();
    ControladorEmpleado controlempleado = new ControladorEmpleado();
    ControladorPersona controlpersona = new ControladorPersona();
    ControladorEnfermera controlenfermera = new ControladorEnfermera();
    Validation validar = new Validation();
    private String jefes;
    /**
     * Creates new form PerfilEnfermera
     */
    public RegistroEnfermera() {
        initComponents();
        DefaultComboBoxModel Areas,Jefes;
        Areas = new DefaultComboBoxModel();
        Jefes = new DefaultComboBoxModel();
        controlarea.Select_nombrearea(Areas);
        controlempleado.Select_empleadocodigojefe(Jefes);
        this.Areas.setModel(Areas);
        this.Jefes.setModel(Jefes);
        
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
        Areas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Experiencia = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Jefes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        NombreJefe = new javax.swing.JTextField();
        Atras = new javax.swing.JButton();

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

        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
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

        Salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalarioKeyTyped(evt);
            }
        });

        jLabel7.setText("Salario :");

        jLabel9.setText("area que pertenece :");

        jLabel10.setText("Experiencia Laboral");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Registrar Enfermera");

        Jefes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JefesItemStateChanged(evt);
            }
        });

        jLabel12.setText("Jefe :");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Identificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Salario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Experiencia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Areas, javax.swing.GroupLayout.Alignment.LEADING, 0, 228, Short.MAX_VALUE)
                                    .addComponent(Jefes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(42, 191, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jefes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Atras)
                            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String nombre,direccion,identificacion,email,telefono,salario,areas,experiencia,cargo;
        
        if(Nombre.getText().equals("")||Identificacion.getText().equals("")||Experiencia.getText().equals("")
           ||Salario.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Se encuentras campos vacios");
        }else{
            if(controlpersona.Comprobar_identificacion(Identificacion.getText())){
                Identificacion.setText("");
                JOptionPane.showMessageDialog(null,"La identificacicon ya se encuentra registrada");
            }else{
                nombre =Nombre.getText();
                identificacion = Identificacion.getText();
                email = Email.getText();
                direccion = Direccion.getText();
                telefono = Telefono.getText();
                salario = Salario.getText();
                areas = controlarea.Select_codigoarea(Areas.getSelectedItem().toString());
                experiencia = Experiencia.getText();

                controlpersona.Insert_persona(identificacion, nombre, direccion, telefono);
                controlempleado.Insert_empleado(identificacion,salario, "Enfermera", email,jefes, areas);
                controlenfermera.Insert_enfermera(identificacion, experiencia);


                AgregarHabilidad agregarhabilidades = new AgregarHabilidad(identificacion);
                agregarhabilidades.setSize(600, 450);
                agregarhabilidades.setLocation(0,0);
                this.removeAll();
                this.add(agregarhabilidades, null);
                this.revalidate();
                this.repaint();
            }
        }
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void JefesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JefesItemStateChanged
       jefes = Jefes.getSelectedItem().toString();
       NombreJefe.setText(controlempleado.Select_empleadonombrejefe(jefes));
    }//GEN-LAST:event_JefesItemStateChanged

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
       FormEmpleados formempleados = new FormEmpleados();
       formempleados.setSize(600, 450);
       formempleados.setLocation(0,0);
       this.removeAll();
       this.add(formempleados, null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_AtrasActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        if(validar.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void IdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentificacionKeyTyped
        if(validar.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_IdentificacionKeyTyped

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
         if(validar.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void SalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalarioKeyTyped
        if(validar.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_SalarioKeyTyped

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
    private javax.swing.JComboBox<String> Areas;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Experiencia;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JComboBox<String> Jefes;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreJefe;
    private javax.swing.JTextField Salario;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
