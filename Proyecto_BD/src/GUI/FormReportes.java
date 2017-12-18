/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AccesoDatos.DaoArea;
import AccesoDatos.DaoMedico;
import AccesoDatos.DaoPaciente;
import AccesoDatos.FachadaBD;
import Controlador.ControladorArea;
import Controlador.ControladorMedico;
import Controlador.ControladorPaciente;
import Logica.Medico;
import Logica.Paciente;
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
    ControladorMedico controlMedico = new ControladorMedico();
    ControladorPaciente controlPaciente = new ControladorPaciente();
    DaoMedico daoMedico = new DaoMedico();
    DaoArea daoArea= new DaoArea();
    DaoPaciente daoPaciente = new DaoPaciente();
    FachadaBD fachada;
    
    public FormReportes() {
        initComponents();
        fachada = new FachadaBD();
        
        DefaultComboBoxModel Areas;
        Areas = new DefaultComboBoxModel();
        controlarea.Select_nombrearea(Areas);
        this.Areas.setModel(Areas);
        
        DefaultComboBoxModel Medicos; 
        Medicos = new DefaultComboBoxModel();
        controlMedico.Select_idmedios(Medicos);
        this.Medicos.setModel(Medicos);

        DefaultComboBoxModel Pacientes; 
        Pacientes = new DefaultComboBoxModel();
        controlPaciente.Select_idpaciente(Pacientes);
        this.Pacientes.setModel(Pacientes);
        
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
        Medicos = new javax.swing.JComboBox<>();
        Meses = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AgendaPorMes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CitasAtendidasMes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Pacientes = new javax.swing.JComboBox<>();
        HistoriaClinica = new javax.swing.JButton();
        CostoCitasMes = new javax.swing.JButton();
        CostoCitasAno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Anos = new javax.swing.JComboBox<>();
        CostoMedicamentosMes = new javax.swing.JButton();
        CostoMedicamentosAno = new javax.swing.JButton();

        ReporteEmpleadosArea.setText("Listar empleados por area");
        ReporteEmpleadosArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteEmpleadosAreaActionPerformed(evt);
            }
        });

        Areas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Areas" }));
        Areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreasActionPerformed(evt);
            }
        });

        Medicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicosActionPerformed(evt);
            }
        });

        Meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesesActionPerformed(evt);
            }
        });

        jLabel1.setText("Medico:");

        jLabel2.setText("Mes:");

        AgendaPorMes.setText("Agenda médica del mes");
        AgendaPorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaPorMesActionPerformed(evt);
            }
        });

        jLabel3.setText("Areas:");

        CitasAtendidasMes.setText("Citas atendidas en el mes");
        CitasAtendidasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasAtendidasMesActionPerformed(evt);
            }
        });

        jLabel4.setText("Paciente:");

        Pacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacientesActionPerformed(evt);
            }
        });

        HistoriaClinica.setText("Mostrar historia clínica");
        HistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoriaClinicaActionPerformed(evt);
            }
        });

        CostoCitasMes.setText("Costo Promedio citas mes");
        CostoCitasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoCitasMesActionPerformed(evt);
            }
        });

        CostoCitasAno.setText("Costo promedio citas año");
        CostoCitasAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoCitasAnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Año:");

        Anos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022" }));

        CostoMedicamentosMes.setText("Costo promedio medicamentos mes");
        CostoMedicamentosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoMedicamentosMesActionPerformed(evt);
            }
        });

        CostoMedicamentosAno.setText("Costo promedio medicamentos año");
        CostoMedicamentosAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoMedicamentosAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(ReporteEmpleadosArea, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(Meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(179, 179, 179)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgendaPorMes)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(Anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(CitasAtendidasMes))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(HistoriaClinica))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CostoCitasAno)
                            .addComponent(CostoMedicamentosAno))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CostoMedicamentosMes)
                            .addComponent(CostoCitasMes))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteEmpleadosArea))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendaPorMes)
                    .addComponent(CitasAtendidasMes))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoriaClinica))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoCitasAno)
                    .addComponent(CostoCitasMes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoMedicamentosAno)
                    .addComponent(CostoMedicamentosMes))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void HistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoriaClinicaActionPerformed
               JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Documents\\GitHub\\BD_Proyecto\\Proyecto_BD\\src\\Informes\\HistoriaClinica.jasper";
        try {
            Map parametro = new HashMap();
            parametro.put("id_paciente", Pacientes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Historia clinica del paciente");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_HistoriaClinicaActionPerformed

    private void ReporteEmpleadosAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteEmpleadosAreaActionPerformed
       JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Documents\\GitHub\\BD_Proyecto\\Proyecto_BD\\src\\Informes\\EmpleadosPorArea.jasper";
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

    private void AreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreasActionPerformed

    private void AgendaPorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaPorMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Documents\\GitHub\\BD_Proyecto\\Proyecto_BD\\src\\Informes\\AgendaMedicaMes.jasper";
        try {

            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("mes",Meses.getSelectedItem().toString());
            map.put("id_medico",Medicos.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Agenda de medico por mes");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AgendaPorMesActionPerformed

    private void MedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicosActionPerformed

    private void CitasAtendidasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasAtendidasMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Documents\\GitHub\\BD_Proyecto\\Proyecto_BD\\src\\Informes\\CitasAtendidasMes.jasper";
        try {

            HashMap<String, Object> mapa = new HashMap<String, Object>();
            mapa.put("mes",Meses.getSelectedItem().toString());
            mapa.put("id_medico",Medicos.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, mapa, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Citas atendidas por mes");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CitasAtendidasMesActionPerformed

    private void MesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesesActionPerformed

    private void PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PacientesActionPerformed

    private void CostoCitasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoCitasMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Leidy\\OneDrive\\Documents\\BD_Proyecto1\\Proyecto_BD\\src\\Informes\\CostoCitasMes.jasper";
        try {
            HashMap<String, Object> maps = new HashMap<String, Object>();
            maps.put("mes",Meses.getSelectedItem().toString());
            maps.put("id_paciente",Pacientes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, maps, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Costo en citas por mes");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CostoCitasMesActionPerformed

    private void CostoCitasAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoCitasAnoActionPerformed
       JasperReport jr = null;
        String archivo="C:\\Users\\Leidy\\OneDrive\\Documents\\BD_Proyecto1\\Proyecto_BD\\src\\Informes\\CostoCitasAno.jasper";
        try {
            HashMap<String, Object> mapis = new HashMap<String, Object>();
            mapis.put("ano",Anos.getSelectedItem().toString());
            mapis.put("id_paciente",Pacientes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, mapis, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Costo en citas por año");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CostoCitasAnoActionPerformed

    private void CostoMedicamentosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoMedicamentosMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Leidy\\OneDrive\\Documents\\BD_Proyecto1\\Proyecto_BD\\src\\Informes\\CostoMedicamentosMes.jasper";
        try {
            HashMap<String, Object> mapiss = new HashMap<String, Object>();
            mapiss.put("mes",Meses.getSelectedItem().toString());
            mapiss.put("id_paciente",Pacientes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, mapiss, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Costo en medicamentos por mes");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CostoMedicamentosMesActionPerformed

    private void CostoMedicamentosAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoMedicamentosAnoActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Leidy\\OneDrive\\Documents\\BD_Proyecto1\\Proyecto_BD\\src\\Informes\\CostoMedicamentosPorAno.jasper";
        try {
            HashMap<String, Object> mapiss = new HashMap<String, Object>();
            mapiss.put("ano",Anos.getSelectedItem().toString());
            mapiss.put("id_paciente",Pacientes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, mapiss, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Costo en medicamentos por año");
        } catch (JRException ex) {
            Logger.getLogger(FormReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CostoMedicamentosAnoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendaPorMes;
    private javax.swing.JComboBox<String> Anos;
    private javax.swing.JComboBox<String> Areas;
    private javax.swing.JButton CitasAtendidasMes;
    private javax.swing.JButton CostoCitasAno;
    private javax.swing.JButton CostoCitasMes;
    private javax.swing.JButton CostoMedicamentosAno;
    private javax.swing.JButton CostoMedicamentosMes;
    private javax.swing.JButton HistoriaClinica;
    private javax.swing.JComboBox<String> Medicos;
    private javax.swing.JComboBox<String> Meses;
    private javax.swing.JComboBox<String> Pacientes;
    private javax.swing.JButton ReporteEmpleadosArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
