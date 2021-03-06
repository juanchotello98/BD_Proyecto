/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Leidy
 */
public class FormMedicamento extends javax.swing.JPanel {

    /**
     * Creates new form PanelCitas
     */
    public FormMedicamento() {
        initComponents();
        
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/Images/medicine.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        RegistroCita.setIcon(img1);
        
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/Images/medicine.png"));
        Icon img2 = new ImageIcon(imagen2.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        EditarCita.setIcon(img2);
        
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/Images/medicine.png"));
        Icon img5 = new ImageIcon(imagen5.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        ListarCita.setIcon(img5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroCita = new javax.swing.JButton();
        EditarCita = new javax.swing.JButton();
        ListarCita = new javax.swing.JButton();

        RegistroCita.setText("Registrar Medicamento");
        RegistroCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroCitaActionPerformed(evt);
            }
        });

        EditarCita.setText("Editar Medicamento");
        EditarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCitaActionPerformed(evt);
            }
        });

        ListarCita.setText("Listar Medicamento");
        ListarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(RegistroCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarCita)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(ListarCita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistroCita)
                    .addComponent(EditarCita))
                .addGap(42, 42, 42)
                .addComponent(ListarCita)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroCitaActionPerformed
        RegistroMedicamento registroMedicamento = new RegistroMedicamento();
        registroMedicamento.setSize(600,450);
        registroMedicamento.setLocation(0,0);
        this.removeAll();
        this.add(registroMedicamento,null);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_RegistroCitaActionPerformed

    private void EditarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCitaActionPerformed
        // TODO add your handling code here:
        EditarMedicamento editarMedicamento = new EditarMedicamento();
        editarMedicamento.setSize(600,450);
        editarMedicamento.setLocation(0,0);
        this.removeAll();
        this.add(editarMedicamento,null);
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_EditarCitaActionPerformed

    private void ListarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCitaActionPerformed
        // TODO add your handling code here:
        ListarMedicamento listarMedicamento = new ListarMedicamento();
        listarMedicamento.setSize(600,450);
        listarMedicamento.setLocation(0,0);
        this.removeAll();
        this.add(listarMedicamento,null);
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_ListarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarCita;
    private javax.swing.JButton ListarCita;
    private javax.swing.JButton RegistroCita;
    // End of variables declaration//GEN-END:variables
}
