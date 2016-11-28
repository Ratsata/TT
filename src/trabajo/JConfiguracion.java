package trabajo;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class JConfiguracion extends javax.swing.JFrame {
    private String contraseñaNueva;
    private String contraseñaMaestra;
    private Conexion BD = new Conexion();
    private ResultSet rs;
    private String msj;
    private Boolean swContraseña = false;
    private Boolean swCerrarAño = false;
    
    public JConfiguracion() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/settings.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmarContraseña = new javax.swing.JDialog();
        lblContraseña1 = new javax.swing.JLabel();
        lblContraseñaAnt = new javax.swing.JLabel();
        lblContraseñaAnt2 = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JPasswordField();
        txtContraseñaActual2 = new javax.swing.JPasswordField();
        btnContraseñaAceptar = new javax.swing.JButton();
        btnContraseñaCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        lblNewContraseña = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseñaNueva = new javax.swing.JPasswordField();
        lblCerrar = new javax.swing.JLabel();
        btnCerrarAño = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        confirmarContraseña.setTitle("Ingrese contraseña");
        confirmarContraseña.setMaximumSize(new java.awt.Dimension(330, 160));
        confirmarContraseña.setMinimumSize(new java.awt.Dimension(330, 160));
        confirmarContraseña.setModal(true);
        confirmarContraseña.setModalExclusionType(null);
        confirmarContraseña.setResizable(false);

        lblContraseña1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContraseña1.setText("Ingrese contraseña actual");

        lblContraseñaAnt.setText("Contraseña Antigua");

        lblContraseñaAnt2.setText("Repita Contraseña");

        btnContraseñaAceptar.setText("Aceptar");
        btnContraseñaAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaAceptarActionPerformed(evt);
            }
        });

        btnContraseñaCancelar.setText("Cancelar");
        btnContraseñaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmarContraseñaLayout = new javax.swing.GroupLayout(confirmarContraseña.getContentPane());
        confirmarContraseña.getContentPane().setLayout(confirmarContraseñaLayout);
        confirmarContraseñaLayout.setHorizontalGroup(
            confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseña1)
                    .addGroup(confirmarContraseñaLayout.createSequentialGroup()
                        .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContraseñaAnt)
                            .addComponent(lblContraseñaAnt2))
                        .addGap(18, 18, 18)
                        .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseñaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtContraseñaActual2))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmarContraseñaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContraseñaAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnContraseñaCancelar)
                .addContainerGap())
        );
        confirmarContraseñaLayout.setVerticalGroup(
            confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseñaAnt)
                    .addComponent(txtContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseñaAnt2)
                    .addComponent(txtContraseñaActual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(confirmarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContraseñaCancelar)
                    .addComponent(btnContraseñaAceptar))
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 370));
        setMinimumSize(new java.awt.Dimension(500, 370));
        setPreferredSize(new java.awt.Dimension(500, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 370));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 370));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        lblTitulo.setText("Opciones");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContraseña.setText("Cambiar Contraseña");

        lblNewContraseña.setText("Nueva contraseña:");

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCerrar.setText("Cerrar año");

        btnCerrarAño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_error.png"))); // NOI18N
        btnCerrarAño.setText("Cerrar año escolar");
        btnCerrarAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAñoActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCerrar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContraseña)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(lblNewContraseña)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCambiar))))
                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnCerrarAño)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewContraseña)
                    .addComponent(btnCambiar)
                    .addComponent(txtContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar)
                .addGap(21, 21, 21)
                .addComponent(btnCerrarAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAñoActionPerformed
        confirmarContraseña.setLocationRelativeTo(null);
        txtContraseñaActual.setText("");
        txtContraseñaActual2.setText("");
        confirmarContraseña.setVisible(true);
    }//GEN-LAST:event_btnCerrarAñoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jfMenu menu = new jfMenu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        confirmarContraseña.setLocationRelativeTo(null);
        txtContraseñaActual.setText("");
        txtContraseñaActual2.setText("");
        if (!swContraseña){
            try{
                BD.crearConexion();
                String sql = "SELECT contraseñaMaestra FROM contraseña";
                rs = BD.ejecutarSQLSelect(sql);
                if (rs.next()){
                    contraseñaMaestra = rs.getString("contraseñaMaestra");
                }
                BD.cerrarConexion();

                confirmarContraseña.setVisible(true);

            }catch (Exception e){
                msj = "Error, hubo un problema.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);            
            }
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        jfMenu menu = new jfMenu(contraseñaNueva);
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnContraseñaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseñaCancelarActionPerformed
        confirmarContraseña.hide();
    }//GEN-LAST:event_btnContraseñaCancelarActionPerformed

    private void btnContraseñaAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseñaAceptarActionPerformed
        if (txtContraseñaActual.getText().equals(txtContraseñaActual2.getText())){
            if (txtContraseñaActual.getText().equals(contraseñaMaestra)){
                swContraseña = true;
                contraseñaNueva = txtContraseñaNueva.getText();
                contraseñaMaestra = contraseñaNueva;
                confirmarContraseña.hide();
            }else{
                msj = "Error, contraseña incorrecta.";
                JOptionPane.showMessageDialog(confirmarContraseña, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            msj = "Error, las contraseñas no coinciden.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContraseñaAceptarActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarAño;
    private javax.swing.JButton btnContraseñaAceptar;
    private javax.swing.JButton btnContraseñaCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JDialog confirmarContraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseñaAnt;
    private javax.swing.JLabel lblContraseñaAnt2;
    private javax.swing.JLabel lblNewContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtContraseñaActual;
    private javax.swing.JPasswordField txtContraseñaActual2;
    private javax.swing.JPasswordField txtContraseñaNueva;
    // End of variables declaration//GEN-END:variables
}
