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
public class FormCamas extends javax.swing.JPanel {

    /**
     * Creates new form FormCamas
     */
    public FormCamas() {
        initComponents();
        
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/Images/hospital-bed.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        RegistrarCama.setIcon(img1);
        
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/Images/hospital-bed.png"));
        Icon img2 = new ImageIcon(imagen2.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        EditarCama.setIcon(img2);
        
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/Images/hospital-bed.png"));
        Icon img5 = new ImageIcon(imagen5.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        ListarCama.setIcon(img5);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarCama = new javax.swing.JButton();
        EditarCama = new javax.swing.JButton();
        ListarCama = new javax.swing.JButton();

        RegistrarCama.setText("Registrar Cama");
        RegistrarCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarCamaActionPerformed(evt);
            }
        });

        EditarCama.setText("Editar Cama");
        EditarCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCamaActionPerformed(evt);
            }
        });

        ListarCama.setText("Listar Camas");
        ListarCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegistrarCama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditarCama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListarCama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(RegistrarCama)
                .addGap(42, 42, 42)
                .addComponent(EditarCama)
                .addGap(42, 42, 42)
                .addComponent(ListarCama)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCamaActionPerformed
        RegistrarCama registrarcama = new RegistrarCama();
        registrarcama.setSize(600,450);
        registrarcama.setLocation(0,0);
        this.removeAll();
        this.add(registrarcama,null);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_RegistrarCamaActionPerformed

    private void EditarCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCamaActionPerformed
        EditarCama editarcama = new EditarCama();
        editarcama.setSize(600,450);
        editarcama.setLocation(0,0);
        this.removeAll();
        this.add(editarcama,null);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_EditarCamaActionPerformed

    private void ListarCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCamaActionPerformed
        
        ListarCamas listarcamas = new ListarCamas();
        listarcamas.setSize(600,450);
        listarcamas.setLocation(0,0);
        this.removeAll();
        this.add(listarcamas,null);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_ListarCamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarCama;
    private javax.swing.JButton ListarCama;
    private javax.swing.JButton RegistrarCama;
    // End of variables declaration//GEN-END:variables
}
