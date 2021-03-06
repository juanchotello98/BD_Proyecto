/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorMedico;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy
 */
public class InterfazLogin extends javax.swing.JFrame {
    ControladorMedico controlmedico =new ControladorMedico();
    /**
     * Creates new form InterfazLogin
     */
    public InterfazLogin() {
        initComponents();
        
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/Images/hospital.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(LabelImagen.getWidth(),LabelImagen.getHeight(), Image.SCALE_DEFAULT));
        LabelImagen.setIcon(img1);
        
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/Images/shirt.png"));
        Icon img2 = new ImageIcon(imagen2.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        LabelUsuario.setIcon(img2);
        
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/Images/eye.png"));
        Icon img3 = new ImageIcon(imagen3.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        LabelContraseña.setIcon(img3);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGrande = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelImagen = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        Contrasena = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelGrande.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ClinicalSystem");

        LabelImagen.setText("ImagenHospital");

        LabelUsuario.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuario:");

        LabelContraseña.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña.setText("Contraseña:");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });

        Entrar.setBackground(new java.awt.Color(255, 255, 255));
        Entrar.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Entrar.setForeground(new java.awt.Color(0, 102, 153));
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGrandeLayout = new javax.swing.GroupLayout(PanelGrande);
        PanelGrande.setLayout(PanelGrandeLayout);
        PanelGrandeLayout.setHorizontalGroup(
            PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrandeLayout.createSequentialGroup()
                .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGrandeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGrandeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGrandeLayout.createSequentialGroup()
                                .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Entrar)
                                    .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelGrandeLayout.setVerticalGroup(
            PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrandeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Entrar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        String account = usuario.getText();
        String password;
        password = Contrasena.getText();
        
        if (!controlmedico.Select_contrasena(account, password)) {
            JOptionPane.showMessageDialog(null, "Datos invalidos.");
            Contrasena.setText("");
            usuario.setText("");
            //JOptionPane.showMessageDialog(null, "Bienvenido a LOSY.");
            //select_interface(control.check_position(password, code));
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido a que te importa.com.");
            if(account.equals("11441122")){
                InterfazAdministrador gui = new InterfazAdministrador();
                gui.setVisible(true);
                dispose();
            }else{
                InterfazMedico medico = new InterfazMedico(account);
                medico.setVisible(true);
                dispose();
            }
            
            
        }
    }//GEN-LAST:event_EntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelGrande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private InterfazAdministrador InterfazAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
