/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Leidy
 */
public class FormCampana extends javax.swing.JPanel {

    /**
     * Creates new form FormCampaña
     */
    public FormCampana() {
        initComponents();
         ImageIcon imagen1=new ImageIcon(getClass().getResource("/Images/tag.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        RegistroCampana.setIcon(img1);
        
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/Images/tag.png"));
        Icon img2 = new ImageIcon(imagen2.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        EditarCampana.setIcon(img2);
        
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/Images/tag.png"));
        Icon img5 = new ImageIcon(imagen5.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        ListarCampana.setIcon(img5);
        
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/Images/tag.png"));
        Icon img3 = new ImageIcon(imagen5.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        jButton1.setIcon(img3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroCampana = new javax.swing.JButton();
        EditarCampana = new javax.swing.JButton();
        ListarCampana = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Asistencia_Campaña = new javax.swing.JButton();

        RegistroCampana.setText("Registrar Campaña");
        RegistroCampana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroCampanaActionPerformed(evt);
            }
        });

        EditarCampana.setText("Editar Campaña");
        EditarCampana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCampanaActionPerformed(evt);
            }
        });

        ListarCampana.setText("Listar Campaña");
        ListarCampana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCampanaActionPerformed(evt);
            }
        });

        jButton1.setText("Pacientes por campaña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Asistencia_Campaña.setText("Asistencia_Campaña");
        Asistencia_Campaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asistencia_CampañaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Asistencia_Campaña)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistroCampana)
                            .addComponent(ListarCampana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditarCampana)
                            .addComponent(jButton1))
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistroCampana)
                    .addComponent(EditarCampana))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarCampana)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addComponent(Asistencia_Campaña)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroCampanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroCampanaActionPerformed
       RegistroCampana registrocampana = new RegistroCampana();
       registrocampana.setSize(600,450);
       registrocampana.setLocation(0, 0);
       this.removeAll();
       this.add(registrocampana,null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_RegistroCampanaActionPerformed

    private void EditarCampanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCampanaActionPerformed
       EditarCampana editarcampana = new EditarCampana();
       editarcampana.setSize(600,450);
       editarcampana.setLocation(0, 0);
       this.removeAll();
       this.add(editarcampana,null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_EditarCampanaActionPerformed

    private void ListarCampanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCampanaActionPerformed
       ListarCampanas listarcampana = new ListarCampanas();
       listarcampana.setSize(600,450);
       listarcampana.setLocation(0, 0);
       this.removeAll();
       this.add(listarcampana,null);
       this.revalidate();
       this.repaint();
    }//GEN-LAST:event_ListarCampanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Asistencia_CampañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asistencia_CampañaActionPerformed
        JFrame ventana = new JFrame();
        RegistroPM pm = new RegistroPM();
        pm.setSize(240,190);
        ventana.setSize(250,190);
        ventana.setContentPane(pm);
        ventana.setVisible(true);
    }//GEN-LAST:event_Asistencia_CampañaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asistencia_Campaña;
    private javax.swing.JButton EditarCampana;
    private javax.swing.JButton ListarCampana;
    private javax.swing.JButton RegistroCampana;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
