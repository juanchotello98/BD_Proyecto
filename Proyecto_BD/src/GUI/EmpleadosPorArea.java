/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorArea;
import Controlador.ControladorEmpleado;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leydi
 */
public class EmpleadosPorArea extends javax.swing.JPanel {
    
    ControladorEmpleado controlempleado = new ControladorEmpleado();
    ControladorArea controlarea = new ControladorArea();
    /**
     * Creates new form EmpleadosPorArea
     */
    public EmpleadosPorArea() {
        initComponents();
        
        DefaultTableModel model;
        DefaultComboBoxModel Areas;
        model = new DefaultTableModel();
        Areas = new DefaultComboBoxModel();
        TablaEmpleadoArea.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Cargo");
        TablaEmpleadoArea.getTableHeader().setReorderingAllowed(false);
        controlempleado.Select_empleado(model);
        controlarea.Select_nombrearea(Areas);
        this.Areas.setModel(Areas);
        jScrollPane1.setViewportView(TablaEmpleadoArea);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleadoArea = new javax.swing.JTable();
        Areas = new javax.swing.JComboBox<>();
        Actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Reestablecer = new javax.swing.JButton();

        TablaEmpleadoArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cargo"
            }
        ));
        TablaEmpleadoArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadoAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleadoArea);

        Areas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Areas" }));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el Area que desea:");

        Reestablecer.setText("Reestrablecer");
        Reestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar)
                    .addComponent(Reestablecer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEmpleadoAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoAreaMouseClicked
        int row = TablaEmpleadoArea.rowAtPoint(evt.getPoint());
        DefaultTableModel tablaequipment = (DefaultTableModel) TablaEmpleadoArea.getModel();
        String dato=String.valueOf(tablaequipment.getValueAt(TablaEmpleadoArea.getSelectedRow(), 0));

    }//GEN-LAST:event_TablaEmpleadoAreaMouseClicked

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        TablaEmpleadoArea.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Cargo");
        TablaEmpleadoArea.getTableHeader().setReorderingAllowed(false);
        controlempleado.Select_empleadoareas(model,Areas.getSelectedItem().toString());
        jScrollPane1.setViewportView(TablaEmpleadoArea);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void ReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReestablecerActionPerformed
        DefaultTableModel model;
        model = new DefaultTableModel();
        TablaEmpleadoArea.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Cargo");
        TablaEmpleadoArea.getTableHeader().setReorderingAllowed(false);
        controlempleado.Select_empleado(model);
        jScrollPane1.setViewportView(TablaEmpleadoArea);
    }//GEN-LAST:event_ReestablecerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JComboBox<String> Areas;
    private javax.swing.JButton Reestablecer;
    private javax.swing.JTable TablaEmpleadoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
