/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AccesoDatos.DaoArea;
import AccesoDatos.FachadaBD;
import Controlador.ControladorArea;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Leidy
 */
public class FormReportes extends javax.swing.JPanel {

    ControladorArea controlarea = new ControladorArea();
    DaoArea daoArea= new DaoArea();
    FachadaBD fachada;
    
    public FormReportes() {
        initComponents();
        fachada = new FachadaBD();
        
        DefaultComboBoxModel Areas;
        Areas = new DefaultComboBoxModel();
        controlarea.Select_nombrearea(Areas);
        this.Areas.setModel(Areas);
        
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/Images/clinic-history.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        ReporteEmpleadosArea.setIcon(img1);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReporteEmpleadosArea = new javax.swing.JButton();
        Areas = new javax.swing.JComboBox<>();

        ReporteEmpleadosArea.setText("Listar empleados por area");
        ReporteEmpleadosArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteEmpleadosAreaActionPerformed(evt);
            }
        });

        Areas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Areas" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReporteEmpleadosArea, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReporteEmpleadosArea)
                    .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReporteEmpleadosAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteEmpleadosAreaActionPerformed
       JasperReport jr = null;
        String archivo="C:\\Users\\Juan David\\Documents\\git\\BD_Proyecto\\Proyecto_BD\\src\\Informes\\EmpleadosPorArea.jasper";
        try {
            Map parametro = new HashMap();

            parametro.put("area", Areas.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte empleados por area");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReporteEmpleadosAreaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Areas;
    private javax.swing.JButton ReporteEmpleadosArea;
    // End of variables declaration//GEN-END:variables
}
