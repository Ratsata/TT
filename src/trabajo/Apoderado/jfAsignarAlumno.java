package trabajo.Apoderado;

import clases.Conexion;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfAsignarAlumno extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private Rut rut;
    String rut_persona;
    String rut_alumno;
    String parentesco;
    String apoderado;
    String sostenedor;
    
    public jfAsignarAlumno() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblRutPersona = new javax.swing.JLabel();
        txtRutPersona = new javax.swing.JTextField();
        txtNomPersona = new javax.swing.JTextField();
        lblRutAlu = new javax.swing.JLabel();
        lblNomPersona = new javax.swing.JLabel();
        lblNomAlu = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        chkApoderado = new javax.swing.JCheckBox();
        chkSostenedor = new javax.swing.JCheckBox();
        lblParentesco = new javax.swing.JLabel();
        cmbParentesco = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        txtNomAlu = new javax.swing.JTextField();
        txtRutAlu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(415, 330));
        setMinimumSize(new java.awt.Dimension(415, 330));
        setPreferredSize(new java.awt.Dimension(415, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(415, 330));
        jPanel1.setMinimumSize(new java.awt.Dimension(415, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(415, 330));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblRutPersona.setText("Ingrese Rut Apoderado/Sostenedor");

        txtRutPersona.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRutPersonaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutPersonaFocusLost(evt);
            }
        });
        txtRutPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutPersonaKeyReleased(evt);
            }
        });

        txtNomPersona.setEditable(false);

        lblRutAlu.setText("Ingrese Rut Alumno");

        lblNomPersona.setText("Nombre de la persona:");

        lblNomAlu.setText("Nombre del alumno:");

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        chkApoderado.setText("Apoderado");

        chkSostenedor.setText("Sostenedor");

        lblParentesco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblParentesco.setText("Parentesco:");

        cmbParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Hermano", "Tio", "Tia" }));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        lblTitulo.setText("Asignar Alumno");

        txtNomAlu.setEditable(false);

        txtRutAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRutAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutAluFocusLost(evt);
            }
        });
        txtRutAlu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutAluKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulo)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNomPersona)
                                        .addComponent(lblRutPersona)
                                        .addComponent(lblRutAlu)
                                        .addComponent(lblNomAlu)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRutPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRutAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addComponent(btnAsignar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(chkApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSostenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblParentesco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutPersona)
                    .addComponent(txtRutPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomPersona)
                    .addComponent(txtNomPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutAlu)
                    .addComponent(txtRutAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomAlu)
                    .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkApoderado)
                    .addComponent(chkSostenedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParentesco)
                    .addComponent(cmbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 415, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null)
        {BD.cerrarConexion();}
        this.dispose();
        new jfApoderado().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtRutPersonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutPersonaKeyReleased
        try{
            String RutFormateado = rut.formatear(txtRutPersona.getText());
            String RutDesformateado = rut.desformatear(RutFormateado);
            String sql = "SELECT nombres FROM persona WHERE rut_persona = '"+ RutDesformateado +"'";
            rs = BD.ejecutarSQLSelect(sql);
            txtNomPersona.setText("");
            while (rs.next()){
                txtNomPersona.setText(rs.getString("nombres"));
            }
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_txtRutPersonaKeyReleased

    private void txtRutPersonaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutPersonaFocusGained
        try{
            BD.crearConexion();
        }catch (Exception e){
            msj = "No se pudo conectar a la Base de Datos";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutPersonaFocusGained

    private void txtRutPersonaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutPersonaFocusLost
        try{
            BD.cerrarConexion();
        }catch (Exception e){
            msj = "No se pudo conectar a la Base de Datos";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutPersonaFocusLost

    private void txtRutAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutAluFocusGained
        try{
            BD.crearConexion();
        }catch (Exception e){
            msj = "No se pudo conectar a la Base de Datos";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutAluFocusGained

    private void txtRutAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutAluFocusLost
        try{
            BD.cerrarConexion();
        }catch (Exception e){
            msj = "No se pudo conectar a la Base de Datos";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutAluFocusLost

    private void txtRutAluKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutAluKeyReleased
         try{
            String RutFormateado = rut.formatear(txtRutAlu.getText());
            String RutDesformateado = rut.desformatear(RutFormateado);
            String sql = "SELECT nombres FROM alumno WHERE rut_alumno = '"+ RutDesformateado +"'";            rs = BD.ejecutarSQLSelect(sql);
            txtNomAlu.setText("");
            while (rs.next()){
                txtNomAlu.setText(rs.getString("nombres"));
            }
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_txtRutAluKeyReleased

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try{
            BD.crearConexion();
            String coma = "','";
            
            rut_persona = txtRutPersona.getText();
            rut_alumno = txtRutAlu.getText();
            parentesco = String.valueOf(cmbParentesco.getSelectedItem());
            if (chkApoderado.isSelected()){
                apoderado = "S";
            }else{
                apoderado = "N";
            }
            if (chkSostenedor.isSelected()){
                sostenedor = "S";
            }else{
                apoderado = "N";
            }
            String sql = "INSERT INTO relacion_persona_alumno(rut_persona,rut_alumno,parentesco,apoderado,sostenedor) VALUES ('" + rut_persona + coma + rut_alumno + coma + parentesco + coma + apoderado + coma + sostenedor +"')";
            if (BD.ejecutarSQL(sql)){
                msj = "Se realizó la asociación con éxito.";
                JOptionPane.showMessageDialog(null,msj,"Éxito",JOptionPane.INFORMATION_MESSAGE);
            }else{
                msj = "Ya existe esta asociacion entre persona y alumno.";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e){
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarActionPerformed


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
            java.util.logging.Logger.getLogger(jfAsignarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAsignarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAsignarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAsignarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAsignarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkApoderado;
    private javax.swing.JCheckBox chkSostenedor;
    private javax.swing.JComboBox<String> cmbParentesco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNomAlu;
    private javax.swing.JLabel lblNomPersona;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblRutAlu;
    private javax.swing.JLabel lblRutPersona;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNomAlu;
    private javax.swing.JTextField txtNomPersona;
    private javax.swing.JTextField txtRutAlu;
    private javax.swing.JTextField txtRutPersona;
    // End of variables declaration//GEN-END:variables
}
