/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorFormula;
import Controlador.ControladorMedico;
import Controlador.ControladorPaciente;
import Controlador.ControladorPersona;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Leydi
 */
public class RegistroFormula extends javax.swing.JPanel {
        ControladorPersona controlpersona = new ControladorPersona();
        ControladorPaciente controlpaciente = new ControladorPaciente();
        ControladorMedico controlmedico = new ControladorMedico();
        ControladorFormula controlformula = new ControladorFormula();
        SimpleDateFormat formato = new SimpleDateFormat("d/MM/yyyy");
        Date fechacale;
        /**
     * Creates new form PerfilEnfermera
     */
    public RegistroFormula() {
        
        initComponents();
        DefaultComboBoxModel Paciente,Jefes;
        Paciente = new DefaultComboBoxModel();
        Jefes = new DefaultComboBoxModel();
        controlmedico.Select_idmedios(Jefes);
        controlpaciente.Select_idpaciente(Paciente);
        this.Medicos.setModel(Jefes);
        this.Pacientes.setModel(Paciente);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdFormula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Medicos = new javax.swing.JComboBox<>();
        Pacientes = new javax.swing.JComboBox<>();

        jLabel1.setText("Identificacion Formula :");

        jLabel3.setText("Indentificacion Medico :");

        jLabel5.setText("Identificacion Paciente :");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Registrar Formula");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Guardar))
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pacientes, 0, 123, Short.MAX_VALUE)
                            .addComponent(Medicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdFormula))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Atras))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     String formula,idPaciente,idMedico;
     fechacale = Fecha.getDate();
     formula=IdFormula.getText();
     idPaciente=Pacientes.getSelectedItem().toString();
     idMedico=Medicos.getSelectedItem().toString();
     String  fecha=formato.format(fechacale);
     
     controlformula.Insert_formula(formula, idMedico, idPaciente,fecha);
     
      
    }//GEN-LAST:event_GuardarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
       FormFormula formformula = new FormFormula();
       formformula.setSize(600, 450);
       formformula.setLocation(0,0);
       this.removeAll();
       this.add(formformula, null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField IdFormula;
    private javax.swing.JComboBox<String> Medicos;
    private javax.swing.JComboBox<String> Pacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
